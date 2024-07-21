package com.example.leetcode._201_to_250._215_KthLargestElementInAnArray;

import java.util.Arrays;

public class Solution215v1 implements Solution215
{
  public int findKthLargest(int[] nums, int k) 
  {
    if (nums == null) throw new IllegalArgumentException("Illegal nums");
    if (nums.length == 0) return 0;
    if (nums.length < k) return 0;
    
    Arrays.sort(nums);
    return nums[nums.length - k];
  }
}
