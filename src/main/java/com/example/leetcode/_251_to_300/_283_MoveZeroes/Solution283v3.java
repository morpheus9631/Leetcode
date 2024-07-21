package com.example.leetcode._251_to_300._283_MoveZeroes;

/*
 * Your runtime beats 17.62% of java submissions.
 */

public class Solution283v3 implements Solution283 
{
  public void moveZeroes(int[] nums)
  {
    int idx = 0;
    
    for (int i=0; i<nums.length; i++) {
      if (nums[i] != 0) nums[idx++] = nums[i];
    }
    
    for (; idx < nums.length; idx++)
      nums[idx] = 0;
  }
}
