package com.example.leetcode._051_to_100._058_LengthOfLastWord;


/*
 * Your runtime beats 99.92 % of java submissions.
 */
public class Solution058v3 implements Solution058
{
	public int lengthOfLastWord(String s)
	{
		if (s == null) return 0;
		
		int len  = s.length();
		if (len == 0) return len;
		
		char[] chs = s.toCharArray();
		
		int i = len - 1;
		while (i >= 0 && chs[i] == ' ') i--;
		
		int cnt = 0;
		while (i >= 0 && chs[i] != ' ') { i--; cnt++; }
		
		return cnt;
	}
}
