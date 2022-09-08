package io.github.ololx.leetcode.solutions.medium.task1195;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

/**
 * 1195. Fizz Buzz Multithreaded
 *
 * You have the four functions:
 * <ul>
 *     <lo>
 *         printFizz that prints the word "fizz" to the console,
 *     </lo>
 *     <lo>
 *         printBuzz that prints the word "buzz" to the console,
 *     </lo>
 *     <lo>
 *         printFizzBuzz that prints the word "fizzbuzz" to the console, and
 *     </lo>
 *     <lo>
 *         printNumber that prints a given integer to the console.
 *     </lo>
 * </ul>
 *
 * You are given an instance of the class FizzBuzz that has four functions:
 * fizz, buzz, fizzbuzz and number. The same instance of FizzBuzz will be
 * passed to four different threads:
 * <ul>
 *     <lo>
 *         Thread A: calls fizz() that should output the word "fizz".
 *     </lo>
 *     <lo>
 *         Thread B: calls buzz() that should output the word "buzz".
 *     </lo>
 *     <lo>
 *         Thread C: calls fizzbuzz() that should output the word "fizzbuzz".
 *     </lo>
 *     <lo>
 *         Thread D: calls number() that should only output the integers.
 *     </lo>
 * </ul>
 *
 * Modify the given class to output the series [1, 2, "fizz", 4, "buzz", ...]
 * where the ith token (1-indexed) of the series is:
 * <ul>
 *     <lo>
 *         "fizzbuzz" if i is divisible by 3 and 5,
 *     </lo>
 *     <lo>
 *         "fizz" if i is divisible by 3 and not 5,
 *     </lo>
 *     <lo>
 *         "buzz" if i is divisible by 5 and not 3, or
 *     </lo>
 *     <lo>
 *         i if i is not divisible by 3 or 5.
 *     </lo>
 * </ul>
 *
 * Implement the FizzBuzz class:
 * <ul>
 *     <lo>
 *         FizzBuzz(int n) Initializes the object with the number n that represents
 *         the length of the sequence that should be printed.
 *     </lo>
 *     <lo>
 *         void fizz(printFizz) Calls printFizz to output "fizz".
 *     </lo>
 *     <lo>
 *         void buzz(printBuzz) Calls printBuzz to output "buzz".
 *     </lo>
 *     <lo>
 *         void fizzbuzz(printFizzBuzz) Calls printFizzBuzz to output "fizzbuzz".
 *     </lo>
 *     <lo>
 *         void number(printNumber) Calls printnumber to output the numbers.
 *     </lo>
 * </ul>
 *
 * Example 1:
 * <p>Input: n = 15
 * Output: [1,2,"fizz",4,"buzz","fizz",7,8,"fizz","buzz",11,"fizz",13,14,"fizzbuzz"]</p>
 *
 * Example 2:
 * <p>Input: n = 5
 * Output: [1,2,"fizz",4,"buzz"]</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= n <= 50
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 17.07.2022 17:37
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public static class FizzBuzz {

        Semaphore fizzSemaphore = new Semaphore(0);

        Semaphore buzzSemaphore = new Semaphore(0);

        Semaphore fizzBuzzSemaphore = new Semaphore(0);

        Semaphore numberSemaphore = new Semaphore(1);

        private int n;

        public FizzBuzz(int n) {
            this.n = n;
        }

        // printFizz.run() outputs "fizz".
        public void fizz(Runnable printFizz) throws InterruptedException {
            for (int number = 3; number <= n; number += 3) {
                if (number % 5 == 0) {
                    continue;
                }

                fizzSemaphore.acquire();
                printFizz.run();
                numberSemaphore.release();
            }
        }

        // printBuzz.run() outputs "buzz".
        public void buzz(Runnable printBuzz) throws InterruptedException {
            for (int number = 5; number <= n; number += 5) {
                if (number % 3 == 0) {
                    continue;
                }

                buzzSemaphore.acquire();
                printBuzz.run();
                numberSemaphore.release();
            }
        }

        // printFizzBuzz.run() outputs "fizzbuzz".
        public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
            for (int number = 15; number <= n; number += 15) {
                fizzBuzzSemaphore.acquire();
                printFizzBuzz.run();
                numberSemaphore.release();
            }
        }

        // printNumber.accept(x) outputs "x", where x is an integer.
        public void number(IntConsumer printNumber) throws InterruptedException {
            for (int number = 1; number <= n; number++) {
                numberSemaphore.acquire();

                if (number % 15 == 0) {
                    fizzBuzzSemaphore.release();
                } else if (number % 3 == 0) {
                    fizzSemaphore.release();
                } else if (number % 5 == 0) {
                    buzzSemaphore.release();
                } else {
                    printNumber.accept(number);
                    numberSemaphore.release();
                }
            }
        }
    }
}
