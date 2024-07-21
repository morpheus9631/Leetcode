package com.example.leetcode._301_to_350._303_RangeSumQueryImmutable;

public class NumArray
{
	int[] sum = null;

  public NumArray(int[] nums) 
  {
  	if (nums == null) 
  		throw new IllegalArgumentException("illegal matrix");
  	
  	int len = nums.length;
  	if (len == 0) return;
  	
  	sum = new int[len];
  	sum[0] = nums[0]; 
  	
  	for (int i=1; i<len; i++) {
  		sum[i] = sum[i-1] + nums[i];
  	}
  }

  public int sumRange(int i, int j) 
  {
    int val = 0;
    
    if (i < 0) i = 0;
    if (j > sum.length - 1) j = sum.length - 1;
    
    val = (i == 0) ? sum[j] : (sum[j] - sum[i-1]);
    
    return val;
  }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */