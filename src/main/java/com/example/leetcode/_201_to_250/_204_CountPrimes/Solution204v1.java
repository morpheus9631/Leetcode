package com.example.leetcode._201_to_250._204_CountPrimes;

/*
 *  Your runtime beats 42.99% of java submissions.
 */

public class Solution204v1 implements Solution204
{
  public int countPrimes(int n) 
  {
    boolean[] isPrime = new boolean[n];
    for (int i = 2; i < n; i++) {
       isPrime[i] = true;
    }
   
    for (int i = 2; i * i < n; i++) 
    {
       if (!isPrime[i]) continue;
       for (int j = i * i; j < n; j += i) {
          isPrime[j] = false;
       }
    }
    
    int count = 0;
    for (int i = 2; i < n; i++) {
       if (isPrime[i]) count++;
    }
    return count;  
  }
}
