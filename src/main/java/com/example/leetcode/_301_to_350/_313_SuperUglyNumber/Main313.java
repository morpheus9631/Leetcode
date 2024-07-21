package com.example.leetcode._301_to_350._313_SuperUglyNumber;

import java.util.Arrays;

public class Main313
{
  public static void main(String[] args)
  {
    System.out.println("313. Super Ugly Number");

    String format = "\r\nn = %d"
                  + "\r\nprimes = %s"
                  + "\r\nsize is %d"
                  ;
    
    Solution313 sol = new Solution313v1();

    for (int[][] testcase : _testCases)
    {
      int n = testcase[0][0];
      int[] primes = testcase[1];
      int size = sol.nthSuperUglyNumber(n, primes);
      
      System.out.println(
          String.format(format, n, Arrays.toString(primes), size));
    }
  }
  
  private static int[][][] _testCases = 
  {
      { {1}, {1,2,4,7,8,13,14,16,19,26,28,32} }
    , { {2}, {2} }
    , { {1}, {2} }
    , { {150}, 
        {  3,  5,  7, 11, 19, 23, 29, 31, 37, 43, 79, 83, 89, 97,107,
         109,131,137,157,163,173,179,181,199,211,227,233,239,251,263 } } 
  };
}
