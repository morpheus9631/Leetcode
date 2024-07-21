package com.example.leetcode._051_to_100._080_RemoveDuplicatesFromSortedArrayII;

public class Solution080v2 implements Solution080
{
  public int removeDuplicates(int[] nums) 
  {
    int count = 0;
    int j = 1;
  
    for(int i=2; i<nums.length; i++)
    {
      if (nums[i] == nums[j] && nums[i] == nums[j-1]) {
        count++;
      }
      else 
      {
        if (j+1 != i) {
          int tmp = nums[i]; nums[i] = nums[j+1]; nums[j+1] = tmp;
        }
        j++;
      }
    }
    return nums.length-count;
  }
}
