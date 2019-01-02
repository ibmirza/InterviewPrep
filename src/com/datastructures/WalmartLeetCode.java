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

    
}
