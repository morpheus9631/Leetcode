package com.example.leetcode._001_to_050._015_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * 2016.10.20: Time Limit Exceeded
 */

public class Solution015v1 implements Solution015
{
  public List<List<Integer>> threeSum(int[] nums) 
  {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    
    int len = nums.length;
    for (int i=0; i<len-2; i++) 
    {
      for (int j=i+1; j<len-1; j++)
      {
        for (int k=j+1; k<len; k++)
        {
          if ((nums[i] + nums[j] + nums[k]) == 0)
          {
            List<Integer> list = 
                new ArrayList<Integer>(Arrays.asList(nums[i], nums[j], nums[k]));
            Collections.sort(list);
            if (!res.contains(list))  res.add(list);
              
          }
        }
      }
    }
    return res;
  }
}
