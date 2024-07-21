package com.example.leetcode._151_to_200._191_NumberOf_1_Bits;

public class Main191
{
  public static void main(String[] args)
  {
    System.out.println("191. Number of 1 Bits");
    
    String format = "\r\nn= %d (%s)"
                  + "\r\nThe number of '1' bits is %d";
    
    Solution191 sol = new Solution191v1();
    
    for (int n : _testCases)
    {
      int x = sol.hammingWeight(n);
      
      System.out.println(
          String.format(format, n, Integer.toUnsignedString(n, 2), x));
    }
  }

  private static int[] _testCases = 
  {
    11, (2147483647+1)
  };
}
