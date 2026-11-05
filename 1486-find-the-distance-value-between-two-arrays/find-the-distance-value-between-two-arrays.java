class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for(int i : arr1){
            if(isValid(i,arr2,d)){
                count ++;
            }
        }
        return count;
    }
    boolean isValid(int i, int[] arr, int d){
        for(int a : arr){
            if(Math.abs(a-i)<=d){
                return false;
            }
        }
        return true;
    }
}