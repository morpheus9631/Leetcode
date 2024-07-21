package com.example.leetcode._001_to_050._039_CombinationSum;

import java.util.Arrays;
import java.util.List;

import com.example.leetcode.utils.myListUtils;
import com.example.leetcode.utils.myStringUtils;

public class Main039
{
  public static void main(String[] args)
  {
    System.out.println("39. Combination Sum");
    
    Solution039 sol = new Solution039v1();
    
    for (int[][] test_case : _testCases)
    {
      int[] candidates = test_case[0];
      int target = test_case[1][0];
      
      List<List<Integer>> solset = sol.combinationSum(candidates, target);
      
      String solsetStr = myListUtils.toString(solset);
      
      String outstr = 
          String.format(_format, Arrays.toString(candidates), target)
          .replace(_replaceStr, solsetStr);
                     
      System.out.println(outstr);
    }
  }
  
  private static int[][][] _testCases =
  {
      { {2,3,6,7}, {7} }
    , { {8,6,4,12,5,7,3,11}, {28} }
  };
  
  private static String _replaceStr = "###";
  
  private static String _format = 
        "\r\nCandidates = %s"
      + "\r\nTarget = %d"
      + "\r\n\r\nA solution set is:"
      + "\r\n" + _replaceStr
      + "\r\n\r\n" + myStringUtils.dashLine()
      ;
}
