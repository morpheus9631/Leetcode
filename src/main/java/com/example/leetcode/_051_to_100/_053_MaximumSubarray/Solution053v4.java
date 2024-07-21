package com.example.leetcode._051_to_100._053_MaximumSubarray;

/*
 * Your runtime beats 82.23 % of java submissions.
 */
public class Solution053v4 implements Solution053
{
	public int maxSubArray(int[] nums)
	{
		if (nums == null) return -1;
		
		int len = nums.length;
		if (len == 0) return 0;
		
		int max_sum = nums[0];
		int sum = 0;
		
		for (int i=0; i<len; i++)
		{
			sum = sum + nums[i];
			if (sum < nums[i]) { sum = nums[i]; }
			if (max_sum < sum) max_sum = sum;
		}
		return max_sum;
	}
}
