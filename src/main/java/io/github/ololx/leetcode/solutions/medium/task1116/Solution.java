package io.github.ololx.leetcode.solutions.medium.task1116;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntConsumer;

/**
 * 1116. Print Zero Even Odd
 *
 * You have a function printNumber that can be called with an integer parameter
 * and prints it to the console.
 * <ul>
 *     <lo>
 *         For example, calling printNumber(7) prints 7 to the console.
 *     </lo>
 * </ul>
 *
 * You are given an instance of the class ZeroEvenOdd that has three functions:
 * zero, even, and odd. The same instance of ZeroEvenOdd will be passed to three different threads:
 * <ul>
 *     <lo>
 *         Thread A: calls zero() that should only output 0's.
 *     </lo>
 *     <lo>
 *         Thread B: calls even() that should only output even numbers.
 *     </lo>
 *     <lo>
 *         Thread C: calls odd() that should only output odd numbers.
 *     </lo>
 * </ul>
 *
 * Modify the given class to output the series "010203040506..." where the
 * length of the series must be 2n.
 *
 * Implement the ZeroEvenOdd class:
 * <ul>
 *     <lo>
 *         ZeroEvenOdd(int n) Initializes the object with the number n that represents
 *         the numbers that should be printed.
 *     </lo>
 *     <lo>
 *         void zero(printNumber) Calls printNumber to output one zero.
 *     </lo>
 *     <lo>
 *         void even(printNumber) Calls printNumber to output one even number.
 *     </lo>
 *     <lo>
 *         void odd(printNumber) Calls printNumber to output one odd number.
 *     </lo>
 * </ul>
 *
 * Example 1:
 * <p>Input: n = 2
 * Output: "0102"
 * Explanation: There are three threads being fired asynchronously.
 * One of them calls zero(), the other calls even(), and the last one calls odd().
 * "0102" is the correct output.</p>
 *
 * Example 2:
 * <p>Input: n = 5
 * Output: "0102030405"</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= n <= 1000
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 17.07.2022 17:23
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public static class ZeroEvenOdd {

        private final Semaphore zero = new Semaphore(1);

        private final Semaphore even = new Semaphore(0);

        private final Semaphore odd = new Semaphore(0);

        private final AtomicBoolean isOddNext = new AtomicBoolean(true);

        private final int n;

        public ZeroEvenOdd(int n) {
            this.n = n;
        }

        // printNumber.accept(x) outputs "x", where x is an integer.
        public void zero(IntConsumer printNumber) throws InterruptedException {
            for (int zeroIndex = 0; zeroIndex < this.n; zeroIndex++) {
                zero.acquire();
                printNumber.accept(0);

                if (isOddNext.get()) {
                    odd.release();
                } else {
                    even.release();
                }
            }
        }

        public void even(IntConsumer printNumber) throws InterruptedException {
            for (int evenIndex = 2; evenIndex <= this.n; evenIndex += 2) {
                even.acquire();
                printNumber.accept(evenIndex);
                isOddNext.set(true);
                zero.release();
            }
        }

        public void odd(IntConsumer printNumber) throws InterruptedException {
            for (int oddIndex = 1; oddIndex <= this.n; oddIndex += 2) {
                odd.acquire();
                printNumber.accept(oddIndex);
                isOddNext.set(false);
                zero.release();
            }
        }
    }
}
