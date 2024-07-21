package com.example.leetcode._351_to_400._371_SumOfTwoIntegers;


public class Solution371v1 implements Solution371
{
  public int getSum(int a, int b)
  {
    int result = a ^ b;
    int carray = (a & b) << 1;
    
    if (carray != 0) return getSum(result,carray);
  
    return result;  
  }
}
