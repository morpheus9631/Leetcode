package com.example.leetcode._001_to_050._035_SearchInsertPosition;

public class Solution035v1 implements Solution035
{
  public int searchInsert(int[] nums, int target) 
  {
    int left = 0, right = nums.length-1;

    int mid = -1;
    boolean isFound = false;
    while (left <= right)
    {
      mid = (left+right) / 2;
      if (nums[mid] == target)
      {
        isFound = true;
        break;
      }
      else if(nums[mid] < target)
        left = mid + 1;
      else if (nums[mid] > target)
        right = mid - 1;
    }
    return (isFound) ? mid : left;
  }
}
