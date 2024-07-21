package com.example.leetcode._301_to_350._306_AdditiveNumber;

public class Solution306v2 implements Solution306
{
  public boolean isAdditiveNumber(String num) 
  {  
    for (int i=1; i<=num.length()>>1; i++) {  
      for (int j=1; Math.max(i,j)<=num.length()-j-i; j++) {   
        if (isValid(num, num.substring(0, i), num.substring(i, i+j), i+j)) return true;
      }
    }
    return false;  
  }  
  
  private boolean isValid(String num, String first, String second, int index) 
  {  
    if (first.length() > 1 && first.startsWith("0") ||
        second.length() > 1 && second.startsWith("0")) return false;
    
    if (index == num.length()) return true;  
    
    long sum = Long.parseLong(first) + Long.parseLong(second);  
    
    if (num.startsWith(sum+"", index))  
        if(isValid(num, second, sum+"", index+(sum+"").length())) return true;  
    return false;  
  }
}