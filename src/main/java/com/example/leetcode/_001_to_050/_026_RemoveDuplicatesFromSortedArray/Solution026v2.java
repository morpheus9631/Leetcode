package com.example.leetcode._001_to_050._026_RemoveDuplicatesFromSortedArray;

/*
 * 2017.03.22: Your runtime beats 1.10% of java submissions.
 */

public class Solution026v2 implements Solution026
{
  public int removeDuplicates(int[] nums) 
  {
    if (nums == null) return 0;
    if (nums.length < 2) return nums.length;

    int i = 1, duplicate = 0;
    while (i < nums.length - duplicate)
    {
      if (nums[i] == nums[i-1])
      {
        int tmp = nums[i]; 
        for (int j=i; j<nums.length-1; j++) {  
          nums[j] = nums[j+1];
        }  
        nums[nums.length-1] = tmp;
        duplicate++;
      }
      else
        i++;
    }
    
    return i;
  }  
}
