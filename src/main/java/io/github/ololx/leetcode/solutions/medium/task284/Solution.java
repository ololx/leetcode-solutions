package io.github.ololx.leetcode.solutions.medium.task284;

import java.util.Iterator;
import java.util.Objects;

/**
 * 284. Peeking Iterator
 *
 * Design an iterator that supports the peek operation on an existing iterator
 * in addition to the hasNext and the next operations.
 *
 * Implement the PeekingIterator class:
 * <ul>
 *      <li>
 *          PeekingIterator(Iterator<int> nums) Initializes the object with
 *          the given integer iterator iterator.
 *      </li>
 *      <li>
 *          int next() Returns the next element in the array and moves
 *          the pointer to the next element.
 *      </li>
 *      <li>
 *          boolean hasNext() Returns true if there are still elements in the array.
 *      </li>
 *      <li>
 *          int peek() Returns the next element in the array without moving the pointer.
 *      </li>
 * </ul>
 *
 * Note: Each language may have a different implementation of the constructor and Iterator,
 * but they all support the int next() and boolean hasNext() functions.
 *
 * Example 1:
 * <p>Input
 * ["PeekingIterator", "next", "peek", "next", "next", "hasNext"]
 * [[[1, 2, 3]], [], [], [], [], []]
 * Output
 * [null, 1, 2, 2, 3, false]
 *
 * Explanation
 * PeekingIterator peekingIterator = new PeekingIterator([1, 2, 3]); // [1,2,3]
 * peekingIterator.next();    // return 1, the pointer moves to the next element [1,2,3].
 * peekingIterator.peek();    // return 2, the pointer does not move [1,2,3].
 * peekingIterator.next();    // return 2, the pointer moves to the next element [1,2,3]
 * peekingIterator.next();    // return 3, the pointer moves to the next element [1,2,3]
 * peekingIterator.hasNext(); // return False</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= nums.length <= 1000
 *      </li>
 *      <li>
 *          1 <= nums[i] <= 1000
 *      </li>
 *      <li>
 *          All the calls to next and peek are valid.
 *      </li>
 *      <li>
 *          At most 1000 calls will be made to next, hasNext, and peek.
 *      </li>
 * </ul>
 *
 * <b>Follow up:</b> How would you extend your design to be
 * generic and work with all types, not just integer?
 *
 * project leetcode-solutions
 * created 25.04.2022 22:26
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public static class PeekingIterator implements Iterator<Integer> {

        private final Iterator<Integer> iterator;

        private Integer next;

        public PeekingIterator(Iterator<Integer> iterator) {
            this.iterator = Objects.requireNonNull(iterator);

            if (iterator.hasNext()) {
                this.next = iterator.next();
            }
        }

        public Integer peek() {
            return this.next;
        }

        @Override
        public Integer next() {
            final Integer value = this.next;
            this.next = this.iterator.hasNext() ? this.iterator.next() : null;

            return value;
        }

        @Override
        public boolean hasNext() {
            return this.next != null;
        }
    }
}
