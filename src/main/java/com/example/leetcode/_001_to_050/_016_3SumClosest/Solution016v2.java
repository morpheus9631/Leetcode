package com.example.leetcode._001_to_050._016_3SumClosest;

import java.util.Arrays;

public class Solution016v2 implements Solution016
{
  public int threeSumClosest(int[] nums, int target)
  {
    if (nums == null || nums.length < 3) return -1;
  
    Arrays.sort(nums);
    
    int bestSum = nums[0] + nums[1] + nums[2];
    for (int i=0; i < nums.length; i++) 
    {
      int start = i+1;
      int end = nums.length - 1;
      while (start < end) 
      {
        int sum = nums[i] + nums[start] + nums[end];
        if (Math.abs(target - sum) < Math.abs(target - bestSum)) {
            bestSum = sum;
        }
        if (sum < target) {
            start++;
        } else {
            end--;
        }
      }
    }
    return bestSum;  
  }
}
