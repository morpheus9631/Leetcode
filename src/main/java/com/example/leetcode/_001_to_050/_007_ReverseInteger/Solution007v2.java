package com.example.leetcode._001_to_050._007_ReverseInteger;

/*
 * Your runtime beats 75.06% of java submissions.
 */

public class Solution007v2 implements Solution007
{
  public int reverse(int x)
  {
    if (x < 10 && x > -10) return x;
    
    long newX = 0;
    
    boolean isNega = (x < 0) ? true : false;
    x = Math.abs(x);
    
    while (x > 0)
    {
      int left = x % 10;
      newX = newX * 10 + left;
      x /= 10;
    }
    
    if (newX > Integer.MAX_VALUE || newX < Integer.MIN_VALUE)
      x = 0;
    else
      x = (int) newX; 
    
    if (isNega) x *= -1;
        
    return x;
  }
}
