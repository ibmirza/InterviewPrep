package com.datastructures;

import java.util.Stack;

public class WalmartLeetCode {

    public int[] moveAllZeroesToEnd(int array[]){
        int size = array.length;
        int count = 0;
        for(int i=0; i<size; i++){
           if(array[i] != 0){
              array[count] = array[i];
              count++;
           }
        }
        while(count < size){
           array[count] = 0;
           count++;
        }
        return array;
    }

    // Second max salary sql
    // 1.) Select nvl(Max(salary), null) AS SECONDMAX
    //     FROM
    //         (Select salary FROM employee
    //          WHERE
    //               salary NOT IN (Select * MAX(salary) from employee));
    //


    // Return paid of indices whose values sum is equal to target
    public int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        int length = nums.length;
        int i = 0;
        int j = length - 1;
        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum == target){
                result[0] = i;
                result[1] = j;
                return result;
            }
            else if(sum < target)
                i++;
            else
                j--;
        }
        return result;
    }

    // Return the max sum of non adjacent integers
    public int maxRob(int[] arr){
        int excl = 0;
        int incl = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int temp = incl;
            incl = Math.max(excl + arr[i], incl);
            excl = temp;
        }
        return incl;
    }

    // Validate parenthesis
    public boolean isValidParenthesis(String input){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<input.length(); i++){
           if( input.charAt(i) == '(' || input.charAt(i) == '{' || input.charAt(i) == '[' ) {
              stack.push(input.charAt(i));
           }
           else if(input.charAt(i) == ')' && !stack.isEmpty()){
              if(stack.peek() == '(')
                  stack.pop();
              else
                  return false;
           }
           else if(input.charAt(i) == '}' && !stack.isEmpty()){
              if(stack.peek() == '{')
                  stack.pop();
              else
                  return false;
           }
           else if(input.charAt(i) == ']' && !stack.isEmpty()){
              if(stack.peek() == '[')
                  stack.pop();
              else
                  return false;
           }
        }
        if(!stack.isEmpty())
           return false;
        else
           return true;
    }

    // Remove duplicates in a sorted array and return the length of array with unique elements. Move all the unique
    // elements to the front of the array and non duplicates to end of array
    public int removeDuplicates(int arr[]){
        int count = 0;
        int length = arr.length;
        for(int i=0; i<length-1; i++){
           if(arr[i] != arr[i+1]){
              arr[count] = arr[i]; 
              count++;
           }
        }
        arr[count] = arr[length - 1];
        return count+1;
    }

    public Node reverseLinkedListIterative(Node head){
        return null;
    }

    public Node reverseLinkedListRecursive(Node head){
        return null;
    }
    
}
