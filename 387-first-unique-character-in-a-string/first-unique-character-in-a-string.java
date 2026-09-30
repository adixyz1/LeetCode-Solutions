class Solution {
    public int firstUniqChar(String s){
        int length = s.length();
        String str;
        for(int i=0;i<length;i++){
            if(i==length-1){
                str = s.substring(0, i);
            }
            else{
                str = s.substring(0,i)+s.substring(i+1);
            }
            if(!str.contains(s.charAt(i)+""))
                return i;
        }
        return -1; 
    }
}