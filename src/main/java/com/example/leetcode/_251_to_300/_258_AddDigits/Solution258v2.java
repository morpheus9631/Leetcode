package com.example.leetcode._251_to_300._258_AddDigits;

/*
 * Your runtime beats 24.54% of java submissions.
 */

public class Solution258v2 implements Solution258
{
  public int addDigits(int num) 
  {
    if (num < 10) return num; 
    return addDigits((num/10) + (num%10));
  }
}
