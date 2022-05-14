class Solution {
    
    public int[] plusOne(int[] digits) {
        
        Stack<Integer> nums = new Stack<>();
        int carry = 0;
        
        for (int digitIndex = digits.length - 1; digitIndex >= 0; digitIndex--) {
            int num = carry + digits[digitIndex] + 1;
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
