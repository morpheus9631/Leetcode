package com.example.leetcode._201_to_250._204_CountPrimes;

/*
 *  Your runtime beats 33.01% of java submissions
 */

public class Solution204v2 implements Solution204
{
  public int countPrimes(int n) 
  {
    if (n <= 2) return 0;

    boolean[] isPrime = new boolean[n];
    for (int i=0; i < n; i++) {
      if ((i == 2) || (i>2 && i%2 != 0)) isPrime[i] = true; 
    }
    
    for (int i=3; i*i < n; i+=2)
    {
      if (!isPrime[i]) continue;
      for (int j=i*i; j<n; j+=i) {
        isPrime[j] = false;
      }
    }  
      
    int count = 0;
    for (int i=2; i < n; i++)if (isPrime[i]) count++;
    return count;
  }
}
