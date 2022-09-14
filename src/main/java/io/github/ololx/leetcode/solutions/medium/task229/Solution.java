package io.github.ololx.leetcode.solutions.medium.task229;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 229. Majority Element II
 *
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 *
 * Example 1:
 * <p>Input: nums = [3,2,3]
 * Output: [3]</p>
 *
 * Example 2:
 * <p>Input: nums = [1]
 * Output: [1]</p>
 *
 * Example 3:
 * <p>Input: nums = [1,2]
 * Output: [1,2]</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         1 <= nums.length <= 5 * 10^4
 *     </li>
 *     <li>
 *         -10^9 <= nums[i] <= 10^9
 *     </li>
 * </ul>
 *
 * Follow up: Could you solve the problem in linear time and in O(1) space?
 *
 * project leetcode-solutions
 * created 14.09.2022 08:27
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);

        int previousNum = -1;
        int previousNumCount = 0;
        List<Integer> majorityElements = new ArrayList<>();

        for (int num : nums) {
            if (previousNum != num) {
                if (previousNumCount > nums.length / 3) {
                    majorityElements.add(previousNum);
                }

                previousNumCount = 0;
                previousNum = num;
            }

            previousNumCount++;
        }

        if (previousNumCount > nums.length / 3) {
            majorityElements.add(previousNum);
        }

        return majorityElements;
    }
}
