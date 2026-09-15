class Solution {
    public boolean isAlphaNumeric(char ch){
        if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
            return true;
        }
        return false;
    }
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length()-1;

        while(i<j){
            if(!isAlphaNumeric(s.charAt(i))){
                i++;
            } else if (!isAlphaNumeric(s.charAt(j))) {
                j--;
            } else if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            } else{
                return false;
            }
        }
        return true;
    }
}