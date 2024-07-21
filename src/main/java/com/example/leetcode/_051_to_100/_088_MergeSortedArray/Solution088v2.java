package com.example.leetcode._051_to_100._088_MergeSortedArray;

/*
 * Your runtime beats 48.81% of java submissions.
 */

public class Solution088v2 implements Solution088
{
  public void merge(int[] nums1, int m, int[] nums2, int n) 
  {
    if (nums1 == null || nums2 == null) return;
    if (n == 0) return;
    
    int i = m-1; 
    int j = n-1;
    int k = m+n-1;
    
    while (i >= 0 && j >= 0)
    {
      if (nums1[i] >= nums2[j])
      {
        nums1[k--] = nums1[i--];
      }
      else if (nums1[i] < nums2[j])
      {
        nums1[k--] = nums2[j--];
      }
    }
    while (j >= 0) nums1[k--] = nums2[j--];
  }
}
