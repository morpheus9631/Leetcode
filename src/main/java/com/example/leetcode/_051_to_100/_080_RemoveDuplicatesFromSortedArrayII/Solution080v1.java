package com.example.leetcode._051_to_100._080_RemoveDuplicatesFromSortedArrayII;

/*
 * 題目中沒有說道還要調整陣列中的順序
 */

public class Solution080v1 implements Solution080
{
  public int removeDuplicates(int[] nums) 
  {
    if (nums.length <= 2) return nums.length;

    int i = 2, j = 1, count = 0; 
    while (i < nums.length)
    {
      if (nums[i] == nums[j] && nums[i] == nums[j-1]) {
        count++;
      }
      else
      {
        if (j+1 < i) {
          int tmp = nums[i]; nums[i] = nums[j+1]; nums[j+1] = tmp;
        }
        j++;
      }
      i++;
    }
    return nums.length - count;
  }
}
