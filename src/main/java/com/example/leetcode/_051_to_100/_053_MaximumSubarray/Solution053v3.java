package com.example.leetcode._051_to_100._053_MaximumSubarray;

public class Solution053v3 implements Solution053
{
	public int maxSubArray(int[] nums)
	{
		if (nums == null) return -1;
		
		int len = nums.length;
		if (len == 0) return 0;
		
		int[] dp = new int[len];
		int max_sum = dp[0] = nums[0];
		
		for (int i=1; i<len; i++)
		{
			int sum = dp[i-1] + nums[i];
			dp[i] = (sum > nums[i]) ? sum : nums[i];
			if (dp[i] > max_sum) max_sum = dp[i];
			
			System.out.println(i+", "+dp[i]+", "+sum);
		}
		return max_sum;
	}
}
