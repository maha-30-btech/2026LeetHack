class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                top++;
                stack[top] = ')';
            } else if (c == '[') {
                top++;
                stack[top] = ']';
            } else if (c == '{') {
                top++;
                stack[top] = '}';
            } else {      
                if (top == -1 || stack[top] != c) {
                    return false;
                }
                top--;
            }
        }
        return top == -1;
    }
}
