package com.example.leetcode._001_to_050._038_CountAndSay;

public class Main038
{
  public static void main(String[] args)
  {
    System.out.println("38. Count and Say");

    String format = "\r\nn = %d"
                  + "\r\nReturn: %s"
                  ;
    
    Solution038 sol = new Solution038v1();
    
    for (int n : _testCases)
    {
      String str = sol.countAndSay(n);
      
      System.out.println(String.format(format, n, str)); 
    }
  }
  
  private static int[] _testCases = 
  {
      1     // Expected: "1" 
    , 2     // Expected: "11"
    , 3     // Expected: "21"
    , 4     // Expected: "1211"
    , 5     // Expected: "111221"
    , 6     // Expected: "312211"
  };
}
