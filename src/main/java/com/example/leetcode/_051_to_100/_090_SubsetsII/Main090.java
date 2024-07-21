package com.example.leetcode._051_to_100._090_SubsetsII;

import java.util.Arrays;
import java.util.List;

import com.example.leetcode.utils.myListUtils;
import com.example.leetcode.utils.myStringUtils;

public class Main090
{
  public static void main(String[] args)
  {
    System.out.println("90. Subsets II");
    
    String format = "\r\nNums: %s"
                  + "\r\nSolution is:\r\n%s"
                  + "\r\n\r\n" +myStringUtils.dashLine()
                  ;
    
    Solution090 sol = new Solution090v1();
    
    for (int[] nums : _testCases)
    {
      List<List<Integer>> res = sol.subsetsWithDup(nums);
      
      System.out.println(String.format(format, 
          Arrays.toString(nums), myListUtils.toString(res)));
    }  
  }
  
  private static int[][] _testCases = 
  {
    {1,2,2} ,{0}   
  };
}
