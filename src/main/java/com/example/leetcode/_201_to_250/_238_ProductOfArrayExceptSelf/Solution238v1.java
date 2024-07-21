package com.example.leetcode._201_to_250._238_ProductOfArrayExceptSelf;

public class Solution238v1 implements Solution238
{
  public int[] productExceptSelf(int[] nums) 
  {
  	int[] res = null;
  	
  	int len = nums.length;
  	res = new int[len];
  	
		int tmp = 1;
  	for (int i=0; i<len; i++) 
  	{
  		res[i] = tmp;
  		tmp *= nums[i];
  	}	
  	
		tmp = 1;
  	for (int i=len-1; i>=0; i--)
  	{
  		res[i] *= tmp;
  		tmp *= nums[i];
  	}	
  	
    return res;
  }
}
