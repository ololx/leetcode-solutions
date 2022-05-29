package io.github.ololx.leetcode.examples.easy.task744;

/**
 * 744. Find Smallest Letter Greater Than Target
 *
 * Given a characters array letters that is sorted in non-decreasing
 * order and a character target, return the smallest character in the array
 * that is larger than target.
 *
 * Note that the letters wrap around.
 * <ul>
 *     <li>
 *         For example, if target == 'z' and letters == ['a', 'b'],
 *         the answer is 'a'.
 *     </li>
 * </ul>
 *
 * Example 1:
 * <p>Input: letters = ["c","f","j"], target = "a"
 * Output: "c"</p>
 *
 * Example 2:
 * <p>Input: letters = ["c","f","j"], target = "c"
 * Output: "f"</p>
 *
 * Example 3:
 * <p>Input: letters = ["c","f","j"], target = "d"
 * Output: "f"</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          2 <= letters.length <= 10^4
 *      </li>
 *      <li>
 *          letters[i] is a lowercase English letter.
 *      </li>
 *      <li>
 *          letters is sorted in non-decreasing order.
 *      </li>
 *      <li>
 *          letters contains at least two different characters.
 *      </li>
 *      <li>
 *          target is a lowercase English letter.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 29.05.2022 16:37
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length - 1;
        char greatestLetter = letters[right];

        if (target >= greatestLetter) {
            return letters[left];
        }

        while (left <= right) {
            int median = (left + right) >> 1;

            if (letters[median] > target) {
                if (greatestLetter > letters[median]) {
                    greatestLetter = letters[median];
                }

                right = --median;
            } else {
                left = ++median;
            }
        }

        return greatestLetter;
    }
}
