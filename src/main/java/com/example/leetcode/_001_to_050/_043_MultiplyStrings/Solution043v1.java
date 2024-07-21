package com.example.leetcode._001_to_050._043_MultiplyStrings;

import java.math.BigInteger;

public class Solution043v1 implements Solution043
{
  public String multiply(String num1, String num2) 
  {
    BigInteger bi1=java.math.BigInteger.valueOf(0);
    
    for(int i=0;i<num1.length();i++)
    {
      bi1=bi1.multiply(java.math.BigInteger.valueOf(10));
      bi1=bi1.add(java.math.BigInteger.valueOf(num1.charAt(i)-'0'));
    }
    
    BigInteger bi2 = java.math.BigInteger.valueOf(0);
    
    for(int i=0;i<num2.length();i++)
    {
      bi2=bi2.multiply(java.math.BigInteger.valueOf(10));
      bi2=bi2.add(java.math.BigInteger.valueOf(num2.charAt(i)-'0'));
    }
    return bi1.multiply(bi2).toString();  
  }
}
