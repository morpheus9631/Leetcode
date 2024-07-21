package com.example.leetcode._301_to_350._301_RemoveInvalidParentheses;

import java.util.List;

import com.example.leetcode.utils.myListUtils;

public class Main301
{

	public static void main(String[] args)
	{
	  System.out.println("301. Remove Invalid Parentheses");
	  
	  String format = "\r\n\"%s\" -> %s";
	  
		Solution301 sol = new Solution301v4();
		
		for (String str : _testCases)
		{
	    List<String> list = sol.removeInvalidParentheses(str);
		  System.out.println(
		      String.format(format, str, myListUtils.toRowString(list)));
		}
	}

	private static String[] _testCases = 
	{
	    "()())()"      // ["()()()", "(())()"]
	  , "(a)())()"     // ["(a)()()", "(a())()"]
	  , ")("           // [""]
	  , ""             // [""]
	  , "))"           // [""]
	  , "("            // [""]
	  , ")(f"          // ["f"]    
	  
	};
}
