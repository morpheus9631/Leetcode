package com.example.leetcode._351_to_400._371_SumOfTwoIntegers;

/*
 * Your runtime beats 8.43% of java submissions.
 */

public class Solution371v2 implements Solution371
{
  public int getSum(int a, int b)
  {
    while (a != 0)
    {
      int c = (a & b) << 1; 
      b = a ^ b;
      a = c;
    }
  
    return b;  
  }
}
