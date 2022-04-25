package io.github.ololx.leetcode.examples.medium.task284;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
 *          the given T iterator iterator.
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
 * generic and work with all types, not just T?
 *
 * project leetcode-solutions
 * created 25.04.2022 22:26
 *
 * @author Alexander A. Kropotin
 */
public class SolutionV2 {

    public static class PeekingIterator implements Iterator<Integer> {

        private final List<Integer> values = new ArrayList<>();

        private int currentIndex = -1;

        private int nextIndex;

        private int size;

        public PeekingIterator(Iterator<Integer> iterator) {
            Objects.requireNonNull(iterator);

            while (iterator.hasNext()) {
                this.values.add(iterator.next());
                size++;
            }
        }

        public Integer peek() {
            if (!checkIndexRange()) {
                return null;
            }

            return this.values.get(this.nextIndex);
        }

        @Override
        public Integer next() {
            if (!checkIndexRange()) {
                return null;
            }

            final Integer value = this.values.get(this.nextIndex);
            this.currentIndex++;
            this.nextIndex++;

            return value;
        }

        @Override
        public boolean hasNext() {
            return checkIndexRange();
        }

        private boolean checkIndexRange() {
            return this.size > this.nextIndex;
        }
    }
}
