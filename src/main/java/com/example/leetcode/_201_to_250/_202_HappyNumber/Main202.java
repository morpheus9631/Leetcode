package com.example.leetcode._201_to_250._202_HappyNumber;

public class Main202
{
  public static void main(String[] args)
  {
    System.out.println("152. Maximum Product Subarray");
    
    String format = "\r\nn = %s"
                  + "\r\nisHappy? %b";
    
    Solution202 sol = new Solution202v1();

    for (int n : _testCases)
    {
      boolean isHappy = sol.isHappy(n);
      
      System.out.println(String.format(format, n, isHappy));
    }
  }
  
  private static int[] _testCases = 
  {
    1, 19, 2
  }; 
}
