package com.example.leetcode._001_to_050._027_RemoveElement;

public class Solution027v1 implements Solution027
{
  public int removeElement(int[] nums, int val) 
  {
    int cnt = 0;

    for (int i=0; i<nums.length; i++)
    {
      if (nums[i] == val)
      {
        int j = nums.length;

        while (--j > i && nums[j] == val);
        cnt = nums.length - j;

        if (j > i) {
          int tmp = nums[i]; nums[i] = nums[j]; nums[j] = tmp; 
        } else {
          break;
        }
      }
    }
    
    return nums.length - cnt;
  }
}
