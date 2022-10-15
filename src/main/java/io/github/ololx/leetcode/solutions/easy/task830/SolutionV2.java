/**
 * Copyright 2022 the project leetcode-solutions authors
 * and the original author or authors annotated by {@author}
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
 * created 15.10.2022 14:21
 *
 * @author Alexander A. Kropotin
 */
public class SolutionV2 {

    private static final int MIN_GROUP_SIZE = 3;

    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> groups = new ArrayList<>();

        for (int leftIndex = 0; leftIndex < s.length(); leftIndex++) {
            int rightIndex = leftIndex;
            while (++rightIndex < s.length() && s.charAt(leftIndex) == s.charAt(rightIndex)) {}

            if (rightIndex - leftIndex >= MIN_GROUP_SIZE) {
                groups.add(List.of(leftIndex, --rightIndex));
            }

            leftIndex = --rightIndex;
        }

        return groups;
    }
}
