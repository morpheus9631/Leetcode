package com.example.leetcode.sort;

public class BubbleSort
{
  public static void Sort(int[] nums)
  {
    for (int i=nums.length-1; i>0; --i)
    {
      boolean swapped = false;
      for (int j = 0; j < i; ++j)
      {  
        if (nums[j] > nums[j + 1])
        {
          int tmp = nums[j]; nums[j] = nums[j+1]; nums[j] = tmp; 
          swapped = true;
        }
      }  
      if (!swapped) break;
    }
  }
}