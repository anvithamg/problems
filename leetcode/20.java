/*20. Valid Parentheses
Easy

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.

 

Example 1:

Input: s = "()"
Output: true

Example 2:

Input: s = "()[]{}"
Output: true

Example 3:

Input: s = "(]"
Output: false

Example 4:

Input: s = "([)]"
Output: false

Example 5:

Input: s = "{[]}"
Output: true*/
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char pop;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
            else if (stack.isEmpty())
                return false;
            else if (s.charAt(i) == ')') {
                pop = stack.pop();
                if (pop != '(')
                    return false;
            } else if (s.charAt(i) == '}') {
                pop = stack.pop();
                if (pop != '{')
                    return false;
            } else if (s.charAt(i) == ']') {
                pop = stack.pop();
                if (pop != '[')
                    return false;
            }
        }
        if (stack.isEmpty())
            return true;
        return false;

    }
}
