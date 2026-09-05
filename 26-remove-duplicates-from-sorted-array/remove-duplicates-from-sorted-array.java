class Solution {
    public int removeDuplicates(int[] nums) {
        int[] ans = new int[nums.length];
        int start = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != nums[start]){
                start += 1;
                nums[start] = nums[i];
            }
        }
        return start+1;        
    }
}