package io.github.ololx.leetcode.solutions.easy.task66;

import java.util.Stack;

/**
 * 66. Plus One
 *
 * You are given a large integer represented as an integer array digits,
 * where each digits[i] is the ith digit of the integer.
 * The digits are ordered from most significant to least significant in left-to-right order.
 * The large integer does not contain any leading 0's.
 *
 * Increment the large integer by one and return the resulting array of digits.
 *
 * Example 1:
 * <p>Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].</p>
 *
 * Example 2:
 * <p>Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].</p>
 *
 * Example 3:
 * <p>Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= digits.length <= 100
 *      </li>
 *      <li>
 *          0 <= digits[i] <= 9
 *      </li>
 *      <li>
 *          digits does not contain any leading 0's.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * author Alexander Kropotin
 *
 * created at 2022-05-14 20:55
 */
public class Solution {
    
    public int[] plusOne(int[] digits) {
        
        Stack<Integer> nums = new Stack<>();
        int carry = 1;
        
        for (int digitIndex = digits.length - 1; digitIndex >= 0; digitIndex--) {
            int num = carry + digits[digitIndex];
            carry = num / 10;
            nums.push(num % 10);
        }
        
        if (carry > 0) {
            nums.push(carry);
        }
        
        int[] result = new int[nums.size()];
        
        int curr = 0;
        while (!nums.empty()) {
              result[curr] = nums.pop();   
              curr++;
        }
        
        return result;
    }
}
