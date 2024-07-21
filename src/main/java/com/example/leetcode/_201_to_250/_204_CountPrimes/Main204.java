package com.example.leetcode._201_to_250._204_CountPrimes;

public class Main204
{
  public static void main(String[] args)
  {
    System.out.println("204. Count Primes");
    
    String format = "\r\nn = %d"
                  + "\r\nPrime count %d";
    
    Solution204 sol = new Solution204v2();

    for (int n : _testCases)
    {
      int count = sol.countPrimes(n);
      System.out.println(String.format(format, n, count));
    }
  }
  
  private static int[] _testCases = 
  {
    1, 2, 3, 30, 120, 499979
  };
}
