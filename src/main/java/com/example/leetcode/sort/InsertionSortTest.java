package com.example.leetcode.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InsertionSortTest
{
  public static void main(String[] args) 
  {
    System.out.println("Insertion sort:");
    
    int[] nums = { 9, 2, 4, 7, 3, 7, 10 };
    System.out.println("\r\nSource: "+Arrays.toString(nums));
 
    InsertionSort.sort(nums);
    System.out.println("\r\nSorted: "+Arrays.toString(nums));
    
    List<Integer> list = IntStream.of(nums).boxed().collect(Collectors.toList());    
    InsertionSort.sort(list);
    System.out.println("\r\nSorted: "+list.toString());
  }
}
