package com.example.leetcode._151_to_200._169_MajorityElement;

import java.util.Arrays;

public class Main169
{
  public static void main(String[] args)
  {
    System.out.println("169. Majority Element");
    
    String format = "\r\nS = %s"
                  + "\r\nThe majority element is %s.";

    Solution169v4 sol = new Solution169v4();
    
    for (int[] nums : _testCases)
    {
      String numStr = Arrays.toString(nums);
      
      int res = sol.majorityElement(nums);
      String resStr = (res == Integer.MIN_VALUE)
                    ? "not exist" : String.valueOf(res);
      
      System.out.println(String.format(format, numStr, resStr));
    }
  }
  
  private static int[][] _testCases = 
  {
      { 3, 3, 4, 2, 4, 4, 2, 4, 4 }    // Excepted: 4
    , { 3, 3, 4, 2, 4, 4, 2, 4 }       // Excepted: NONE
    , { 3, 3, 4 }                      // Excepted: 3
    , { 2, 2 }                         // Excepted: 2
    , { -1, 1, 1, 1, 2, 1 }            // Excepted: 1
  };
}
