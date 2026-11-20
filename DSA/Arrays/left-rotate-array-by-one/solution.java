class Solution {
    public void rotateArrayByOne(int[] nums) {

        if (nums == null || nums.length <= 1) {
            return;
        }

        int len = nums.length;
        int first = nums[0];

        for (int i = 0; i < len - 1; i++) {
            nums[i] = nums[i + 1];
        }

        nums[len - 1] = first;
        
    }
}