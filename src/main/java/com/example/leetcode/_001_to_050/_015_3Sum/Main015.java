package com.example.leetcode._001_to_050._015_3Sum;

import java.util.Arrays;
import java.util.List;

import com.example.leetcode.utils.myListUtils;
import com.example.leetcode.utils.myStringUtils;

public class Main015
{

  public static void main(String[] args)
  {
    System.out.println("15. 3Sum");
    
    
    Solution015 sol = new Solution015v3();
    
    int[][] testcases = getTestCases();
    for (int[] nums : testcases)
    {
      List<List<Integer>> solset = sol.threeSum(nums);
      
      String solsetStr = myListUtils.toString(solset);
      String outstr = String.format(_format, Arrays.toString(nums))
                      .replace(_replaceStr, solsetStr);
      
      System.out.println(outstr);
    }
  }

  private static int[][] getTestCases()
  {
    int[][] testcases =
    {
        { -1, 0, 1, 2, -1, -4 }  // Expected: [-1, 0, 1], [-1, -1, 2]
      , { 0, 0 }
      , { 1, 2, -2, -1 }         // Expected: []
      , { 3,0,-2,-1,1,2 }        // Expected: [[-2,-1,3],[-2,0,2],[-1,0,1]]
      , { 
           7,  -1,  14, -12,  -8,   7,   2, -15,   8,   8, 
          -8, -14,  -4,  -5,   7,   9,  11,  -4, -15,  -6, 
           1,  14,   4,   3,  10,  -5,   2,   1,   6,  11, 
           2,  -2,  -5,  -7,  -6,   2, -15,  11,  -6,   8, 
          -4,   2,   1,  -1,   4,  -6, -15,   1,   5, -15, 
          10,  14,   9,  -8,  -6,   4,  -6,  11,  12, -15, 
           7,  -1,  -9,   9,  -1,   0,  -4,  -1, -12,  -2, 
          14,  -9,   7,   0,  -3,  -4,   1,  -2,  12,  14, 
         -10,   0,   5,  14,  -1,  14,   3,   8,  10,  -8, 
           8,  -5,  -2,   6, -11,  12,  13,  -7, -12,   8, 
           6, -13,  14,  -2,  -5, -11,   1,   3,  -6
        }
    };
    return testcases;
  }
  
  private static String _replaceStr = "###";
  
  private static String _format =
        "\r\nS = %s"
      + "\r\n\r\nA solution set is:"
      + "\r\n" + _replaceStr
      + "\r\n\r\n" + myStringUtils.dashLine(); 
  
}
