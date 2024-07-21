package com.example.leetcode._001_to_050._038_CountAndSay;

/*
 * Your runtime beats 95.18 % of java submissions.
 */

public class Solution038v3 implements Solution038
{
	public String countAndSay(int n)
	{
		if (n < 1) return null;

		String str = "1";
		for (int i=1; i<n; i++)
		{
			StringBuilder sb = new StringBuilder();
			char[] chs = str.toCharArray();
			
			int j = 0, len = str.length();
			while (j < len)
			{
				int cnt = 1;
				char ch = chs[j];
				while (++j < len && ch == chs[j]) cnt++;
				sb.append(cnt).append(ch);
			}
			str = sb.toString();
		}
		
		return str;
	}
}
