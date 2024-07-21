package com.example.leetcode._301_to_350._301_RemoveInvalidParentheses;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution301v1 implements Solution301
{
  public List<String> removeInvalidParentheses(String s) 
  {
    List<String> resList = new ArrayList<String>();
    
    Stack<Character> stack = new Stack<Character>();
    
    // 找出造成錯誤的 ')' 位置
    int invalidIdx = -1; 
    for (int i=0; i<s.length(); i++)
    {
    	char ch = s.charAt(i);
    	
    	if (ch == '(')
    	{
    		stack.push(ch);
    	}	
    	else if (ch == ')')
    	{
    		if (stack.isEmpty()) 
    		{
    			invalidIdx = i;
    			break;
    		}	
    	}
    }
    
    // 根據錯誤位置來產生有可能的字串 - 在錯誤位置之前的 ')' 都可能可以消去
    while (--invalidIdx >= 0)
    {
    	if (s.charAt(invalidIdx) == ')')
    	{
    	  String str = s.substring(0, invalidIdx) 
    	  		       + s.substring(invalidIdx+1, s.length());
    	  resList.add(str);
    	}
    }
    
    return resList;
  }

}
