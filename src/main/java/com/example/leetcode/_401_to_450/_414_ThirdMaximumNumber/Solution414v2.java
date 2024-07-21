package com.example.leetcode._401_to_450._414_ThirdMaximumNumber;

/*
 * Your runtime beats 91.78 % of java submissions.
 */
public class Solution414v2 implements Solution414
{
  public int thirdMax(int[] nums) 
  {
    if (nums.length == 1) return nums[0];
    
    if (nums.length == 2) 
      return (nums[0] > nums[1] ? nums[0] : nums[1]); 

    long max = Long.MIN_VALUE;
    long mid = Long.MIN_VALUE;
    long min = Long.MIN_VALUE;
    
    for (int n : nums)
    {
      if (n > max) 
      {
        min = mid; mid = max; max = n;
      }
      else if (n < max && n > mid)
      {
        min = mid; mid = n;
      }
      else if (n <mid && n > min)
      {
        min = n;
      }
    }
    
    return (int) ((min > Long.MIN_VALUE) ? min : max); 
  }
}
