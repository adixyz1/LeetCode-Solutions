class Solution {
    public int removeDuplicates(int[] nums) {
        int[] ans = new int[nums.length];
        if(nums.length <= 2) return nums.length;
        int start = 1;
        for(int i=2;i<nums.length;i++){
            if(nums[i] != nums[start-1]){
                start += 1;
                nums[start] = nums[i];
            }
        }
        return start+1;        
    }
}