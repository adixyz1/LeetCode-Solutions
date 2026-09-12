class Solution {
    public int reverse(long x) {
        int max = 2147483647;
        int min = -2147483648;
        long rev = 0;
        if(x>0){
            while(x > 0) {
                long digit = x % 10;
                x = x / 10;
                rev = rev*10+digit;
            }
        } else {
            while(x < 0){
                long digit = x % 10;
                x = x / 10;         
                rev = (rev*10-digit);
            }
            rev *= -1;
        }
        if(rev > max || rev < min){
            return 0;
        } else {
            return Math.toIntExact(rev);
        }
    }
}