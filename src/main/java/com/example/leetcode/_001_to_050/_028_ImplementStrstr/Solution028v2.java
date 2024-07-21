package com.example.leetcode._001_to_050._028_ImplementStrstr;

//import java.util.Arrays;

public class Solution028v2 implements Solution028
{
	public int strStr(String haystack, String needle)
	{
		if (haystack == null || needle == null) return -1;
		
		int len1 = haystack.length();
		int len2 = needle.length();
		if (len2 == 0) return 0;
		if (len1 < len2) return -1;
		
		int idx = -1;
		int[] dp = new int[len1];
		for (int i=0; i<len1-len2+1; i++)
		{
			int j = 0;
			if (haystack.charAt(i) != needle.charAt(j)) continue;
			
			int k = i;
			do {
				dp[i]++;
			} while (++k < len1 && ++j < len2 && haystack.charAt(k) == needle.charAt(j));
			
			if (dp[i] == len2) { idx = i; break; };
		}
//		System.out.println(Arrays.toString(dp));
		
		return idx;
	}
}
