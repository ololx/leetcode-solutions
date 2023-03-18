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
            IntStream.range(0, words.length).forEach(index -> words[index] = ~words[index]);
        }

        public boolean all() {
            return true;
        }

        public boolean one() {
            return true;
        }

        public int count() {
            return 0;
        }

        public String toString() {
            return "";
        }
    }

}
