// 2 - 283 - Move Zeroes

class Solution {
    public void moveZeroes(int[] nums) {
        // base case
        int n = nums.length;
        if (n < 2) return;

        // define pointers
        int L = 0, R = 1;

        // iterate
        while (R < n) {
            if (nums[L] != 0) {
                L++;
                R++;
            } 
            else if (nums[R] == 0) R++;
            else {
                int temp = nums[L];
                nums[L] = nums[R];
                nums[R] = temp;
            }
        }
    }
}
