package com.datastructures;

public class BasicRecursion {

    //NOTE: Do not use loops. Use recursion only

    // Print N to 1
    public void printNto1(int n){
       if(n==0)
         return;
       System.out.printf("%d", n);
       printNto1(n-1);
    }

    // Print 1 to N ascending
    public void print1ToN(int n){
        if(n==0)
            return;
        print1ToN(n-1);
        System.out.printf("%d",n);
    }

    // Find sum of n elements of an array
    public int sumOfElementsOfArray(int[] array){
        if(array.length==0)
            return 0;

        return sum(array, array.length-1);
    }

    private int sum(int[] array, int idx){
        if(idx==0)
            return array[idx];
        return array[idx] + sum(array, idx-1);
    }

    // Get the sum of digits of a number
    public int getSumOfDigits(int n){
        if(n<10)
            return n;
        return n%10 + getSumOfDigits(n/10);
    }

    //Palindrome = original==reverse
    //Is Array Palindromic
    public boolean isArrayPalindromic(int[] array){
        return isPalin(array, 0, array.length-1);
    }

    private boolean isPalin(int[] a, int i, int j){
        if(i>=j)
            return true;
        if(a[i]!=a[j])
            return false;
        return isPalin(a, i+1, j-1);
    }

    // Return index of element 'k' in an array
    public int getIndexOfElementInArray(int[] array, int k){
        if(array.length == 0)
            return -1;
        return findIndex(array, array.length-1, k);
    }

    private int findIndex(int[] a, int idx, int k){
        if(idx<0)
            return -1;
        if(a[idx] == k)
            return idx;
        return findIndex(a, idx-1, k);
    }

    //Factorial of N
    public int factorial(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return n * factorial(n-1);
    }

    //Given an integer N, representing number of people in room. Person 1 has 10 fingers,
    //person 2 has 11 fingers, person 3 has 10 fingers, person 4 has 11 fingers. 
    //Find Total no. of fingers in a room.
    public int totalFingers(int n) {
        if (n == 0)
            return 0;
        if (n % 2 == 0)
            return 11 + totalFingers(n - 1);
        else
            return 10 + totalFingers(n - 1);
    }
}



