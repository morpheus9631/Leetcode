package com.example.leetcode._051_to_100._081_SearchInRotatedSortedArrayII;

public class Solution081v1 implements Solution081
{
  public boolean search(int[] nums, int target) 
  {
    if (nums == null || nums.length == 0) return false;
    
    int len = nums.length;
    int left = 0, right = len - 1;
    
    while (left <= right)
    {
      int mid = (left + right) / 2;
      if (nums[mid] == target) return true;
      
      if (nums[mid] > nums[left]) 
      {
        if (nums[left] <= target && target < nums[mid])
          right = mid - 1;
        else
          left = mid + 1;
      }
      else if (nums[mid] < nums[left]) 
      {
        if (nums[mid] < target && target <= nums[right])
          left = mid + 1;
        else
          right = mid - 1;
      }
      else if (nums[mid] == nums[left])
        left++;
    }
    
    return false;
  }
}
