package com.example.leetcode._301_to_350._310_MinimumHeightTrees;

import java.util.List;

import com.example.leetcode.utils.myArrayUtils;

public class Main310
{
  public static void main(String[] args)
  {
    System.out.println("310. Minimum Height Trees");
    
    String format = "\r\nn = %d"
                  + "\r\nedges = %s"
                  + "\r\nReturn: %s"
                  ;
    
    Solution310 sol = new Solution310v1();
    
    for (int[][][] testcase : _testCases)
    {
      int n = testcase[0][0][0];
      int[][] edges = testcase[1];
      List<Integer> res = sol.findMinHeightTrees(n, edges);
      
      String outstr = myArrayUtils.toRowString(edges);
      System.out.println(
          String.format(format, n, outstr, res.toString()));
    }
  }
  
  private static int[][][][] _testCases = 
  {
      { { {4} }, { {1,0}, {1,2}, {1,3} } }
    , { { {6} }, { {0,3}, {1,3}, {2,3}, {4,3}, {5,4} } }
  };
}
