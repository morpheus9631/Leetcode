package com.example.leetcode._401_to_450._441_ArrangingCoins;

/*
 * Your runtime beats 46.37 % of java submissions.
 */

public class Solution441v2 implements Solution441
{
  public int arrangeCoins(int n) 
  {
    int rows = 0;

    while (n > 0  && n >= ++rows) {
      n -= rows;
    }
    if (n != 0) rows--;
    return rows;
  }
}
