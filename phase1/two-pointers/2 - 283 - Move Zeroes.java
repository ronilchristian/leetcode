// 2 - 283 - Move Zeroes

class Solution {
    public void moveZeroes(int[] nums) {
        // define pointers
        int n = nums.length;
        int start = 0, end = 1;

        // iterate
        while (end < n) {
            if (nums[start] != 0) {
                start++;
                end++;
            } else if (nums[end] == 0) end++;
            else {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }
        }
    }
}
