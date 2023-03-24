package io.github.ololx.leetcode.solutions.medium.task2166;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * project leetcode-solutions
 * created 17.03.2023 13:48
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public static class Bitset {

        private final int size;

        private Set<Integer> units = new HashSet<Integer>();

        private Set<Integer> nulls = new HashSet<Integer>();

        public Bitset(int size) {
            this.size = size;
            IntStream.range(0, size)
                    .forEach(index -> this.nulls.add(index));
        }

        public int size() {
            return this.size;
        }

        public void fix(int idx) {
            this.nulls.remove(idx);
            this.units.add(idx);
        }

        public void unfix(int idx) {
            this.units.remove(idx);
            this.nulls.add(idx);
        }

        public void flip() {
            Set<Integer> tmpUnits = this.units;
            this.units = this.nulls;
            this.nulls = tmpUnits;
        }

        public boolean all() {
            return this.nulls.size() == 0;
        }

        public boolean one() {
            return this.units.size() != 0;
        }

        public int count() {
            return this.units.size();
        }

        public String toString() {
            StringBuilder bitsInStr = new StringBuilder();

            for (int idx = 0; idx < this.size; idx++) {
                bitsInStr.append(this.units.contains(idx) ? '1' : '0');
            }

            return bitsInStr.toString();
        }
    }
}
