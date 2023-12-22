import java.util.Stack;

// Time: O(n)
// Space: O(n)
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);

            if (x == '{' || x == '(' || x == '[') {
                stack.push(x);
            } else if (stack.size() > 0) {
                char popValue = stack.pop();
                if ((x == '}' && popValue != '{') || (x == ']' && popValue != '[') || (x == ')' && popValue != '(')) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.size() == 0;
    }
}