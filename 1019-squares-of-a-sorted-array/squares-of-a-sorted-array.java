class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int index = nums.length-1;
        int[] ans = new int[nums.length];
        while(start<=end){
            if(Math.abs(nums[start])>=Math.abs(nums[end])){
                ans[index] = nums[start]*nums[start];
                start++;
                index--;
            }else if(Math.abs(nums[end])>Math.abs(nums[start])){
                ans[index] = nums[end]*nums[end];
                end--;
                index--;
            }
        }
        return ans;
    }
}