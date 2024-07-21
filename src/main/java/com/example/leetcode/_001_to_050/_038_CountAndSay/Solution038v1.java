package com.example.leetcode._001_to_050._038_CountAndSay;

/*
 * 170322: Your runtime beats 33.78% of java submissions.
 */

public class Solution038v1 implements Solution038
{
  public String countAndSay(int n) 
  {
    StringBuilder sb = new StringBuilder();
    sb.append("1");
    
    while (n > 1)
    {
      StringBuilder newSb = new StringBuilder();

      while (sb.length() > 0)
      {
        int idx = 0;
        char ch = sb.charAt(idx);
        
        while (idx < sb.length()-1) 
        {
          if (sb.charAt(idx+1) == ch)
            idx++;
          else  
            break; 
        }
        newSb.append(idx+1).append(ch);
        sb.delete(0, idx+1);
        
        System.out.println(n+", "+idx+", "+ch+", \""+sb.toString()+"\", \""
            +newSb.toString()+"\"");
      }
      sb = newSb;
      n--;
    }

    return sb.toString();
  }
}
