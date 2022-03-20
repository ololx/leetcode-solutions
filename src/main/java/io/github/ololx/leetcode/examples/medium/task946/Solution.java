package io.github.ololx.leetcode.examples.medium.task946;

import java.util.Stack;

/**
 * 946. Validate Stack Sequences
 *
 * Given two integer arrays pushed and popped each with distinct values,
 * return true if this could have been the result of a sequence of push
 * and pop operations on an initially empty stack, or false otherwise.
 *
 * Example 1:
 * <p>Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
 * Output: true
 * Explanation: We might do the following sequence:
 * push(1), push(2), push(3), push(4),
 * pop() -> 4,
 * push(5),
 * pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1</p>
 *
 * Example 2:
 * <p>Input: pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
 * Output: false
 * Explanation: 1 cannot be popped before 2.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= pushed.length <= 1000
 *      </li>
 *      <li>
 *          0 <= pushed[i] <= 1000
 *      </li>
 *      <li>
 *          All the elements of pushed are unique.
 *      </li>
 *      <li>
 *          popped.length == pushed.length
 *      </li>
 *      <li>
 *          popped is a permutation of pushed.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 16.03.2022 22:04
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> pushedStack = new Stack<>();

        int j = 0;

        for (int i = 0; i < pushed.length; i++) {
            pushedStack.push(pushed[i]);

            if (popped[j] == pushed[i]) {
                while (!pushedStack.isEmpty() && pushedStack.peek() == popped[j]) {
                    pushedStack.pop();
                    j++;
                }
            }
        }

        return pushedStack.isEmpty();
    }
}
