package leetcode;

import java.util.Stack;

public class Solution9 {

    public static void main(String[] args) {
        System.out.println(isValid("({)}"));
    }

    public static boolean isValid(String s) {
        char[] arr = s.toCharArray();
        if (arr.length % 2 !=0) return false;

        Stack<Character> st = new Stack();
        for(int i = 0; i < arr.length; i++ ) {
            if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
                st.push(arr[i]);
            } else if (st.empty()) {
                return false;
            } else {
                if (arr[i] == ')' && st.peek() == '(') {
                    st.pop();
                } else  if (arr[i] == ']' && st.peek() == '[') {
                    st.pop();
                } else if (arr[i] == '}' && st.peek() == '{') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.empty();
    }
}
