package com.example.leetcode._301_to_350._335_SelfCrossing;

/*
 * 可能會 timeout
 */

public class Solution335v3 implements Solution335
{
  public boolean isSelfCrossing(int[] x) 
  {  
    if(x.length <= 3) return false;
    
    boolean flag = x[2] > x[0];
    
    for(int i = 3; i< x.length; i++)  
    {  
      if(!flag && x[i] >= x[i-2]) return true;  
     
      if(flag && x[i] <= x[i-2])  
      {  
        flag = false;  
        x[i-1] = (x[i]+(i>=4?x[i-4]:0)) <x[i-2]?x[i-1]:(x[i-1]-x[i-3]);  
      }  
    }  
    return false;  
  }  
}
