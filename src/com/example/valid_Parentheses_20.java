package com.example;
import java.util.Stack;

public class valid_Parentheses_20 {
    public static void main(String[] args)
    {
        System.out.println(isValid("()"));
    }
    static public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char currentChar;
        for(int i =0; i< s.length();i++) {
            currentChar = s.charAt(i);
            if(currentChar =='{' ) { stack.push('}'); }
            else if( currentChar=='[' ) { stack.push(']'); }
            else if (currentChar=='(') { stack.push(')'); }
            else if(stack.isEmpty()|| currentChar!=stack.pop()) return false;
        }
        //empty()是自己的方法， isempty() 继承自 vector
        //if stack is empty, which means it works
        return stack.isEmpty();
    }
}
