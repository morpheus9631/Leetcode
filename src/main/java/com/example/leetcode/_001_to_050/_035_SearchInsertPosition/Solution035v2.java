package com.example.leetcode._001_to_050._035_SearchInsertPosition;

import java.util.Arrays;

public class Solution035v2 implements Solution035
{
  public int searchInsert(int[] nums, int target)
  {
  	if (nums == null) return -1;

  	int len = nums.length;
  	if (len == 0) return 0;
  	
  	Arrays.sort(nums);
  	
  	int i = 0;
  	for (; i<len; i++) {
  		if (nums[i] >= target) { break; }
  	}
  	
  	return i;
  }
}
