package com.example.leetcode._351_to_400._395_LongestSubstringWithAtLeast_K_RepeatingCharacters;

import com.example.leetcode.utils.myStringUtils;

public class Main395
{
	public static void main(String[] args)
	{
	  System.out.println("395. Longest Substring with At Least K Repeating Characters");
	  
	  String format = "\r\ns= %s, k = %d"
	                + "\r\n\r\nOutput:\r\n%d"
	                + "\r\n\r\n" + myStringUtils.dashLine(20)
	                ;
	  
		Solution395 sol = new Solution395v1();
		
		for (String[] testcase : _testCases)
		{
		  int k = Integer.valueOf(testcase[0]);
		  String str = testcase[1];
	    int len = sol.longestSubstring(str, k);
	    
	    System.out.println(String.format(format, str, k, len));
		}
	}
	
	private static String[][] _testCases = 
	{
	    { "3", "aaabb" }
	  , { "2", "ababbc" }
	  , { "2", "weitong" }
    , { "3", "ababacb" }
    , { "3", "bbaaacbd" }
    , { "3", "ababa" }
	};
}
