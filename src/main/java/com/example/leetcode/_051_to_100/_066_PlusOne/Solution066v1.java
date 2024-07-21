package com.example.leetcode._051_to_100._066_PlusOne;

/*
 * Your runtime beats 49.07% of java submissions.
 */

public class Solution066v1 implements Solution066
{
  public int[] plusOne(int[] digits) 
  {
    int c = 1;
    for (int i=digits.length-1; i>=0; i--)
    {
      int tmp = digits[i] + c;
      digits[i] = tmp % 10;
      c = tmp / 10;
    }
    
    if (c > 0)
    {
      int[] res = new int[digits.length+1];
      res[0] = c;
      for (int i=0; i<digits.length; i++)
        res[i+1] = digits[i];
      return res;
    }
    
    return digits;
  }
}
