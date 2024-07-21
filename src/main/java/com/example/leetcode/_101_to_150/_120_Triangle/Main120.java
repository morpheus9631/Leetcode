package com.example.leetcode._101_to_150._120_Triangle;

import java.util.List;

import com.example.leetcode.utils.Triangle;
import com.example.leetcode.utils.myStringUtils;

/*
 * 120. Triangle
 * 
 *   Given a triangle, find the minimum path sum from top to bottom. 
 *   
 *   Each step you may move to adjacent numbers on the row below.
 *   
 *   
 *   For example, given the following triangle
 *   
 *   [
 *        [2],
 *       [3,4],
 *      [6,5,7],
 *     [4,1,8,3]
 *   ]
 *   
 *   The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11). 
 */
public class Main120
{
  public static void main(String[] args)
  {
    System.out.println("120. Triangle");
    
    String format = "\r\nTriangle:"
                  + "\r\n\r\n%s"
                  + "\r\n\r\nThe minimum path sum is %d"
                  + "\r\n\r\n" + myStringUtils.dashLine();
    
    Solution120v2 sol = new Solution120v2();
    
    for (int[][] nums : _testCases)
    {
      List<List<Integer>> triangle = Triangle.toTriangle(nums);
      
      int minSum = sol.minimumTotal(triangle);
      
      System.out.println(
          String.format(format, Triangle.toString(triangle), minSum));
    }
  }
  
  private static int[][][] _testCases = 
  {
      { {2}, {3,4}, {6,5,7}, {4,1,8,3} }      // Expected: 11
    , { {1}, {2,3} }                          // Expected: 3    
  };
  
  
  
}
