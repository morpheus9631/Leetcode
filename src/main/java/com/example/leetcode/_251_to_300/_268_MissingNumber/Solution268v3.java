package com.example.leetcode._251_to_300._268_MissingNumber;

import java.util.Arrays;

/*
 * 此法的執行效能沒有第二種好。
 */

public class Solution268v3 implements Solution268
{
  public int missingNumber(int[] nums) 
  {
    Arrays.sort(nums);
    
    int i = 0;
    for(; i<nums.length; i++) {
      if (i != nums[i]) break;
    }
    
    return i;
  }
}
