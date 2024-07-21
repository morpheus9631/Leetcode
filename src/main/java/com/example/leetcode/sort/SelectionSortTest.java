package com.example.leetcode.sort;

import java.util.Arrays;

public class SelectionSortTest
{
  public static void main(String[] args) 
  {
    System.out.println("Insertion sort:");
    
    int[] nums = { 9, 2, 4, 7, 3, 7, 10 };
    System.out.println("\r\nSource: "+Arrays.toString(nums));
 
    SelectionSort.sort(nums);
    System.out.println("\r\nSorted: "+Arrays.toString(nums));
  }  
}
