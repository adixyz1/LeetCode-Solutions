class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int temp;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                start += 1;
            }
        }
        return nums;
    }
}