package com.example.leetcode._251_to_300._300_LongestIncreasingSubsequence;

import java.util.ArrayList;
import java.util.List;

public class Solution300v1 implements Solution300
{
  public int lengthOfLIS(int[] nums) 
  {
    int maxlen = 0;

    for (int i=0; i<nums.length; i++)
    {
      List<Integer> list = new ArrayList<Integer>();
      
      int num = nums[i];
      list.add(num);
      
      int left = i, leftNum = num;
      while (--left >= 0)
      {
        if (nums[left] < leftNum)
        {
          leftNum = nums[left];
          list.add(0, leftNum);
        }
        
      }
      
      int right = i, rightNum = num;
      while (++right < nums.length)
      {
        if (nums[right] > rightNum)
        {
          rightNum = nums[right];
          list.add(rightNum);
        }
      }

      System.out.println(i+": "+list.toString());
      if (list.size() > maxlen) maxlen = list.size();
    }
    
    return maxlen;
  }
  
}
