package com.example.leetcode._351_to_400._400_NthDigit;

/*
 * Your runtime beats 21.63% of java submissions.
 */

public class Solution400v2 implements Solution400
{
  public int findNthDigit(int n)
  {
    int len = 1;
    long count = 9;
    int start = 1;

    while (n > len * count) 
    {
      n -= len * count;
      len += 1;
      count *= 10;
      start *= 10;
    }

    start += (n-1) / len;
    String s = Integer.toString(start);
    return Character.getNumericValue(s.charAt((n-1) % len));  
  }
}
