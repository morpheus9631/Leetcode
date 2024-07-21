package com.example.leetcode._401_to_450._448_FindAllNumbersDisappeared_in_an_Array;

import java.util.Arrays;
import java.util.List;

public class Main448
{

  public static void main(String[] args)
  {
    System.out.println("448.Find All Numbers Disappeared in an Array");
    
    Solution448 sol = new Solution448v1();
    
    for (int[] nums : TestCases)
    {
      System.out.println("\r\nInput: "+Arrays.toString(nums));

      List<Integer> list = sol.findDisappearedNumbers(nums);
      System.out.println("Output: "+list.toString());
    }
  }
  
  public static int[][] TestCases = 
  {
    {4,3,2,7,8,2,3,1}
  };

}
