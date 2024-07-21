package com.example.leetcode._151_to_200._189_RotateArray;

import java.util.Arrays;

import com.example.leetcode.utils.myStringUtils;

public class Main189
{
  public static void main(String[] args)
  {
    System.out.println("189. Rotate Array");
    
    String format = "\r\nn= %d, k = %d"
                  + "\r\nArray: %s"
                  + "\r\nRotated: %s"
                  + "\r\n\r\n" + myStringUtils.dashLine()
                  ;
    
    
    Solution189 sol = new Solution189v2();
    
    for (int[] testcase : _testCases)
    {
      int n = testcase[0];
      int k = testcase[1];

      int[] nums = createArray(n);
      String str1 = Arrays.toString(nums);
      
      sol.rotate(nums, k);
      String str2 = Arrays.toString(nums);
      
      System.out.println(String.format(format, n, k, str1, str2));
    }
  }
  
  private static int[][] _testCases = 
  {
    { 7, 3 }, { 2, 1 }    
  };
  
  private static int[]  createArray(int n) 
  {
    int[] array = new int[n];
    for (int i=0; i<n; i++) array[i] = i+1;
    
    return array;
  };
}
