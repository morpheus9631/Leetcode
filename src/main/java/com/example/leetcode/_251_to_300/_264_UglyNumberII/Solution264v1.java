package com.example.leetcode._251_to_300._264_UglyNumberII;


public class Solution264v1 implements Solution264
{
  public int nthUglyNumber(int n) 
  {
    int[] nums = new int[n+1];
    nums[0] = 1;

    int i = 1, idx2 = 0, idx3 = 0, idx5 = 0;
    while (i < n)
    {
      int a = nums[idx2] * 2;
      int b = nums[idx3] * 3;
      int c = nums[idx5] * 5;
      nums[i] = Math.min(a, Math.min(b, c));
      
      if (nums[i] == a) idx2++;
      if (nums[i] == b) idx3++;
      if (nums[i] == c) idx5++;

      i++;
    }
    return nums[n-1];
  }
}
