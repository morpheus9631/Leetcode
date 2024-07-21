package com.example.leetcode._051_to_100._089_GrayCode;

import java.util.List;

public class Main089
{
  public static void main(String[] args)
  {
    System.out.println("89. Gray Code\r\n");
    
    Solution089 sol = new Solution089v3();

    int n = 3;
    List<Integer> res = sol.grayCode(n);

    String format = "%" + n + "s";
    for (int num : res)
    {
      String str = 
          String.format(format, Integer.toBinaryString(num)).replace(' ','0');
      System.out.println(String.format("%2d: %s", num, str));
    }
  }
}
