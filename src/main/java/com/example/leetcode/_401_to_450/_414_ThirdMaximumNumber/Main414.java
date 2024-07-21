package com.example.leetcode._401_to_450._414_ThirdMaximumNumber;

import java.util.Arrays;

public class Main414
{
  public static void main(String[] args)
  {
    System.out.println("414. Third Maximum Number");
    
    String format = "\r\nInput = %s"
                  + "\r\nOutput: %d"
                  ;
    
    Solution414 sol = new Solution414v2();
    for (int[] nums : _testCases)
    {
      int res = sol.thirdMax(nums);
      System.out.println(String.format(format, Arrays.toString(nums), res));
    }
  }

  private static int[][] _testCases = 
  {
      {3, 2, 1}
    , {1, 2 }
    , {2, 2, 3, 1}
    , {1, 1, 2}
    , {1, 2, -2147483648}  // Expected: -2147483648
  }; 
}
