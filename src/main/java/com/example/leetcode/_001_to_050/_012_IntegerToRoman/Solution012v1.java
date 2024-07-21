package com.example.leetcode._001_to_050._012_IntegerToRoman;

public class Solution012v1 implements Solution012
{
  public String intToRoman(int num) 
  {
    if (num <= 0) return "0";
    
    String res = "";
    
    String[] symbols = { "M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I" };
    int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };           
    
    int i = 0;
    while (num > 0)
    {
      if (num >= values[i])
      {
        res += symbols[i];
        num -= values[i];
      }  
      else 
        i++;
    }
    return res;
  }
}
