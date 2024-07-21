package com.example.leetcode._301_to_350._301_RemoveInvalidParentheses;

import java.util.ArrayList;
import java.util.List;

/*
 * 解題方法：
 *   
 *  1. 從左向右找出錯誤的 ')', 如果在第 i 個位置的 ')' 是錯誤的。 
 *     那麼, 在 0 ~ i-1 之間若有 n 個 ')'，就會有  n-1 種正確的結果 。
 *   
 *  2. 從右向左找出錯誤的 '(', 如果在第 j 個位置的 '(' 是錯誤的。 
 *     那麼, 在 j+1 ~ len 之間若有 m 個 '('，就會有  m-1 種正確的結果 。
 *      
 *  3. 雙向將錯誤的 '(' 和 ')' 去除後，就可以得到 m * n 個 正確結果。
 * 
 */


public class Solution301v3 implements Solution301
{
  public List<String> removeInvalidParentheses(String s) 
  {
    List<String> resList = new ArrayList<String>();
    
    if (s.length() == 0) {
    	resList.add(s); return resList;
    }

    List<String> checkList = new ArrayList<String>();
    checkList.add(s);

    // 由左向右找出造成錯誤的 ')'
    while (!checkList.isEmpty())
    {
    	String tmpstr = checkList.remove(0);
    	int len = tmpstr.length();
    	
    	if (len == 0)
    	{
      	if (!resList.contains(tmpstr)) resList.add(tmpstr);
      	continue;
    	}
    	
    	int invalidIdx = isValidLeft(tmpstr);

    	if (invalidIdx == len)
      {
      	if (!resList.contains(tmpstr)) resList.add(tmpstr);
      	continue;
      }

      int i = invalidIdx;
      while (i >= 0)  
      {
      	if (tmpstr.charAt(i) == ')')
      	{
      	  String newstr = tmpstr.substring(0, i) 
      	  		          + tmpstr.substring(i+1, tmpstr.length());
      	  checkList.add(newstr);
      	}
      	i--;
      };
    }
    
    checkList = new ArrayList<String>(resList);
    resList.clear();

    // 由右向左找出造成錯誤的 '('
    while (!checkList.isEmpty())
    {
    	String tmpstr = checkList.remove(0);
      int len = tmpstr.length();
      
      if (len == 0)
      {
      	if (!resList.contains(tmpstr)) resList.add(tmpstr);
      	continue;
      }
      
      int invalidIdx = isValidRight(tmpstr); // 

      if (invalidIdx == len)
      {
      	if (!resList.contains(tmpstr)) resList.add(tmpstr);
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
      	}
      	i++;
    	}
    }  
    
    return resList;
  }
  
  /*
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
  		
  		if (cnt < 0) return i; 
  	}

  	return s.length();
  }
}
