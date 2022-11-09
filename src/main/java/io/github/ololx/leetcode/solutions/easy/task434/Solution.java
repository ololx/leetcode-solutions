package io.github.ololx.leetcode.solutions.easy.task434;

/**
 * 434. Number of Segments in a String
 *
 * Given a string s, return the number of segments in the string.
 * A segment is defined to be a contiguous sequence of non-space characters.
 *
 * Example 1:
 * <p>Input: s = "Hello, my name is John"
 * Output: 5
 * Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]</p>
 *
 * Example 2:
 * <p>Input: s = "Hello"
 * Output: 1</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         0 <= s.length <= 300
 *     </li>
 *     <li>
 *         s consists of lowercase and uppercase English letters, digits,
 *         or one of the following characters "!@#$%^&*()_+-=',.:".
 *     </li>
 *     <li>
 *         The only space character in s is ' '.
 *     </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 09.11.2022 15:03
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int countSegments(String s) {
        int count = 0;
        boolean segment = false;

        for (char symbol : s.toCharArray()) {
            if (symbol != ' ') {
                segment = true;
            } else if (segment) {
                count++;
                segment = false;
            }
        }

        if (segment) {
            count++;
        }

        return count;
    }
}
