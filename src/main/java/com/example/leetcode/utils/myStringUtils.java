package com.example.leetcode.utils;

public class myStringUtils
{
  public static String dashLine() { return repeat(40, "-"); }

  public static String dashLine(int n)
  {
    return repeat(n, "-");
  }

  // ---------------------------------------------------------------------------
  public static String repeat(int num, String str)
  {
    return new String(new char[num]).replace("\0", str);
  }

  
  // ---------------------------------------------------------------------------
  public static char[][] toArray(String[] strArray)
  {
    if (strArray == null || strArray.length == 0) return null;
    
    int rows = strArray.length;
    char[][] charArray = new char[rows][];
    for (int i=0; i<rows; i++) {
      charArray[i] = strArray[i].toCharArray();
    }
    
    return charArray;
  }
}
