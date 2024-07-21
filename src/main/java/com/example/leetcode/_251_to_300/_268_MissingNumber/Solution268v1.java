package com.example.leetcode._251_to_300._268_MissingNumber;

import java.util.Arrays;

public class Solution268v1 implements Solution268
{
  public int missingNumber(int[] nums) 
  {
    int miss = -1;

    if (nums == null || nums.length == 0) return miss;

    Arrays.sort(nums);

    int len = nums.length;
    if (nums[0] != 0) return 0;
    
    int preNum = nums[0];
    for (int i=1; i<len; i++)
    {
      System.out.println("i: " + i + ", " + nums[i] + ", " + preNum);
      if (nums[i] == preNum+1) 
      {
        preNum = nums[i];
        continue;
      }
      miss = preNum + 1;
      break;
    }
    if (miss == -1) miss = nums.length;
    
    return miss;
  }
}
