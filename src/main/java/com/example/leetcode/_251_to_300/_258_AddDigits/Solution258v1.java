package com.example.leetcode._251_to_300._258_AddDigits;

/*
 * Your runtime beats 24.54% of java submissions.
 */

public class Solution258v1 implements Solution258
{
  public int addDigits(int num) 
  {
    while (num >= 10) {
      num = (num/10) + (num%10);
    }
    return num;
  }
}
