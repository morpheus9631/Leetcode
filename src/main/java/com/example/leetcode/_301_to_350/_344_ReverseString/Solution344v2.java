package com.example.leetcode._301_to_350._344_ReverseString;

public class Solution344v2 implements Solution344
{
  public String reverseString(String s) 
  {
    return new StringBuffer(s).reverse().toString();
  }
}
