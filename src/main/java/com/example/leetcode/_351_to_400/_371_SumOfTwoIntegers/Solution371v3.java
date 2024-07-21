package com.example.leetcode._351_to_400._371_SumOfTwoIntegers;

/*
 * Your runtime beats 8.43% of java submissions.
 */

/*
 * >>> is logical shift right.
 * For example, -2 represented in 8 bits would be 11111110
 * Shifting our -2 right one bit using logical shift would give 01111111.
 */

public class Solution371v3 implements Solution371
{
  public int getSum(int a, int b)
  {
    int ans = 0, carry = 0;
    
    for (int i=0; i<32; i++) 
    {
      int lsb_a = a & 1;
      int lsb_b = b & 1;
      
      ans |= (lsb_a ^ lsb_b ^ carry) << i;
      carry = (carry & lsb_a) | (carry & lsb_b) | (lsb_a & lsb_b);
      
      a >>>= 1; b >>>= 1;
    }
    return ans;  
  }
}
