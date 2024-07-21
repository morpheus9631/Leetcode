package com.example.leetcode.sort;

public class SelectionSort
{
  public static void sort(int[] nums)
  {
    int len = nums.length;
    for (int i=0; i<len; i++)
    {
      int minIdx = i;
      for (int j=i+1; j<len-1; j++)
      {
        if (nums[j] < nums[minIdx])
          minIdx = j;
      }
      if (minIdx != i)
      {
        int tmp = nums[minIdx]; 
        nums[minIdx] = nums[i];
        nums[i] = tmp;
      }
    }
  }
}
