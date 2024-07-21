package com.example.leetcode._001_to_050._016_3SumClosest;

import java.util.Arrays;

/*
 * 2017.02.23: Time Limit Exceeded
 */

public class Solution016v1 implements Solution016
{
  public int threeSumClosest(int[] nums, int target) 
  {
    if (nums == null) throw new IllegalArgumentException("Illegal nums");
    if (nums.length == 0) return 0;

    Arrays.sort(nums);
    
    int closest = nums[0]+nums[1]+nums[2];
    
    for (int i=0; i<nums.length-2; i++) 
    {
      for (int j=i+1; j<nums.length-1; j++) 
      {
        for (int k=j+1; k<nums.length; k++)
        {
          int sum = nums[i] + nums[j] + nums[k];
          
          if (closest == target) 
            return closest;
          else if (Math.abs(sum-target) < Math.abs(closest-target))
            closest = sum;
        }
      }
    }
    return closest;
  }
}
