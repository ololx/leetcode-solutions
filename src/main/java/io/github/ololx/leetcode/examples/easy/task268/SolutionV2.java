/*
 * 268. Missing nunber
 * project leetcode-solutions
 * author Alexander Kropotin
 * 
 * created at 2022-05-09 20:55
 */
class Solution {
    
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
