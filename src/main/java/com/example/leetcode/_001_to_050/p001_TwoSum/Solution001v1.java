package com.example.leetcode._001_to_050.p001_TwoSum;

public class Solution001v1 implements Solution001
{
    public int[] twoSum(int[] nums, int target) 
    {
        int len = nums.length;
        for (int i=0; i<len-1; i++) {
            for (int j=i+1; j<len; j++) {
                if (nums[i]+nums[j] == target) {
                    return new int[] {i, j}; 
                }
            }
        }
        return null;
    }

}
