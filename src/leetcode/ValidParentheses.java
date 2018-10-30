package leetcode;

import java.util.Stack;

public class ValidParentheses {

    /**
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     *
     * An input string is valid if:
     *
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * Note that an empty string is also considered valid.
     */
    public boolean isValid(String s) {
        //方法一
//        if (s.length() == 0) {
//            return true;
//        }
//        Stack<Character> stack = new Stack<Character>();
//        for (int i = 0; i < s.length(); i++) {
//            switch (s.charAt(i)) {
//                case ')':
//                    if (stack.isEmpty() || !stack.pop().equals('('))
//                        return false;
//                    break;
//                case '}':
//                    if (stack.isEmpty() || !stack.pop().equals('{'))
//                        return false;
//                    break;
//                case ']':
//                    if (stack.isEmpty() || !stack.pop().equals('['))
//                        return false;
//                    break;
//                default:
//                    stack.push(s.charAt(i));
//                    break;
//            }
//        }
//        return stack.isEmpty();

        //方法二
        char[] stack = new char[s.length()];
        int head = 0;
        for(char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack[head++] = c;
                    break;
                case '}':
                    if (head == 0 || stack[--head] != '{') return false;
                    break;
                case ')':
                    if (head == 0 || stack[--head] != '(') return false;
                    break;
                case ']':
                    if (head == 0 || stack[--head] != '[') return false;
                    break;
            }
        }
        return head == 0;
    }
}
