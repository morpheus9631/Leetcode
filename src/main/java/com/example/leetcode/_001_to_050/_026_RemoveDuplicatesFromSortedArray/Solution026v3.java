package com.example.leetcode._001_to_050._026_RemoveDuplicatesFromSortedArray;

/*
 * 2017.03.22: Your runtime beats 2.02% of java submissions.
 */

public class Solution026v3 implements Solution026
{
  public int removeDuplicates(int[] nums) 
  {
    if (nums == null) return 0;
    
    int len = nums.length; 
    if (len < 2) return nums.length;

    int i = 1, duplicate = 0;
    while (i < len-duplicate)
    {
      if (nums[i] == nums[i-1])
      {
        duplicate++;
        int tmp = nums[i];
        int end = len-duplicate;
        for (int j=i; j<end; j++) {  
          nums[j] = nums[j+1];
        }  
        nums[end] = tmp;
      }
      else
        i++;
    }
    
    return i;
  }  
}
