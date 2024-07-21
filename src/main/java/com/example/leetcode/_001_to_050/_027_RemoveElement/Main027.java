package com.example.leetcode._001_to_050._027_RemoveElement;

import java.util.Arrays;

import com.example.leetcode.utils.myStringUtils;

public class Main027
{

  public static void main(String[] args)
  {
    System.out.println("27. Remove Element");
    
    String format = "\r\nNums = %s"
                  + "\r\nVal = %d"
                  + "\r\n\r\nlength = %d"
                  + "\r\n\r\n" + myStringUtils.dashLine();

    Solution027 sol = new Solution027v1();
    
    int[][][] testcases = getTestCases();
    for (int[][] test_case : testcases)
    {
      int[] nums = test_case[0];
      int val = test_case[1][0];
      int length = sol.removeElement(nums, val);
      
      System.out.println(String.format(format, Arrays.toString(nums), val, length));
    }
  }
  
  public static int[][][] getTestCases()
  {
    int[][][] testcases = 
    {
        { {3,2,2,3}, {3} }
      , { {1},       {1} }
      , { {3,3},     {3} }
      , { {2,2,3},   {2} }
    };
    return testcases;
  }

}
