package com.example.leetcode._151_to_200._172_FactorialTrailingZeroes;

public class Solution172v1 implements Solution172
{
  public int trailingZeroes(int n) 
  {
    int cnt = 0;
    if (n < 0) return -1;

    for (long i=5; (n/i)>=1; i*=5) {
        cnt += n / i;
    }        
    return cnt;
  }   
}
