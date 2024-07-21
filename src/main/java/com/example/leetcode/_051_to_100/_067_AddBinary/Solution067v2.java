package com.example.leetcode._051_to_100._067_AddBinary;


/*
 * Your runtime beats 91.80 % of java submissions.
 */
public class Solution067v2 implements Solution067
{
	public String addBinary(String a, String b)
	{
		if (a == null || a.length() == 0) return b;
		if (b == null || b.length() == 0) return a;
		
		int m = a.length();
		int n = b.length();
		int l = Math.max(m, n);
		
		char[] ch_A = a.toCharArray();
		char[] ch_B = b.toCharArray();
		char[] res = new char[l + 1];

		int i = m - 1,  j = n - 1, carry = 0;
		while (i >= 0 || j >= 0)
		{
			if (i >= 0) { carry += ch_A[i--] - '0'; }
			if (j >= 0) { carry += ch_B[j--] - '0'; }
			res[l--] = (char)(carry % 2 + '0');
			carry /= 2;
		}
	
		StringBuilder sb = new StringBuilder();
		if (carry > 0) sb.append(carry);
		for (int k=0; k<res.length; k++) {
			if (res[k] != '\u0000') sb.append(res[k]);
		}
		return sb.toString();
	}
}
