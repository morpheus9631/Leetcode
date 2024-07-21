package com.example.leetcode._051_to_100._070_ClimbingStairs;

/*
 * Your runtime beats 100.00 % of java submissions.
 */

public class Solution070v6 implements Solution070 
{
	public int climbStairs(int n) 
	{
		if (n < 1) return 0;

		int f0 = 0;
		int f1 = 1;

		while(n-- > 0)
		{
			int f2 = f0 + f1;
			f0 = f1;
			f1 = f2;
		};
		
    return f1;
  }
}
