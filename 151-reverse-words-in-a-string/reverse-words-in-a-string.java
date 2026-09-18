class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split("\s+");
        String[] revWords = new String[words.length];
        for(int i = 0;i<words.length;i++){
            revWords[i] = words[words.length -1 -i];
        }


        return String.join(" ", revWords);
    }
}