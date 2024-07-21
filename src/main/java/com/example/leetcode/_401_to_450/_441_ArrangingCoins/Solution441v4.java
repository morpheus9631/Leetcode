package com.example.leetcode._401_to_450._441_ArrangingCoins;

/*
 * Your runtime beats 46.37 % of java submissions.
 */

public class Solution441v4 implements Solution441
{
  public int arrangeCoins(int n) 
  {
    int rows = 0;
    
    do {
      n -= rows;
    } while (n >= ++rows);
    
    return --rows;  
  }
}
