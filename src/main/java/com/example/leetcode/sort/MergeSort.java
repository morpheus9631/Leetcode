package com.example.leetcode.sort;

public class MergeSort
{
  public static void sort(int[] nums)
  {
    int len = nums.length;
    int[] tmp = new int[len];
    divide(nums, 0, len-1, tmp);
  }

  private static void divide(int[] nums, int start, int end, int[] tmp) 
  {
    if (start >= end) return;
    
    int mid = (start + end) / 2;
    divide(nums, start, mid, tmp);
    divide(nums, mid+1, end, tmp);
    merge(nums, start, mid, end, tmp);
  }

  private static void merge(int[] nums, int start, int mid, int end, int[] tmp) 
  {
    int left = start;
    int right = mid+1;
    int idx = start;
    
    // merge two sorted sub-arrays in nums to tmp array
    while (left <= mid && right <= end) 
    {
      if (nums[left] < nums[right]) {
        tmp[idx++] = nums[left++];
      } else {
        tmp[idx++] = nums[right++];
      }
    }
    
    while (left <= mid) tmp[idx++] = nums[left++];
    while (right <= end) tmp[idx++] = nums[right++];
    
    // copy tmp back to nums
    for (idx = start; idx <= end; idx++) {
      nums[idx] = tmp[idx];
    }
  }  
}
