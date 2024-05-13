package io.github.ololx.leetcode.solutions.easy.task830;

import java.util.ArrayList;
import java.util.List;

/**
 * 830. Positions of Large Groups
 *
 * In a string s of lowercase letters, these letters form consecutive groups of the same character.
 *
 * For example, a string like s = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z", and "yy".
 *
 * A group is identified by an interval [start, end], where start and end denote
 * the start and end indices (inclusive) of the group. In the above example,
 * "xxxx" has the interval [3,6].
 *
 * A group is considered large if it has 3 or more characters.
 *
 * Return the intervals of every large group sorted in increasing order by start index.
 *
 * Example 1:
 * <p>Input: s = "abbxxxxzzy"
 * Output: [[3,6]]
 * Explanation: "xxxx" is the only large group with start index 3 and end index 6.</p>
 *
 * Example 2:
 * <p>Input: s = "abc"
 * Output: []
 * Explanation: We have groups "a", "b", and "c", none of which are large groups.</p>
 *
 * Example 3:
 * <p>Input: s = "abcdddeeeeaabbbcd"
 * Output: [[3,5],[6,9],[12,14]]
 * Explanation: The large groups are "ddd", "eeee", and "bbb".</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= s.length <= 1000
 *      </li>
 *      <li>
 *          s contains lowercase English letters only.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 09.10.2022 21:18
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public List<List<Integer>> largeGroupPositions(String s) {
        int minGroupSize = 3;
        int groupLeftIndex = 0;
        List<List<Integer>> groups = new ArrayList<>();

        for (int charIndex = 0; charIndex < s.length(); charIndex++) {
            if (charIndex == s.length() - 1 || s.charAt(charIndex) != s.charAt(charIndex + 1)) {
                if(charIndex - groupLeftIndex + 1 >= minGroupSize) {
                    List<Integer> group = new ArrayList<>();
                    group.add(groupLeftIndex);
                    group.add(charIndex);
                    groups.add(group);
                }

                groupLeftIndex = charIndex + 1;
            }
        }

        return groups;
    }
}
