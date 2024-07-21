package com.example.leetcode._251_to_300._299_BullsAndCows;

public class Solution299v1 implements Solution299
{
  public String getHint(String secret, String guess) 
  {
    if (secret.length() != guess.length()) return null;
    int len = secret.length();
    
    int[] cntS = new int[10];
    int[] cntG  = new int[10];
    
    int cntA = 0;
    for (int i=0; i<len; i++)
    {
      char ch1 = secret.charAt(i);
      char ch2 = guess.charAt(i);
      
      if (ch1 == ch2) 
        cntA++;
      else 
      {
        cntS[ch1-'0']++;
        cntG[ch2-'0']++;    
      }
    }
    
    int cntB = 0;
    for (int i=0; i<10; i++) {
      cntB += (cntS[i] < cntG[i]) ? cntS[i] : cntG[i];
    }
    
    return Integer.toString(cntA)+"A"+Integer.toString(cntB)+"B";
  }
}
