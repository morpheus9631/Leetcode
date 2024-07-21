package com.example.leetcode._251_to_300._283_MoveZeroes;

/*
 * Your runtime beats 8.75% of java submissions.
 */

public class Solution283v2 implements Solution283 
{
  public void moveZeroes(int[] nums)
  {
    int left = 0, right = nums.length-1;
    
    while (left < right)
    {
      if (nums[left] == 0)
      {
        int i = left;
        while (i < right) 
        { 
          nums[i] = nums[i+1];
          i++;
        }
        nums[right--] = 0;
      }
      else
        left++;
    }
  }
}
