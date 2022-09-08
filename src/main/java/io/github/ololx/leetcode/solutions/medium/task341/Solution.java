package io.github.ololx.leetcode.solutions.medium.task341;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * 341. Flatten Nested List Iterator
 *
 * You are given a nested list of integers nestedList. Each element is
 * either an integer or a list whose elements may also be integers or other lists.
 * Implement an iterator to flatten it.
 *
 * Implement the NestedIterator class:
 * <ul>
 *     <li>
 *         NestedIterator(List<NestedInteger> nestedList) Initializes
 *         the iterator with the nested list nestedList.
 *     </li>
 *     <li>
 *         int next() Returns the next integer in the nested list.
 *     </li>
 *     <li>
 *         boolean hasNext() Returns true if there are still some
 *         integers in the nested list and false otherwise.
 *     </li>
 * </ul>
 *
 * Your code will be tested with the following pseudocode:
 * <p>initialize iterator with nestedList
 * res = []
 * while iterator.hasNext()
 *     append iterator.next() to the end of res
 * return res</p>
 *
 * <p>If res matches the expected flattened list,
 * then your code will be judged as correct.</p>
 *
 * Example 1:
 * <p>Input: nestedList = [[1,1],2,[1,1]]
 * Output: [1,1,2,1,1]
 * Explanation: By calling next repeatedly until hasNext returns false,
 * the order of elements returned by next should be: [1,1,2,1,1].</p>
 *
 * Example 2:
 * <p>Input: nestedList = [1,[4,[6]]]
 * Output: [1,4,6]
 * Explanation: By calling next repeatedly until hasNext returns false,
 * the order of elements returned by next should be: [1,4,6].</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= nestedList.length <= 500
 *      </li>
 *      <li>
 *          The values of the integers in the nested list is in the range [-10^6, 10^6].
 *      </li>
 * </ul>
 *
 * <p>This is the interface that allows for creating nested lists.</p>
 * You should not implement it, or speculate about its implementation
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
 * }</p>
 *
 * project leetcode-solutions
 * created 08.05.2022 08:34
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public static class NestedIterator implements Iterator<Integer> {

        private final List<Integer> flattenValues;

        private int index = -1;

        public NestedIterator(List<NestedInteger> nestedList) {
            this.flattenValues = traversalFlatValues(Objects.requireNonNull(nestedList));

            if (!this.flattenValues.isEmpty()) {
                this.index = 0;
            }
        }

        private List<Integer> traversalFlatValues(List<NestedInteger> nestedList) {
            final List<Integer> flattenValues = new ArrayList<>();

            for (NestedInteger nestedInteger : nestedList) {
                if (nestedInteger.isInteger()) {
                    flattenValues.add(nestedInteger.getInteger());
                } else {
                    flattenValues.addAll(this.traversalFlatValues(nestedInteger.getList()));
                }
            }

            return flattenValues;
        }

        @Override
        public Integer next() {
            if (!this.hasNext()) {
                return null;
            }

            int value = this.flattenValues.get(this.index);
            this.index++;

            if (this.index >= this.flattenValues.size()) {
                this.index = -1;
            }

            return value;
        }

        @Override
        public boolean hasNext() {
            return this.index != -1;
        }
    }

    public static interface NestedInteger {

        public boolean isInteger();

        public Integer getInteger();

        public List<NestedInteger> getList();
    }
}
