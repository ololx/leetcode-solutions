package io.github.ololx.leetcode.solutions.easy.task1114;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 1114. Print in Order
 *
 * Suppose we have a class:
 * <p>public class Foo {
 *   public void first() { print("first"); }
 *   public void second() { print("second"); }
 *   public void third() { print("third"); }
 * }</p>
 *
 * The same instance of Foo will be passed to three different threads.
 * Thread A will call first(), thread B will call second(),
 * and thread C will call third(). Design a mechanism and modify
 * the program to ensure that second() is executed after first(),
 * and third() is executed after second().
 *
 * Note:
 * <p>We do not know how the threads will be scheduled in the operating system,
 * even though the numbers in the input seem to imply the ordering.
 * The input format you see is mainly to ensure our tests' comprehensiveness.</p>
 *
 * Example 1:
 * <p>Input: nums = [1,2,3]
 * Output: "firstsecondthird"
 * Explanation: There are three threads being fired asynchronously.
 * The input [1,2,3] means thread A calls first(), thread B calls second(),
 * and thread C calls third(). "firstsecondthird" is the correct output.</p>
 *
 * Example 2:
 * <p>Input: nums = [1,3,2]
 * Output: "firstsecondthird"
 * Explanation: The input [1,3,2] means thread A calls first(),
 * thread B calls third(), and thread C calls second().
 * "firstsecondthird" is the correct output.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          nums is a permutation of [1, 2, 3].
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 11.07.2022 11:57
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public static class Foo {

        private final AtomicInteger step;

        public Foo() {
            this.step = new AtomicInteger(1);
        }

        public void first(Runnable printFirst) throws InterruptedException {
            while (this.step.get() != 1) {}

            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            this.step.incrementAndGet();
        }

        public void second(Runnable printSecond) throws InterruptedException {
            while (this.step.get() != 2) {}

            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            this.step.incrementAndGet();
        }

        public void third(Runnable printThird) throws InterruptedException {
            while (this.step.get() != 3) {}

            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
            this.step.incrementAndGet();
        }
    }
}
