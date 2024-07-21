package com.example.leetcode._201_to_250._228_SummaryRanges;

import java.util.Arrays;
import java.util.List;

import com.example.leetcode.utils.myStringUtils;

public class Main228
{
  public static void main(String[] args)
  {
    System.out.println("228. Summary Ranges");
    
    String format = "\r\nS = %s"
                  + "\r\n\r\nReturn: %s"
                  + "\r\n\r\n" + myStringUtils.dashLine()
                  ;
    
    Solution228 sol = new Solution228v1();
    
    for (int[] nums : _testCases)
    {
      List<String> list = sol.summaryRanges(nums);
      System.out.println(
          String.format(format, Arrays.toString(nums), list.toString()));
    }
  }
  
  private static int[][] _testCases = 
  {
      {0,1,2,3,4,5,7}  // Expected: ["0->2","4->5","7"]
    , {0,1,2,4,5,7,8}  // Expected: ["0->2","4->5","7->8"]
    , {1,3}            // Expected: ["1","3"]
  };
}
