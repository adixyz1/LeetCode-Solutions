class Solution {
    public int climbStairs(int n) {

        if(n==1||n==2){
            return n;
        }
        int firstTerm = 1;
        int secondTerm = 2;
        for(int i = 0; i < n;i++){
            int thirdTerm = firstTerm + secondTerm;

            firstTerm = secondTerm-1;
            secondTerm = thirdTerm;
        }
        return firstTerm;
    }
}