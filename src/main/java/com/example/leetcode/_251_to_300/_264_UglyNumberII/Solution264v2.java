package com.example.leetcode._251_to_300._264_UglyNumberII;


public class Solution264v2 implements Solution264
{
  public int nthUglyNumber(int n) 
  {
    int[] nums = new int[n+1];
    nums[0] = 1;
    
    int idx2 = 0, idx3 = 0, idx5 = 0;
    
    int i = 1; 
    while (i < n)
    {
      int x = nums[idx2] * 2;
      int y = nums[idx3] * 3;
      int z = nums[idx5] * 5;
      nums[i] = min(x, y, z);
      
      if (nums[i] == x) idx2++;
      if (nums[i] == y) idx3++;
      if (nums[i] == z) idx5++;

      i++;
    }
    return nums[n-1];
  }
  
  private int min(int x, int y, int z)
  {
    return (((x < y) ? x : y) < z) ? ((x < y) ? x : y) : z;
  }
}
