package com.example.leetcode._401_to_450._413_ArithmeticSlices;

public class Solution413v1 implements Solution413
{
  public int numberOfArithmeticSlices(int[] A) 
  {
    if (A == null) return 0;
    
    int len = A.length;
    if (len < 3) return 0;

    int cnt = 0, sum = 0;
    for (int i=2; i<len; i++)
    {
      if (A[i]-A[i-1] == A[i-1]-A[i-2])
      {  
        cnt++;
        sum += cnt;
      }  
      else
        cnt = 0;
    }
    return sum;
  }
}
