package io.github.ololx.leetcode.solutions.medium.task1306;

/**
 * 1306. Jump Game III
 *
 * Given an array of non-negative integers arr, you are initially positioned at start index of the array. When you are
 * at index i, you can jump to i + arr[i] or i - arr[i], check if you can reach any index with value 0.
 *
 * Notice that you can not jump outside of the array at any time.
 *
 * Example 1:
 * <p>Input: arr = [4,2,3,0,3,1,2], start = 5
 * Output: true
 * Explanation:
 * All possible ways to reach at index 3 with value 0 are:
 * index 5 -> index 4 -> index 1 -> index 3
 * index 5 -> index 6 -> index 4 -> index 1 -> index 3</p>
 *
 * Example 2:
 * <p>Input: arr = [4,2,3,0,3,1,2], start = 0
 * Output: true
 * Explanation:
 * One possible way to reach at index 3 with value 0 is:
 * index 0 -> index 4 -> index 1 -> index 3</p>
 *
 * Example 2:
 * <p>Input: arr = [3,0,2,1,2], start = 2
 * Output: false
 * Explanation: There is no way to reach at index 1 with value 0.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= arr.length <= 5 * 10^4
 *      </li>
 *      <li>
 *          0 <= arr[i] < arr.length
 *      </li>
 *      <li>
 *          0 <= start < arr.length
 *      </li>
 * </ul>
 *
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 07/05/2024 3:17pm
 */
public class Solution {

    public boolean canReach(int[] arr, int start) {
        if (start < 0 || start >= arr.length) {
            return false;
        } else if (arr[start] < 0) {
            return false;
        } else if (arr[start] == 0) {
            return true;
        }

        arr[start] *= -1;

        return canReach(arr, start + arr[start]) || canReach(arr, start - arr[start]);
    }
}
