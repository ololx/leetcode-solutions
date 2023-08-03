package io.github.ololx.leetcode.solutions.medium.task11;

/**
 * 11. Container With Most Water
 *
 * You are given an integer array height of length n. There are n vertical lines drawn such
 * that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, such that the container
 * contains the most water.
 * Return the maximum amount of water a container can store.
 * Notice that you may not slant the container.
 *
 * Example 1:
 * <p>Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
 * In this case, the max area of water (blue section) the container can contain is 49.</p>
 *
 * Example 2:
 * <p>Input: height = [1,1]
 * Output: 1</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          n == height.length
 *      </li>
 *      <li>
 *          2 <= n <= 10^5
 *      </li>
 *      <li>
 *          0 <= height[i] <= 10^4
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 03.08.2023 15:19
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWaterVolume = 0;

        while (left < right) {
            maxWaterVolume = Math.max(maxWaterVolume, (right - left) * (Math.min(height[left], height[right])));

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWaterVolume;
    }
}
