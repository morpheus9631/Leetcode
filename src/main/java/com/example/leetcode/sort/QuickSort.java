package com.example.leetcode.sort;

public class QuickSort
{
  public static void sort(int nums[])
  {
    sort(nums, 0, nums.length-1);
  }

  public static void sort(int nums[], int left, int right) 
  {
    if (nums == null || nums.length == 0) return;
    
    if (left >= right) return;
 
    // pick the pivot
    int mid = left + (right - left) / 2;
    int pivot = nums[mid];
 
    // make left < pivot and right > pivot
    int i = left, j = right;
    while (i <= j) 
    {
      while (nums[i] < pivot) i++;
      while (nums[j] > pivot) j--;
 
      if (i <= j) 
      {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        j--;
      }
    }
 
    // recursively sort two sub parts
    if (left < j) sort(nums, left, j);
    if (right > i) sort(nums, i, right);
  }
}
