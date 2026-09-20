class Solution {
    public int fib(int n){
        if (n == 0 || n == 1){
            return n;
        }
        int firstTerm = 0;
        int secondTerm = 1;

        for(int i = 0 ; i<n ; i++){
            int thirdTerm = firstTerm + secondTerm ;

            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
        return firstTerm;
        // return fib(n-1) + fib(n-2);
    }
}
