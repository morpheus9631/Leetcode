package com.example.leetcode.sort;

import java.util.Arrays;

public class BubbleSortTest
{
  public static void main(String[] args) 
  {
    System.out.println("Bubble sort:");
    
    int[] nums = { 9, 2, 4, 7, 3, 7, 10 };
    System.out.println("\r\nSource: "+Arrays.toString(nums));
 
    BubbleSort.Sort(nums);
    System.out.println("\r\nSorted: "+Arrays.toString(nums));
  }
}
