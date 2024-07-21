package com.example.leetcode._201_to_250._216_CombinationSumIII;

import java.util.List;

import com.example.leetcode.utils.myListUtils;
import com.example.leetcode.utils.myStringUtils;

public class Main216
{
  public static void main(String[] args)
  {
    System.out.println("216. Combination Sum III");
    
    String format = "\r\nk = %d, n = %d"
                  + "\r\nReturn:\r\n%s"
                  + "\r\n\r\n" + myStringUtils.dashLine()
                  ;
    
    Solution216 sol = new Solution216v1();
    
    for (int[] testcase : _testCases)
    {
      int k =testcase[0];
      int n =testcase[1];
      List<List<Integer>> res = sol.combinationSum3(k, n);

      System.out.println(
          String.format(format, k, n, myListUtils.toString(res)));
    }
  }

  private static int[][] _testCases = 
  {
      {3, 7}      // Expected: [[1,2,4]]
    , {3, 9}      // Expected: [[1,2,6], [1,3,5], [2,3,4]]
    , {3, 2}      // Expected: []
    , {6, 30}     // [[1,2,3,7,8,9],[1,2,4,6,8,9],[1,2,5,6,7,9],[1,3,4,5,8,9],[1,3,4,6,7,9],[1,3,5,6,7,8],[2,3,4,5,7,9],[2,3,4,6,7,8]]
  };
}
