package com.example.leetcode._301_to_350._301_RemoveInvalidParentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution301v2 implements Solution301
{
  public List<String> removeInvalidParentheses(String s) 
  {
    List<String> resList = new ArrayList<String>();
    
    if (s.length() == 0) {
    	resList.add(s); return resList;
    }

    List<String> checkList = new ArrayList<String>();
    checkList.add(s);

    System.out.print("\r\nSrc: ");
    for (int i=0; i<checkList.size(); i++)
    	System.out.print("\"" + checkList.get(i) + "\", ");
    System.out.println();
    
    // 由左向右找出造成錯誤的 ')'
    System.out.println("\r\nLeft: ");
    
    while (!checkList.isEmpty())
    {
    	String tmpstr = checkList.remove(0);
    	int len = tmpstr.length();
    	
    	if (len == 0)
    	{
      	if (!resList.contains(tmpstr)) resList.add(tmpstr);
    	  System.out.println("TmpStr: \"" + tmpstr + "\"");
      	continue;
    	}
    	
    	int invalidIdx = isValidLeft(tmpstr);
      System.out.print("  invalid idx: " + invalidIdx + ",\t");
      
      if (invalidIdx == len)
      {
      	if (!resList.contains(tmpstr)) resList.add(tmpstr);
    	  System.out.println("TmpStr: \"" + tmpstr + "\"");
      	continue;
      }

      int i = invalidIdx;
      while (i >= 0)  
      {
        System.out.println("i: " + i + ", " + invalidIdx);
      	
      	if (tmpstr.charAt(i) == ')')
      	{
      	  String newstr = tmpstr.substring(0, i) 
      	  		          + tmpstr.substring(i+1, tmpstr.length());
      	  checkList.add(newstr);
      	  System.out.println("NewStr: \"" + newstr + "\"");
      	}
      	i--;
      };
      System.out.println();
    }
    
    System.out.print("\r\nAfter left chkeck: ");
    for (int i=0; i<resList.size(); i++)
    	System.out.print("\"" + resList.get(i) + "\", ");
    System.out.println();
    
    checkList = new ArrayList<String>(resList);
    resList.clear();

    System.out.println("\r\nRight: ");

    // 由右向左找出造成錯誤的 '('
    while (!checkList.isEmpty())
    {
    	String tmpstr = checkList.remove(0);
      int len = tmpstr.length();
      
      if (len == 0)
      {
      	if (!resList.contains(tmpstr)) resList.add(tmpstr);
    	  System.out.println("TmpStr: \"" + tmpstr + "\"");
      	continue;
      }
      
      int invalidIdx = isValidRight(tmpstr); // 
      System.out.print("  invalid idx: " + invalidIdx + ",\t");

      if (invalidIdx == len)
      {
      	if (!resList.contains(tmpstr)) resList.add(tmpstr);
    	  System.out.println("TmpStr: \"" + tmpstr + "\"");
    	  continue;
      }
      
    	int i = invalidIdx;
    	while (i < len)
    	{
      	if (tmpstr.charAt(i) == '(')
      	{
      	  String newstr = tmpstr.substring(0, i) 
      	  		          + tmpstr.substring(i+1, tmpstr.length());
      	  checkList.add(newstr);
      	  System.out.println("NewStr: \"" + newstr + "\"");
      	}
      	i++;
    	}
    }  
    
    System.out.print("\r\nAfter right check: ");
    for (int i=0; i<resList.size(); i++)
    	System.out.print(resList.get(i) + ", ");
    System.out.println();
    
    
    return resList;
  }
  
  /*
   * -1: 字串 s 的長度為 0
   * 0 ~ s.length()-1: 有多餘的 '(' 存在
   * s.length(): 沒有多餘的 '(' 存在
   */
  public int isValidLeft(String s)
  {
  	int i = 0;
  	int cnt = 0;
  	
  	for (; i<s.length(); i++)
  	{
  		char ch = s.charAt(i);

  		if (ch == '(') cnt++;
  		else if (ch == ')') cnt--;
  		
  		if (cnt < 0) return i; 
  	}

  	return s.length();
  }
  
  /*
   * -1: 字串 s 的長度為 0
   * 0 ~ s.length()-1: 有多餘的 ')' 存在
   * s.length(): 沒有多餘的 ')' 存在
   */
  public int isValidRight(String s)
  {
  	int cnt = 0;
  	int i = s.length() - 1;

  	for (; i>=0; i--)
  	{
  		char ch = s.charAt(i);
  		
  		if (ch == ')') cnt++; 
  		else if (ch == '(') cnt--; 
  		
  		System.out.println("\'" + ch + "\',\t" + i + ",\t" + cnt);
  		
  		if (cnt < 0) return i; 
  	}

  	return s.length();
  }
}
