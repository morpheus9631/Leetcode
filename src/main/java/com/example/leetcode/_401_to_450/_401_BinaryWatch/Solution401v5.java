package com.example.leetcode._401_to_450._401_BinaryWatch;

import java.util.LinkedList;
import java.util.List;

/*
 * Your runtime beats 65.80% of java submissions.
 * 
 * or 
 * 
 * Your runtime beats 80.32% of java submissions.
 */

public class Solution401v5 implements Solution401
{
  private int[][] hourArray = 
  {
    {0},              // 0 個 1 的數字  
    {1, 2, 4, 8},     // 1 個 1 的數字
    {3, 5, 6, 9, 10}, // 2 個 1 的數字
    {7, 11}           // 3 個 1 的數字
  };
  
  private int[][] minuteArray = 
  {
    {0}, 
    {1, 2, 4, 8, 16, 32}, 
    {3, 5, 6, 9, 10, 12, 17, 18, 20, 24, 33, 34, 36, 40, 48}, 
    {7, 11, 13, 14, 19, 21, 22, 25, 26, 28, 35, 37, 38, 41, 42, 44, 49, 50, 52, 56}, 
    {15, 23, 27, 29, 30, 39, 43, 45, 46, 51, 53, 54, 57, 58}, 
    {31, 47, 55, 59}
  };
  
  public List<String> readBinaryWatch(int num)
  {
    List<String> res = new LinkedList<String>();

    int max_h = Math.min(num, 3);
    for (int i=0; i <= max_h; i++)
    {
      int j = num - i;
      if (j > 5) continue;
      
      for (int h : hourArray[i]) {
        for (int m : minuteArray[j]) {
          res.add(h+":"+(m>=10 ? m : "0"+m));
        }  
      }
    }
    return res;
  }
}
