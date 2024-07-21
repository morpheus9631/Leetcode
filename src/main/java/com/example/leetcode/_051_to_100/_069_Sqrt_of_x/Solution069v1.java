package com.example.leetcode._051_to_100._069_Sqrt_of_x;

public class Solution069v1 implements Solution069
{
  public int mySqrt(int x) 
  {
    int num = 0;
    
    if (x < 0) throw new IllegalArgumentException("x < 0");
    if (x == 0) return 0;
    if (x > 0  && x < 4) return 1;
    
    int low = 1, high = x / 2;
    while (low < high)
    {
      int mid = (low + high) / 2;
      if (x/mid >= mid)
        low = mid + 1;
      else
        high = mid - 1;
    }
    num = (low > x/low) ? low-1 : low;
    
    return num;
  }
}
