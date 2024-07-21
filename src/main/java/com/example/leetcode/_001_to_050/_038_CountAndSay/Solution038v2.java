package com.example.leetcode._001_to_050._038_CountAndSay;

public class Solution038v2 implements Solution038
{
	public String countAndSay(int n)
	{
		if (n < 1) return null;

		int i = 1;
		String str = "1";
		if (n == 1) return str;
		
		while (i < n)
		{
			String newStr = "";

			int j = 0, len = str.length();
			while (j < len)
			{
				int cnt = 1;
				char ch = str.charAt(j++);
				while (j < len && ch == str.charAt(j)) {
					j++; cnt++;
				}
				newStr += Integer.toString(cnt) + ch;
			}
			
			str = newStr;
			// System.out.println(sb.toString());
			i++;
		}
		
		return str;
	}
}
