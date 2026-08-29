class Solution {
    public int countDigits(int num) {
        int original = num;
        int count = 0;
        while(original > 0){
            int digit = original%10;
            if(digit != 0 && num % digit == 0){
                count += 1;
            }
            original = original/10;
        }
        return count;
    }
}