package com.example.leetcode._051_to_100._096_UniqueBinarySearchTrees;

public class Solution096v1 implements Solution096
{
  public int numTrees(int n) 
  {
    if (n < 2) return n;
    
    int[] res = new int[n+2];
    res[0] = 0;
    res[1] = 1;
    
    for (int i=2; i<=n; i++) 
    {
      res[i] = 2 * res[i-1];
      for (int j=1; j<=i-1; j++) 
      {
        res[i] += res[j] * res[i-j-1];
      }
    }
    
    return res[n];
  }
}

