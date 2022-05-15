package io.github.ololx.leetcode.examples.easy.task268;

/**
 * 268. Missing Number
 *
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.
 *
 * Example 1:
 * <p>Input: nums = [3,0,1]
 * Output: 2
 * Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
 * 2 is the missing number in the range since it does not appear in nums.</p>
 *
 * Example 2:
 * <p>Input: nums = [0,1]
 * Output: 2
 * Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2].
 * 2 is the missing number in the range since it does not appear in nums.</p>
 *
 * Example 3:
 * <p>Input: nums = [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9].
 * 8 is the missing number in the range since it does not appear in nums.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          n == nums.length
 *      </li>
 *      <li>
 *          1 <= n <= 10^4
 *      </li>
 *      <li>
 *          0 <= nums[i] <= n
 *      </li>
 *      <li>
 *         All the numbers of nums are unique.
 *      </li>
 * </ul>
 * 
 * project leetcode-solutions
 * author Alexander Kropotin
 * 
 * created at 2022-05-09 20:55
 */
public class SolutionV2 {
    
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedXOR = n, actualXOR = 0;
        
        for (int digit = 0; digit < n; digit++) {
            expectedXOR ^= digit;
            actualXOR ^= nums[digit];
        }
        
        return expectedXOR ^ actualXOR;
    }
}
