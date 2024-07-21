package com.example.leetcode._151_to_200._189_RotateArray;

public class Solution189v1 implements Solution189
{
  public void rotate(int[] nums, int k) 
  {
    if (nums.length == 1) return;

    int len = nums.length;;

    k = k % len;
    int[] tmp = new int[k];
    
    for (int i=len-1; i>=0; i--)
    {
      if (i >= len-k) 
        tmp[i-len+k] = nums[i];
      else 
        nums[i+k] = nums[i];
    }
    for (int i=0; i<k; i++) nums[i] = tmp[i];
  }
}
