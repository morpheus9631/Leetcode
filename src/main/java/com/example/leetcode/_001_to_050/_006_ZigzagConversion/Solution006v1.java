package com.example.leetcode._001_to_050._006_ZigzagConversion;

import java.util.ArrayList;
import java.util.List;

public class Solution006v1 implements Solution006
{
  public String convert(String text, int nRows) 
  {
    String outstr = "";
    
    if ((text == null) || (text.length() == 0)) return "";
    
    if (nRows == 1) return text;
    
    List<StringBuffer> list = new ArrayList<StringBuffer>();
    for (int i=0; i<nRows; i++) list.add(new StringBuffer());
      
    char[] charArray = text.toCharArray();
    
    int i = 0, pos = 0;
    int dir = 1;
    while (i < charArray.length)
    {
      char ch =  charArray[i++];      
      list.get(pos).append(ch);
      
      pos += dir;
      if ((dir == 1) && (pos == nRows - 1)) 
      {
        dir = -1;
      } 
      else if ((dir == -1) && (pos == 0)) 
      {
        dir = 1;
      }
    }

    for (int j=0; j<nRows; j++) {
      outstr += list.get(j).toString();
    }
    
    return outstr;
  }
}
