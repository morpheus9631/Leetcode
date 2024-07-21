package com.example.leetcode._001_to_050._033_SearchInRotatedSortedArray;

public class Solution033v1 implements Solution033
{
  public int search(int[] nums, int target) 
  {
    int res = -1;
    if (nums == null || nums.length == 0) return res;
    
    int left = 0, right = nums.length - 1;
    while (left <= right)
    {
      int mid = (left + right) / 2;
      if (nums[mid] == target) return mid;
      
      // [left ~ mid] is unrotated sorted  
      if (nums[mid] >= nums[left])
      {
        if (nums[left] <= target && target < nums[mid])
          right = mid - 1;
        else
          left = mid + 1;
      }

      // [mid ~ right] is unrotated sorted
      else 
      {
        if (nums[mid] < target && target <= nums[right])
          left = mid + 1;
        else
          right = mid - 1;
      }
    }
    return res;
  }
}
