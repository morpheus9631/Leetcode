package com.example.leetcode._001_to_050._047_PermutationsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * 2017.02.28: Time Limit Exceeded 
 */

public class Solution047v2 implements Solution047 
{
  public List<List<Integer>> permuteUnique(int[] nums) 
  {
    List<List<Integer>> perms = new ArrayList<List<Integer>>();
    
    Set<List<Integer>> set = new HashSet<List<Integer>>();

    Arrays.sort(nums);
    List<Integer> list = new ArrayList<Integer>();
    for (int i=0; i<nums.length; i++) list.add(i);
    
    permute(perms, list, 0, nums.length);

    for (int i=0; i<perms.size(); i++)
    {
      list = perms.get(i);

      for (int j=0; j<list.size(); j++) {
        list.set(j,  nums[list.get(j)]);
      }
      
      if (!set.contains(list)) set.add(list);
    }

    return new ArrayList<List<Integer>>(set);
  }
  
  public void permute(List<List<Integer>> perms, List<Integer> list, int start, int len)
  {
    if (start == len)
    {
      perms.add(new ArrayList<Integer>(list));
    }
    else
    {
      for (int i=start; i<len; i++)
      {
        int tmp = list.get(start); 
        list.set(start, list.get(i)); 
        list.set(i, tmp);
        
        permute(perms, list, start+1, len);

        tmp = list.get(start); 
        list.set(start, list.get(i)); 
        list.set(i, tmp);
      }
    }
  }
}
