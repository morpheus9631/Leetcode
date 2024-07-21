package com.example.leetcode._151_to_200._169_MajorityElement;

/*
 * 因為 majority element 的總數必須過半，也就是比其他 element 加起來的總數還多.
 * 
 * 所以將 majority element 的總數減去剩餘數還會剩下，才能用此法。
 */

public class Solution169v3  implements Solution169
{
  public int majorityElement(int[] nums) 
  {
    if (nums.length == 1) return nums[0];

    if (nums.length == 2) 
    { 
      if (nums[0] == nums[1]) 
        return nums[0];
      else 
        return Integer.MIN_VALUE; 
    }  
    
    int majority = nums[0];  
    int count = 1;  
    
    for (int i=1; i<nums.length; ++i) 
    {  
      if (count == 0) 
      {  
        majority = nums[i];  
        ++count;  
      } else if (nums[i] == majority) {  
        ++count;  
      } else {  
        --count;  
      }  
    }  
    return majority;  
  }
}
