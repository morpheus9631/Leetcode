package com.example.leetcode._151_to_200._169_MajorityElement;

import java.util.Arrays;

public class Solution169v2 implements Solution169
{
  public int majorityElement(int[] nums) 
  {
    int res = Integer.MIN_VALUE;
    
    if (nums.length == 1) return nums[0];

    if (nums.length == 2) { 
      return (nums[0] == nums[1]) ? nums[0] : Integer.MIN_VALUE;
    }  
    
    Arrays.sort(nums);
    
    int major = nums[0];
    int count = 1;
    for (int i=1; i<nums.length; i++)
    {
      if (nums[i] == major)
      {
        count++;
        if (count > (nums.length/2)) return major;
      }
      else if (nums[i] != major)
      {
        major = nums[i];
        count = 1;
      }
    }
 
    return res;
  }
}
