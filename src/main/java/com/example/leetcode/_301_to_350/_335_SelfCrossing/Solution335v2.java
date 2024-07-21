package com.example.leetcode._301_to_350._335_SelfCrossing;

public class Solution335v2 implements Solution335
{
  public boolean isSelfCrossing(int[] x) 
  {
    int len = x.length;
    for (int i=3; i<len; i++) 
    {
      if (x[i] >= x[i-2] && x[i-3] >= x[i-1]) {
        return true;
      }
      
      if (i >= 4 && x[i-1] == x[i-3] && x[i] >= x[i-2]-x[i-4]) {
        return true;
      }
      
      if (i >= 5 && x[i-2] >= x[i-4] && x[i-3] >= x[i-1] 
                 && x[i-1] >= x[i-3]-x[i-5] && x[i] >= x[i-2]-x[i-4]) 
      {
        return true;
      }
    }
    return false;
  }
}
