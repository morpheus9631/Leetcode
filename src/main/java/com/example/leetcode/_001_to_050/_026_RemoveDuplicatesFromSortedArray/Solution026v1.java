package com.example.leetcode._001_to_050._026_RemoveDuplicatesFromSortedArray;

/*
 * 2017.03.22: Your runtime beats 87.46% of java submissions.
 */

public class Solution026v1 implements Solution026
{
  public int removeDuplicates(int[] nums) 
  {
    if (nums == null) return -1;
    if (nums.length < 2) return nums.length;
    
    int i = 0;
    int j = 1;
    while (j < nums.length)
    {
      if (nums[i] == nums[j]) {
        j++;
      }
      else {
        i++; nums[i] = nums[j]; j++;
      }
    }
    return i+1;
  }
}
