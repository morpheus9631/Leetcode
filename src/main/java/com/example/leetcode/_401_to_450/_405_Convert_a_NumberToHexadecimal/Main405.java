package com.example.leetcode._401_to_450._405_Convert_a_NumberToHexadecimal;

public class Main405
{
  public static void main(String[] args)
  {
    System.out.println("405. Convert a Number to Hexadecimal");
    
    String format = "\r\nInput = %d"
                  + "\r\nOutput is \"%s\""
                  ;
    
    Solution405 sol = new Solution405v1();
    for (int num : _testCases)
    {
      String res = sol.toHex(num);
      System.out.println(String.format(format, num, res));
    }

  }
  
  private static int[] _testCases = 
  {
    26, -1    
  };

}
