package com.example.leetcode._101_to_150._125_ValidPalindrome;

/*
 * Your runtime beats 53.76% of java submissions.
 */

public class Solution125v1 implements Solution125
{
  public boolean isPalindrome(String s) 
  {
    int len = s.length();
    int left = 0, right = len-1;
    
    char ch1 = '\0', ch2 = '\0';
    while (left < right)
    {
      do {
        ch1 = s.charAt(left++);
      } while (left < len && !isLetterOrDigital(ch1));

      do {
        ch2 = s.charAt(right--);
      } while (right >= 0 && !isLetterOrDigital(ch2));
      
      System.out.println(left+", "+right+", "+ch1+", "+ch2);
      
      if (!isLetterOrDigital(ch1) && !isLetterOrDigital(ch2))
        return true;
      else if (Character.toLowerCase(ch1) != Character.toLowerCase(ch2)) 
        return false;
    }
    return true;
  }
  
  private boolean isLetterOrDigital(char ch)
  {
    return ((ch >= 'a' && ch <= 'z') ||
            (ch >= 'A' && ch <= 'Z') ||
            (ch >= '0' && ch <= '9'));
  }
}
