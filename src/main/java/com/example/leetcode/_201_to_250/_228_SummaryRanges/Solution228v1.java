package com.example.leetcode._201_to_250._228_SummaryRanges;

import java.util.ArrayList;
import java.util.List;

public class Solution228v1 implements Solution228
{
  public List<String> summaryRanges(int[] nums) 
  {
    List<String> res = new ArrayList<String>();

    if (nums == null || nums.length == 0) return res;
    int len = nums.length;
    
    String str = "";
    int start = nums[0], count = 1;
    for (int i=1; i<len; i++)
    {
      if (nums[i]-nums[i-1] == 1) {
        count++;
        continue;
      }

      str = Integer.toString(start);
      if (count > 1) {
        str += "->" + Integer.toString(nums[i-1]); 
      }
      start = nums[i];
      count = 1;
      res.add(str);
    }

    str = Integer.toString(start);
    if (count > 1) {
      str += "->" + Integer.toString(nums[len-1]); 
    }
    res.add(str);
    
    return res;
  }
}
