package com.example.leetcode._001_to_050._029_DivideTwoIntegers;

public class Solution029v1 implements Solution029
{
  public int divide(int dividend, int divisor) 
  {
    long result = 0;
    
    long dvd = Math.abs((long) dividend);; 
    long dvs = Math.abs((long) divisor);
    
    boolean isNeg = (dividend < 0);
    if (divisor < 0) isNeg = !isNeg;
    
    int len = 0;
    while (dvd >= dvs) 
    {
      dvs = dvs << 1;
      len++;
    }
  
    while (len >= 0) 
    {
      if (dvd >= dvs) 
      {
        result += Math.pow(2, len);
        dvd -= dvs;
      }
      dvs = dvs >> 1;
      len--;
    }   
    if ((result > Integer.MAX_VALUE) && !isNeg)
      result = Integer.MAX_VALUE;
    
    return (isNeg) ?  -(int) result : (int) result;
  }
}
