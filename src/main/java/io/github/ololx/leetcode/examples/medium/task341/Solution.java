package io.github.ololx.leetcode.examples.medium.task341;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 *
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 *
 * project leetcode-solutions
 * created 08.05.2022 08:34
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public static interface NestedInteger {

        public boolean isInteger();

        public Integer getInteger();

        public List<NestedInteger> getList();
    }

    public static class NestedIterator implements Iterator<Integer> {

        private final List<NestedInteger> values;

        private NestedInteger nextValue;

        private int index;

        private int nextedIndex;

        public NestedIterator(List<NestedInteger> nestedList) {
            values = Objects.requireNonNull(nestedList);
        }

        @Override
        public Integer next() {
            return null;
        }

        @Override
        public boolean hasNext() {
            if (this.values.size() <= this.index) {
                return false;
            }

            return false;
        }
    }
}
