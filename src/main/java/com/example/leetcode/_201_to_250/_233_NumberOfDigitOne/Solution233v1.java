package com.example.leetcode._201_to_250._233_NumberOfDigitOne;

public class Solution233v1 implements Solution233
{
  public int countDigitOne(int n) 
  {
    int ans = 0;
    
    if(n <= 0) return 0;
    int q = n, x = 1, tmp = 0;
    do{
        tmp = q % 10;
        q /= 10;
        
        if (tmp == 0) 
          ans += q*x;
        else if (tmp == 1) 
          ans += q*x + n%x + 1;
        else
          ans+=(q+1)*x;
    
        x *= 10;
    } while (q > 0);
    
    return ans;
  }
}
