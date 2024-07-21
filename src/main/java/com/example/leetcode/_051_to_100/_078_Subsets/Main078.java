package com.example.leetcode._051_to_100._078_Subsets;

import java.util.List;

import com.example.leetcode.utils.myArrayUtils;
import com.example.leetcode.utils.myListUtils;
import com.example.leetcode.utils.myStringUtils;

public class Main078
{
  public static void main(String[] args)
  {
    System.out.println("78. Subsets");
    
    String replaceStr = "###";
    
    String format = "\r\nNums = %s"
                  + "\r\n\r\nSolution is:"
                  + "\r\n" + replaceStr
                  + "\r\n\r\n" + myStringUtils.dashLine();
    
    Solution078 sol = new Solution078v1();
    
    for (int[] nums : _testCases)
    {
      List<List<Integer>> res = sol.subsets(nums);
      
      String outstr = String.format(format, myArrayUtils.toString(nums))
                      .replace(replaceStr, myListUtils.toString(res));
      System.out.println(outstr);
    }  
  }
  
  private static int[][] _testCases =
  {
    {1,2,3}      
  };
}
