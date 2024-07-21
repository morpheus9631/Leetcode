package com.example.leetcode._401_to_450._443_StringCompression;

/*
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for String Compression.
 * Memory Usage: 37.4 MB, less than 98.87% of Java online submissions for String Compression.
 */

public class Solution443v1 implements Solution443
{
  public int compress(char[] chars)
  {
    int len = chars.length;

    int read = -1, anchor = 0, write = 0;
    while (++read < len)
    {
      if ((read+1 == len) || chars[read+1] != chars[read])
      {
        chars[write++] = chars[anchor];

        if (read > anchor) 
        {
          int count = (read - anchor + 1);
//          System.out.println("\r\ncount: "+count);
          
          while (count > 9)
          {
            int digits = (int) (Math.log10(count));
            int divisor = (int) Math.pow(10, digits);
            int num = count / divisor;
            chars[write++] = (char)(48+num);
            
            count %= divisor;
          }
          chars[write++] = (char)(48+count);
        }
        anchor = read + 1;
      }
    }
    
    return write;
  }
  
}
