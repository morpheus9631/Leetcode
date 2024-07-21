package com.example.leetcode._401_to_450._447_Number_of_Boomerangs;

import java.util.Arrays;

public class Main447
{
  public static void main(String[] args)
  {
    System.out.println("447.Number of Boomerangs");
    
    Solution447 sol = new Solution447v1();
    
    for (int[][] points : TestCases)
    {
      int res = sol.numberOfBoomerangs(points);
      
      System.out.println(); printInput(points);
      System.out.println("Output: "+res);
    }
  }

  private static int[][][] TestCases = 
  {
    {{0,0},{1,0},{2,0}}  
  };

  private static void printInput(int[][] elems)
  {
    System.out.print("Input: [");
    
    int len = elems.length;
    for (int i=0; i<len; i++) 
    {
      int[] arr = elems[i];
      if (i != 0 && i+1 <= len) System.out.print(",");
      System.out.print(Arrays.toString(arr));
    }
    System.out.println("]");
  }
}
