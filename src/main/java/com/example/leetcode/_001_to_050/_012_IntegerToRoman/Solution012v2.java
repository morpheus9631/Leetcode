package com.example.leetcode._001_to_050._012_IntegerToRoman;

public class Solution012v2 implements Solution012
{
  public String intToRoman(int num) 
  {
    if (num <= 0) return "0";
    
    StringBuffer sb = new StringBuffer();
    
    String[] symbols = { "M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I" };
    int[] radixs = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };           
    
    for (int i=0; i<radixs.length; i++) 
    {  
        int count = num / radixs[i];  
        num %= radixs[i];  
        while((count--) != 0) sb.append(symbols[i]);    
    }  
    
    return sb.toString();
  }
}
