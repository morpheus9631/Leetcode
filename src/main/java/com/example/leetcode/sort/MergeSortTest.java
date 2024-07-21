package com.example.leetcode.sort;

import java.util.Arrays;

public class MergeSortTest
{
  public static void main(String[] args)
  {
    System.out.println("Merge sort:");
    
    int[] nums = { 9, 2, 4, 7, 3, 7, 10 };
    System.out.println("\r\nSource: "+Arrays.toString(nums));
 
    MergeSort.sort(nums);
    System.out.println("\r\nSorted: "+Arrays.toString(nums));
  }
}
