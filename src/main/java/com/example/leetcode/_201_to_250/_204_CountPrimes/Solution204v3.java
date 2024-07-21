package com.example.leetcode._201_to_250._204_CountPrimes;

/*
 *  Your runtime beats 92.34% of java submissions.
 */

public class Solution204v3 implements Solution204
{
  public int countPrimes(int n) 
  {
    boolean res[] = new boolean[n];
    
    for(int i=2; i*i<n; i++)
    {
      if (!res[i]) 
      {
        for (int j=i; i*j<n; j++) {
          res[i * j] = true;
        }
      }
    }
    
    int count = 0;
    for (int i=2; i<n; i++) 
      if (res[i] == false) count++;
    return count;  
  }
}
