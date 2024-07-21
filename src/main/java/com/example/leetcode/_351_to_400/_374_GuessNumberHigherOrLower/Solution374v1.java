package com.example.leetcode._351_to_400._374_GuessNumberHigherOrLower;

/*
 * Your runtime beats 22.31% of java submissions.
 */

public class Solution374v1 extends Solution374
{
  public int guessNumber(int n) 
  {
    int min = 1, max = n;
    
    while (min < max)
    {
      int mid = min + (max - min) / 2;
      int res = guess(mid);
      
      if (res == 0) 
      {
        min = mid; break;
      }
      else if (res == 1)  
        min = mid + 1;
      else if (res == -1)
        max = mid - 1;
    }
    return min;  
  }
}
