package com.example.leetcode._001_to_050._009_PalindromeNumber;

public class Solution009v1 implements Solution009
{
  public boolean isPalindrome(int x) 
  { 
    if (x < 0) return false;
    
    int mask = 1;
    while ((x / mask) >= 10) mask *= 10;
    
    while (x > 0)
    {
      int left = x / mask;
      int right = x % 10;
      if (left != right) return false;
      
      x = x % mask;
      x = x / 10;
      mask /= 100;
    }

    return true;
  }
}
