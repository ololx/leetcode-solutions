package io.github.ololx.leetcode.solutions.medium.task1115;

import java.util.concurrent.Semaphore;

/**
 * 1115. Print FooBar Alternately
 *
 * Suppose you are given the following code:
 * <p>class FooBar {
 *   public void foo() {
 *     for (int i = 0; i < n; i++) {
 *       print("foo");
 *     }
 *   }
 *
 *   public void bar() {
 *     for (int i = 0; i < n; i++) {
 *       print("bar");
 *     }
 *   }
 * }</p>
 *
 * The same instance of FooBar will be passed to two different threads:
 * <ul>
 *     <ol>
 *         thread A will call foo(), while
 *     </ol>
 *     <ol>
 *         thread B will call bar().
 *     </ol>
 * </ul>
 * Modify the given program to output "foobar" n times.
 *
 * Example 1:
 * <p>Input: n = 1
 * Output: "foobar"
 * Explanation: There are two threads being fired asynchronously.
 * One of them calls foo(), while the other calls bar().
 * "foobar" is being output 1 time.</p>
 *
 * Example 2:
 * <p>Input: n = 2
 * Output: "foobarfoobar"
 * Explanation: "foobar" is being output 2 times.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= n <= 1000
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 16.07.2022 08:26
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public static class FooBar {

        private final Semaphore fooSemaphore = new Semaphore(1);

        private final Semaphore barSemaphore = new Semaphore(0);

        private int n;

        public FooBar(int n) {
            this.n = n;
        }

        public void foo(Runnable printFoo) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                fooSemaphore.acquire();
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                barSemaphore.release();
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                barSemaphore.acquire();
                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
                fooSemaphore.release();
            }
        }
    }
}
