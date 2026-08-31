class Solution {
    static double MyPow(double x,int n){
        if(n==0){
            return 1;
        }
        double a = MyPow(x,n/2);
        if(n%2==0){
            return a*a;
        }
        else{
            return a*a*x;
        }
    }
    public double myPow(double x, int n) {
        if (n>=0){
            return MyPow(x,n);
        }
        else{
            return 1/MyPow(x,n*(-1));
        }
    }
}