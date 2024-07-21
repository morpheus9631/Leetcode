package com.example.leetcode._401_to_450._401_BinaryWatch;

import java.util.List;

public class Main401
{
  public static void main(String[] args)
  {
    System.out.println("401. Binary Watch");
    
    String format = "\r\nInput: %d"
                  + "\r\nReturn: %s";

    Solution401 sol = new Solution401v5();
    for (int num : _testCases)
    {
      List<String> res = sol.readBinaryWatch(num);
      System.out.println(String.format(format, num, res.toString()));
    }
  }

  private static int[] _testCases = 
  {
    0, 1, 4, 6
  };
}
