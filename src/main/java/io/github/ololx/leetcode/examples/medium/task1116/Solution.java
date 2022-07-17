package io.github.ololx.leetcode.examples.medium.task1116;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntConsumer;

/**
 * 1116. Print Zero Even Odd
 *
 *
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

        private int n;

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
