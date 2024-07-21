package com.example.leetcode._351_to_400._373_Find_K_PairsWithSmallestSums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution373v1 implements Solution373
{
  public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) 
  {
    List<int[]> res = new ArrayList<int[]>();
    List<Integer> sums = new ArrayList<Integer>();
    
    if (nums1 == null || nums2 == null) return res;

    if (nums1.length == 0 || nums2.length == 0) 
      return res;
    
    for (int i=0; i<nums1.length; i++)
    {
      for (int j=0; j<nums2.length; j++)
      {
        sums.add(nums1[i]+nums2[j]);
        res.add(new int[] { nums1[i], nums2[j] });
      }
    }
    System.out.println("sums: " +sums.toString());
    for (int i=0; i<res.size(); i++)
      System.out.println(Arrays.toString(res.get(i))+", ");
    
    quicksort(sums, res, 0, sums.size()-1);

    System.out.println("\r\nSorted: ");
    System.out.println("sums: " +sums.toString());
    for (int i=0; i<res.size(); i++)
      System.out.println(Arrays.toString(res.get(i))+", ");
    
    while (res.size() > k) {
      res.remove(res.size()-1);
    }
    
    return res;
     
  }
  
  private void quicksort(List<Integer> keys, List<int[]> vals, int low, int high) 
  {
    int i = low, j = high;
    int pivot = keys.get(low + (high-low)/2);
    while (i <= j) 
    {
      while (keys.get(i) < pivot) {
        i++;
      }
      
      while (keys.get(j) > pivot) {
        j--;
      }

      if (i <= j) 
      {
        exchange(keys, vals, i, j);
        i++;
        j--;
      }
    }

    if (low < j)  quicksort(keys, vals,  low, j);
    if (i < high) quicksort(keys, vals, i, high);
  }
  
  private void exchange(List<Integer> keys, List<int[]> vals, int i, int j) 
  {
    int num = keys.get(i);
    keys.set(i, keys.get(j));
    keys.set(j, num);
    
    int[] tmps = vals.get(i);
    vals.set(i,  vals.get(j));
    vals.set(j, tmps);
  }
}
