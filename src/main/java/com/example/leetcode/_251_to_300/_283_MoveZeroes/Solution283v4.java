package com.example.leetcode._251_to_300._283_MoveZeroes;

/*
 * Your runtime beats 17.62% of java submissions.
 */

public class Solution283v4 implements Solution283 
{
  public void moveZeroes(int[] nums)
  {
    if (nums == null) return; 
   
    for (int i=0, j=0; i < nums.length; i++) 
    {
      if (nums[i] != 0)
      {
        if (i != j) 
        {
          nums[j] = nums[i];
          nums[i] = 0;
        }
        j++;
      }
    }
  }
}
