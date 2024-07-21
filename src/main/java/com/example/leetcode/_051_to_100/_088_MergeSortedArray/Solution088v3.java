package com.example.leetcode._051_to_100._088_MergeSortedArray;

/*
 * Your runtime beats 48.81% of java submissions.
 */

public class Solution088v3 implements Solution088
{
  public void merge(int[] nums1, int m, int[] nums2, int n) 
  {
    if (nums1.length < m+n) return;

    int i = m-1, j = n-1, k = m+n-1;
    while (i >= 0 || j >= 0)
    {
      if (j < 0) return;
      
      if (i < 0) {
        nums1[k--] = nums2[j--];
        continue;
      }
      
      if (nums1[i] >= nums2[j]) {
        nums1[k--] = nums1[i--];
      } else {
        nums1[k--] = nums2[j--];
      }
    }
  }
}
