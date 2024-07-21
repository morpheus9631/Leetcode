package com.example.leetcode._001_to_050._015_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution015v3 implements Solution015
{
  public List<List<Integer>> threeSum(int[] nums) 
  {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    
    Arrays.sort(nums);
    
    int len = nums.length;
    for (int i=0; i<len-2; i++)
    {
      if (i > 0 && nums[i] == nums[i-1]) continue;
      
      int left = i + 1;
      int right = len - 1;
      
      while (left < right)
      {
        int sum = nums[left] + nums[right];

        if (nums[i] + sum == 0)
        {
          List<Integer> list = new ArrayList<Integer>(
              Arrays.asList(nums[i], nums[left], nums[right]));
          res.add(list);
          
          while (left < right && nums[left] == nums[left+1] &&
              nums[right] == nums[right-1])
         {
           left++; right--; 
         }
         left++; right--;
        }
        else if (nums[i] + sum < 0)
        {
          left++;
        }
        else if (nums[i] + sum > 0)
        {
          right--;
        }
      }
    }
    return res;
  }
}
