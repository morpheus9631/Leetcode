package com.example.leetcode.sort;

import java.util.Arrays;

public class QuickSortTest
{
  public static void main(String[] args) 
  {
    System.out.println("Quick sort:");
    
    int[] nums = { 9, 2, 4, 7, 3, 7, 10 };
    System.out.println("\r\nArray: "+Arrays.toString(nums));
 
    QuickSort.sort(nums, 0, nums.length-1);
    
    System.out.println("\r\nAns: "+Arrays.toString(nums));
  }
}
