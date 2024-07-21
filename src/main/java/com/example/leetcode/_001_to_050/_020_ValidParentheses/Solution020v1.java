package com.example.leetcode._001_to_050._020_ValidParentheses;

import java.util.Stack;

/*
 * Your runtime beats 45.60% of java submissions.
 */

public class Solution020v1 implements Solution020
{
  public boolean isValid(String s) 
  {
    boolean isValid = true;
    
    Stack<Character> st = new Stack<Character>();
    
    int len = s.length();
    for (int i = 0; i<len; i++)
    {
      char curr_bracket = s.charAt(i);
      
      if (curr_bracket != '(' && curr_bracket != ')' && 
          curr_bracket != '[' && curr_bracket != ']' && 
          curr_bracket != '{' && curr_bracket != '}')
        continue;
      
      if (curr_bracket == '(' || curr_bracket == '[' || 
          curr_bracket == '{')
      {  
        st.push(curr_bracket);
        continue;
      }
      
      if (st.isEmpty()) { isValid = false; break; }
      
      char last_bracket = st.pop();
        
      if ((curr_bracket == ')' && last_bracket != '(') ||
          (curr_bracket == ']' && last_bracket != '[') ||
          (curr_bracket == '}' && last_bracket != '{'))
      {
        isValid = false;
        break;
      }
    }
    if (!st.isEmpty()) isValid = false;
    
    return isValid;
  }
}
