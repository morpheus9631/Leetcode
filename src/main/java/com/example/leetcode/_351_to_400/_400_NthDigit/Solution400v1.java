package com.example.leetcode._351_to_400._400_NthDigit;

/*
 * Your runtime beats 13.12% of java submissions.
 */

public class Solution400v1 implements Solution400
{
  public int findNthDigit(int n)
  {
    int len = 1;
    long start = 0; 
    while (true)
    {
      start = (int) Math.pow(10.0, len-1);
      long digits = 9 * len * start;
      
      if (n <= digits) break;
      n -= digits;
      len++;
    }

    int value = (int) start + ((n-1)/len);
    int idx = (n-1) % len; 

    String str = Integer.toString(value);
    int res = Character.getNumericValue(str.charAt(idx));
    
    return res;
  }
}
