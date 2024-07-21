package com.example.leetcode._051_to_100._067_AddBinary;

/*
 * Your runtime beats 100.00 % of java submissions.
 */

public class Solution067v3 implements Solution067
{
	public String addBinary(String a, String b)
	{
		String outstr = "";
		
		int carry = 0, sum = 0;
		
		int len_a = a.length();
		int len_b = b.length();
		
		if (len_a < len_b) {
			String tmp = a;	a = b; b = tmp;
			len_a = a.length();
			len_b = b.length();
		}

		int len_max = len_a;
		char[] res = new char[len_max]; 
		
		while (--len_b >= 0)
		{
			char ch_b = b.charAt(len_b);
			char ch_a = a.charAt(--len_a);

			int total = carry + ch_a - 48 + ch_b - 48;
			carry = total / 2;
			sum = total % 2;
			res[len_a] = (char) (sum + 48);
		}
		
		while (--len_a >= 0) {
			char ch_a = a.charAt(len_a);
			int total = carry + ch_a - 48;
			carry = total / 2;
			sum = total % 2;
			res[len_a] = (char) (sum + 48);
		}
		
		outstr = ((carry > 0) ? "1" : "") + String.valueOf(res); 
		
		return outstr;
	}
}
