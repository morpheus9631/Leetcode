package com.example.leetcode._301_to_350._313_SuperUglyNumber;

import java.util.ArrayList;
import java.util.List;

public class Solution313v1 implements Solution313
{
  public int nthSuperUglyNumber(int n, int[] primes) 
  {
    if (n <= 0) return 0;
    if (n > 0 && n <= 2) return n;
    
    int[] nums = new int[n];
    nums[0] = 1;
    
    List<Integer> factors = getFactors(primes);
    int[] idx = new int[factors.size()];

    int i = 1;
    while (i < n)
    {
      int minNum = Integer.MAX_VALUE;
      for (int j=0; j<factors.size(); j++)
      {
        if (nums[idx[j]] * factors.get(j) < minNum)
          minNum = nums[idx[j]] * factors.get(j);
      }
      nums[i] = minNum;
      
      for (int j=0; j<factors.size(); j++)
      {
        if (minNum == nums[idx[j]] * factors.get(j))
          idx[j]++;
      }
      i++;
    }
    
    return nums[n-1];
  }
  
  private List<Integer> getFactors(int[] primes)
  {
    List<Integer> list = new ArrayList<Integer>();

    int i = -1;
    while (++i < primes.length)
    {
      int num = primes[i];
      if (num < 1 || num >= 1000) continue;
      if (num == 1) continue;
      
      if (num%2 == 0)
      {
        if (num == 2) list.add(num);
        continue;
      }
      
      boolean isPrime = true;
      for (int j=3; j<=Math.sqrt(num); j+=2)
      {
        if (num % j == 0) 
        {
          isPrime = false;  
          break;
        }
      }
      if (isPrime) list.add(num);
    }
    return list;
        
  }
}
