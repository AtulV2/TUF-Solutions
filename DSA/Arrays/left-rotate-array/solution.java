class Solution {

    private static void reverse(int[] arr, int left, int right){
        while(left < right){
            int temp =  arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;

        }
    }


    public void rotateArray(int[] nums, int k) {

        int len =  nums.length;
        k =  k % len;

        reverse(nums, 0, k-1);
        reverse(nums, k,len - 1);
        reverse(nums,0,len - 1);

        
    }
}