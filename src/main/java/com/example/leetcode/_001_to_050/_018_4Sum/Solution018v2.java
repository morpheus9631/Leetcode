package com.example.leetcode._001_to_050._018_4Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution018v2 implements Solution018
{
  public List<List<Integer>> fourSum(int[] nums, int target) 
  {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    
    if(nums == null|| nums.length < 4) return result;
 
    Arrays.sort(nums);
 
    for (int i=0; i<nums.length-3; i++)
    {
      if (i != 0 && nums[i] == nums[i-1]) continue;
      
      for(int j=i+1; j<nums.length-2; j++)
      {
        if (j != i+1 && nums[j] == nums[j-1]) continue;

        int left = j + 1, right = nums.length - 1;
        
        while(left < right)
        {
          int sum = nums[i] + nums[j] + nums[left] + nums[right];
         
          if(sum == target)
          {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(nums[i]);
            list.add(nums[j]);
            list.add(nums[left]);
            list.add(nums[right]);
            result.add(list);
            
            left ++; right --;
            
            while (left < right && nums[left] == nums[left-1])
              left ++;
            
            while(left < right && nums[right] == nums[right+1]) 
              right --;
          } 
          else if(sum < target) {
            left ++;
          } else {
            right--;
          }
        }                    
      }
    }
    return result;  
  }
}
