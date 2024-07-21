package com.example.leetcode._151_to_200._190_ReverseBits;

import com.example.leetcode.utils.myStringUtils;

public class Main190
{
  public static void main(String[] args)
  {
    System.out.println("190. Reverse Bits\r\n");

    String format = "%11d: %s"
                  + "\r\nReturn:      %s"
                  + "\r\n             (%d)"
                  + "\r\n\r\n" + myStringUtils.dashLine()
                  ;
    
    Solution190 sol = new Solution190v5();
    
    for (int n : _testCases)
    {
      String str1 = toFullBinaryUnsignedString(n);
      
      int rn = sol.reverseBits(n);
      String str2 = toFullBinaryUnsignedString(rn);
      
      System.out.println(String.format(format, n, str1, str2, rn));
    }
  }
  
  private static int[] _testCases = 
  {
      43261596 
    , 1 
    , 0x80000000         // 2147483648
    , 0xAAAA5555
  };
  
  private static String toFullBinaryUnsignedString(int n)
  {
    StringBuilder sb = new StringBuilder();
    sb.append(Integer.toUnsignedString(n, 2));
    while (sb.length() < 32) sb.insert(0,  "0");
    return sb.toString();
  }
}
