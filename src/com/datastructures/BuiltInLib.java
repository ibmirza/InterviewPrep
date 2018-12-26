package com.datastructures;

import java.util.Stack;

public class BuiltInLib {

    // Match and validate parenthesis
    public boolean isMatchValidateParenthesis(String input){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) == '(' || input.charAt(i) == '['){
                stack.push(input.charAt(i));
            }
            else if( input.charAt(i) == ')' ){
                if(!stack.empty() && stack.peek() == '(')
                    stack.pop();
                else
                    return false;
            }
            else if( input.charAt(i) == ']'){
                if(!stack.empty() && stack.peek() == '[')
                    stack.pop();
                else
                    return false;
            }
        }
        if(!stack.empty())
            return false;
        else
            return true;
    }

    public void printBinaryCounting(int input){

    }

    public void largestNumbeRearrangingArray(int[] array){

    }

    public void printKthSmallestElement(){

    }
}
