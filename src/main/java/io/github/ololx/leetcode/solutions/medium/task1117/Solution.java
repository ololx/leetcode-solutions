package io.github.ololx.leetcode.solutions.medium.task1117;

import java.util.concurrent.Semaphore;

/**
 * 1117. Building H2O
 *
 * There are two kinds of threads: oxygen and hydrogen. Your goal is to group
 * these threads to form water molecules.
 *
 * There is a barrier where each thread has to wait until a complete molecule
 * can be formed. Hydrogen and oxygen threads will be given releaseHydrogen and
 * releaseOxygen methods respectively, which will allow them to pass the barrier.
 * These threads should pass the barrier in groups of three, and they must immediately
 * bond with each other to form a water molecule. You must guarantee that all
 * the threads from one molecule bond before any other threads from the next molecule do.
 *
 * In other words:
 * <ol>
 *     <li>If an oxygen thread arrives at the barrier when no hydrogen threads are present,
 *     it must wait for two hydrogen threads.</li>
 *     <li>If a hydrogen thread arrives at the barrier when no other threads are present,
 *     it must wait for an oxygen thread and another hydrogen thread.</li>
 * </ol>
 *
 * Example 1:
 * <p>Input: water = "HOH"
 * Output: "HHO"
 * Explanation: "HOH" and "OHH" are also valid answers.</p>
 *
 * Example 2:
 * <p>Input: water = "OOHHHH"
 * Output: "HHOHHO"
 * Explanation: "HOHHHO", "OHHHHO", "HHOHOH", "HOHHOH", "OHHHOH",
 * "HHOOHH", "HOHOHH" and "OHHOHH" are also valid answers.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *         3 * n == water.length
 *      </li>
 *      <li>
 *         1 <= n <= 20
 *      </li>
 *      <li>
 *         water[i] is either 'H' or 'O'.
 *      </li>
 *      <li>
 *         There will be exactly 2 * n 'H' in water.
 *      </li>
 *      <li>
 *         There will be exactly n 'O' in water.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 10.06.2023 14:52
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    static class H2O {

        private final Semaphore hydrogenSemaphore;
        private final Semaphore oxygenSemaphore;

        public H2O() {
            hydrogenSemaphore = new Semaphore(2);
            oxygenSemaphore = new Semaphore(0);
        }

        public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
            hydrogenSemaphore.acquire();

            // releaseHydrogen.run() outputs "H". Do not change or remove this line.
            releaseHydrogen.run();

            oxygenSemaphore.release();
        }

        public void oxygen(Runnable releaseOxygen) throws InterruptedException {
            oxygenSemaphore.acquire(2);

            // releaseOxygen.run() outputs "O". Do not change or remove this line.
            releaseOxygen.run();

            hydrogenSemaphore.release(2);
        }
    }
}
