class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '(', '[', '{' -> stack.push(ch);
                case ')' -> {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        return false;
                    }
                    stack.pop();
                }
                case ']' -> {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        return false;
                    }
                    stack.pop();
                }
                case '}' -> {
                    if (stack.isEmpty() || stack.peek() != '{') {
                        return false;
                    }
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}