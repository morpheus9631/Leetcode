package com.example.leetcode._051_to_100._088_MergeSortedArray;

/*
 * Your runtime beats 48.81% of java submissions.
 */

public class Solution088v1 implements Solution088
{
  public void merge(int[] nums1, int m, int[] nums2, int n) 
  {
    if (nums1 == null || nums2 == null) return;
    
    int[] nums = new int[m+n];

    int idx = 0, i=0, j = 0;
    while (i < m && j < n)
    {
      if (nums1[i] < nums2[j])
      {
        nums[idx] = nums1[i];
        i++;
      }
      else if (nums1[i] > nums2[j])
      {
        nums[idx] = nums2[j];
        j++;
      }
      else
      {
        nums[idx] = nums1[i];
        nums[++idx] = nums2[j];
        i++; j++;
      }
      idx++;
    }
    
    while (i < m) nums[idx++] = nums1[i++];
    while (j < n) nums[idx++] = nums2[j++];

    System.arraycopy(nums, 0, nums1, 0, m+n);
  }
}
