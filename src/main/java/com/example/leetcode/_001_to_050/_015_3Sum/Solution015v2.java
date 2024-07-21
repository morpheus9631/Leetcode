package com.example.leetcode._001_to_050._015_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution015v2 implements Solution015
{
  public List<List<Integer>> threeSum(int[] nums) 
  {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    
    if (nums.length < 3) return res;
    
    Arrays.sort(nums);

    int len = nums.length;
    for (int i=0; i<len-2; i++)
    {
      int v1 = nums[i];
      if (v1 > 0) continue;

      for (int j=i+1; j<len-1; j++)
      {
        int v2 = nums[j];
        int v3 = -(v1 + v2);

        int k = isFind(nums, v3, j+1, len-1);
        if (k > j) 
        {
          List<Integer> list = new ArrayList<Integer>(
              Arrays.asList(v1, v2, v3));
          //Collections.sort(list);
          
          if (!res.contains(list)) res.add(list);
        }
      }
    }
    return res;
  }
  
  private int isFind(int[] nums, int target, int start, int end)
  {
    int idx = -1;
    
    while (start <= end)
    {
      int mid = (start + end) / 2;
      
      if (nums[mid] < target)
        start = mid + 1;
      else if (nums[mid] > target)
        end = mid - 1;
      else if (nums[mid] == target) {
        idx = mid;
        break;
      }
    }
    return idx;
  }
}