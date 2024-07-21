package com.example.leetcode._251_to_300._278_FirstBadVersion;

public class Main278
{
  public static void main(String[] args)
  {
    System.out.println("278. First Bad Version");
    
    String format = "\r\nFirst bad version is %d"
                  + "\r\nVersion is %d"
                  + "\r\nReturn first bad version: %d"
                  ;
    
    int first_bad_version = 5;
    Solution278 sol = new Solution278v1(first_bad_version);
    
    for (int n : _testCases)
    {
      int bad_ver = sol.firstBadVersion(n); 
      System.out.println(String.format(format, first_bad_version, n, bad_ver));
    }
  }
  
  private static int[] _testCases = 
  {
    10
  };
}
