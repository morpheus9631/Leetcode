package com.example.leetcode._251_to_300._283_MoveZeroes;

import java.util.Arrays;

/*
 * Your runtime beats 17.62% of java submissions.
 */

public class Solution283v1 implements Solution283 
{
  public void moveZeroes(int[] nums)
  {
    int[] tmp = Arrays.copyOf(nums, nums.length);
    
    int idx = 0;
    for (int i=0; i<nums.length; i++) {
      if (tmp[i] != 0) nums[idx++] = tmp[i];
    }
    
    while (idx < tmp.length) nums[idx++] = 0;
  }
}
