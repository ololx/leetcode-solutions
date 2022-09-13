package io.github.ololx.leetcode.solutions.easy.task2404;

import java.util.HashMap;
import java.util.Map;

/**
 * 2404. Most Frequent Even Element
 *
 * Given an integer array nums, return the most frequent even element.
 *
 * If there is a tie, return the smallest one. If there is no such element, return -1.
 *
 * Example 1:
 * <p>Input: nums = [0,1,2,2,4,4,1]
 * Output: 2
 * Explanation:
 * The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
 * We return the smallest one, which is 2.</p>
 *
 * Example 2:
 * <p>Input: nums = [4,4,4,9,2,4]
 * Output: 4
 * Explanation: 4 is the even element appears the most.</p>
 *
 * Example 3:
 * <p>Input: nums = [29,47,21,41,13,37,25,7]
 * Output: -1
 * Explanation: There is no even element.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= nums.length <= 2000
 *      </li>
 *      <li>
 *          0 <= nums[i] <= 10^5
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 13.09.2022 06:27
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int mostFrequentEven(int[] nums) {
        int mostFrequentElement = -1;
        int maxFrequency = -1;
        Map<Integer, Integer> frequencies = new HashMap<>();

        for (int num : nums) {
            if (num % 2 != 0) {
                continue;
            }

            int currentFrequency = frequencies.getOrDefault(num, 0);
            frequencies.put(num, ++currentFrequency);

            if (maxFrequency < currentFrequency || maxFrequency == currentFrequency && mostFrequentElement > num) {
                maxFrequency = currentFrequency;
                mostFrequentElement = num;
            }
        }

        return mostFrequentElement;
    }
}

