// package whatever; // don't place package name!
/*
Given an array and a value, 
find if there is a triplet in array whose sum is equal to the given value.
If there is such a triplet present in array, 
then print the triplet and return true. Else return false.

i/p :: array = {12, 3, 4, 1, 6, 9}, sum = 24
o/p :: true

i/p :: array = {1,2,3,4,5,6}, sum = 16
o/p :: false

sum = 24
[12, 3, 4, 1, 6, 9]
12+3+9 = 24

 0  1  2  3  4  5
[1, 3, 4, 6, 9, 12]
    i     
             l  r
       
 1 + 3 + 12 = 16
 1 + 4 + 12 = 16
 1 + 6 + 12 = 19
 1 + 9 + 12 = 23
 
TC -> O(n^2)
SC -> O(1)

Approach 2 
 0  1  2  3  4  5
[1, 3, 4, 6, 9, 12]

a + b + c = 24
a + b = 24 - c
3 + 9 = 24 - 12
 
HashMap<Key, Value>
        12
*/

import java.io.*;

class MyCode {
	public static void main (String[] args) {
		System.out.println("Solution");
    int[] inputArray = {1, 3, 4, 6, 9, 12};
    int target = 24;
    System.out.println(findThreeSum(inputArray, target));
  }
  
  public static boolean findThreeSum(int[] inputArray, int target){
      if(inputArray == null || inputArray.length == 0){
        return false;
      }
       int sum = 0; 
      for(int i = 0; i < inputArray.length - 2; i++){
        sum = inputArray[i];
        int left = i + 1;
        int right = inputArray.length - 1;
        while(left < right){
          int total = sum + inputArray[left] + inputArray[right]; 
          if( total == target){
            return true;
          }
          if(total < target){
            left++;
          } else {
            right--;
          }
        }
      }  
      return false; 
  }
}
