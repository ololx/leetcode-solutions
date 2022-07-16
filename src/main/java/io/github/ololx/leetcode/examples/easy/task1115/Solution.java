package io.github.ololx.leetcode.examples.easy.task1115;

import java.util.concurrent.Semaphore;

/**
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
