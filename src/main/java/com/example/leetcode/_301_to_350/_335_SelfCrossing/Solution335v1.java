package com.example.leetcode._301_to_350._335_SelfCrossing;

public class Solution335v1 implements Solution335
{
  public boolean isSelfCrossing(int[] x) 
  {
    if (x == null) return false;    
    
    int len = x.length;
    if (len < 4) return false;
    
    for (int i=3; i<len; i++)
    {
      System.out.println(i);
      if (x[i-1] <= x[i-3] && x[i] >= x[i-2]) {
        return true;
      }
      
      if ((i >= 4) && (x[i-1] == x[i-3] && x[i]+x[i-4] >= x[i-2]) || 
                      (x[i-1] < x[i-3] && x[i] >= x[i-2]))
      {
        return true;
      }
          
      if ((i >= 5) && !(x[i] < x[i-2] && x[i-2] < x[i-4]) 
          && ((x[i-1] <  x[i-3]-x[i-5] && x[i] >= x[i-2]) ||
              (x[i-1] >= x[i-3]-x[i-5] && x[i-1] <= x[i-3] && x[i]+x[i-4] >= x[i-2])))
      {
           return true;
      }
    }
    return false;
  }
}
