package io.github.ololx.leetcode.solutions.medium.task2166;

import java.util.stream.IntStream;

/**
 * project leetcode-solutions
 * created 17.03.2023 13:48
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public static class Bitset {

        private static final int WORD_SIZE = 64;

        private static final int WORD_LSB = 0;

        private static final int WORD_MSB = 63;

        private final int size;

        private final long[] words;

        public Bitset(int size) {
            this.size = size;
            this.words = new long[((size / WORD_SIZE) + (size % WORD_SIZE == 0 ? 0 : 1))];
        }

        public int size() {
            return this.size;
        }

        public int words() {
            return this.words.length;
        }

        public void fix(int idx) {
            words[idx / WORD_SIZE] |= 1L << (idx % WORD_SIZE);
        }

        public void unfix(int idx) {
            words[idx / WORD_SIZE] &= ~(1L << (idx % WORD_SIZE));
        }

        public void flip() {
            IntStream.range(0, words.length)
                    .forEach(index -> words[index] = ~words[index]);
        }

        public boolean all() {
            for (int i = 0; i < words.length - 1; i++) {
                if (!((((words[i] + 1) & words[i]) == 0) && words[i] != 0)) {
                    return false;
                }
            }

            for (int currentDigit = 0; currentDigit <= (size - 1) % WORD_SIZE; currentDigit++) {
                if ((0x1 & (words[words.length - 1] >> currentDigit)) == 0x0) {
                    return false;
                }
            }

            return true;
        }

        public boolean one() {
            for (int i = 0; i < words.length - 1; i++) {
                for (int currentDigit = 0; currentDigit < 64; currentDigit++) {
                    if ((0x1 & (words[i] >> currentDigit)) == 0x1) {
                        return true;
                    }
                }
            }

            for (int currentDigit = 0; currentDigit <= (size - 1) % WORD_SIZE; currentDigit++) {
                if ((0x1 & (words[words.length - 1] >> currentDigit)) == 0x1) {
                    return true;
                }
            }

            return false;
        }

        public int count() {
            int weight = 0;
            for (int i = 0; i < words.length - 1; i++) {
                weight += hammingWeight(words[i], 63);
            }

            weight += hammingWeight(words[words.length - 1], (size - 1) % WORD_SIZE);

            return weight;
        }

        private int hammingWeight(long word, int size) {
            int weight = 0;
            for (int currentDigit = 0; currentDigit <= size; currentDigit++) {
                weight += 0x1 & (word >> currentDigit);
            }

            return weight;
        }

        public String toString() {
            StringBuilder bitesetStr = new StringBuilder();
            for (int i = 0; i < words.length - 1; i++) {
                bitesetStr.append(toString(words[i], 63));
            }

            bitesetStr.append(toString(words[words.length - 1], (size - 1) % WORD_SIZE));

            return bitesetStr.toString();
        }

        private String toString(long word, int size) {
           StringBuilder wordStr = new StringBuilder();
           for (int currentDigit = 0; currentDigit <= size; currentDigit++) {
               wordStr.append(0x1 & (word >> currentDigit));
           }

            return wordStr.toString();
        }
    }
}
