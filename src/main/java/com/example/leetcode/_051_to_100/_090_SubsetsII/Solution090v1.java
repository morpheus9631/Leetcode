package com.example.leetcode._051_to_100._090_SubsetsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/*
 *  Given a collection of integers that might contain duplicates, nums, return all possible subsets.
 *  
 *  Note: The solution set must not contain duplicate subsets.
 *  
 *  For example,
 *  
 *    If nums = [1,2,2], a solution is:
 *    
 *    [
 *      [2],
 *      [1],
 *      [1,2,2],
 *      [2,2],
 *      [1,2],
 *      []
 *    ]  
 * 
 */

import java.util.List;
import java.util.Set;

public class Solution090v1 implements Solution090
{
  public List<List<Integer>> subsetsWithDup(int[] nums) 
  {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    
    Set<ArrayList<Integer>> tmpSet = new HashSet<ArrayList<Integer>>();
    
    Arrays.sort(nums);
    
    int len = nums.length; 
    for (int i=0; i < (1<<len); i++)
    {
      List<Integer> list = new ArrayList<Integer>();
      
      String binStr = Integer.toBinaryString(i);
      while (binStr.length() < len) binStr = "0" + binStr;
      
      for (int j=0; j<binStr.length(); j++) 
      {
        if ((binStr.charAt(j)) == '1') list.add(nums[j]); 
      }
      
      if (!tmpSet.contains(list)) 
        tmpSet.add(new ArrayList<Integer>(list));
    }
    res.addAll(tmpSet);
    
    return res;
  }
}
