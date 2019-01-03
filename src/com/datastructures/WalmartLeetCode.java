package com.datastructures;

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
    
}
