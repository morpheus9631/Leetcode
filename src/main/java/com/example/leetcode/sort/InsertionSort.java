package com.example.leetcode.sort;

import java.util.List;

public class InsertionSort
{
  public static void sort(List<Integer> list)
  {
    int size = list.size();
    for (int i=0; i<size; ++i)
    {
      int n = list.get(i);
      int j = size - 1;

      while (j >= 0 && list.get(j) > n) --j;
      list.add(j+1, n);
      list.remove(i);
    }
  }
      
  public static void sort(int[] nums)
  {
    int j, n;
    for (int i=1; i<nums.length; ++i)
    {
      n = nums[i];
      
      for (j=i-1; j >= 0 && nums[j] > n; --j)
        nums[j+1] = nums[j];
      
      nums[j+1] = n;
    }
  }  
}
