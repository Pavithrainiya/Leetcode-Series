class Solution {
    public void moveZeroes(int[] nums) {
        int zero = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zero = Math.min(zero, i);
            } else if(nums[i] != 0 && zero < i) {
                nums[zero] = nums[i];
                nums[i] = 0;
                
                int x= zero;
                zero = Integer.MAX_VALUE;
                while (x <= i) {
                    if (nums[x] == 0) {
                        zero = x;
                        break;
                    }
                    x++;
                }
            }
        }
    }
}