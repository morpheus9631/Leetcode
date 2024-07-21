package com.example.leetcode._001_to_050._047_PermutationsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution047v1
{
  public List<List<Integer>> permuteUnique(int[] nums) 
  {
    ArrayList<List<Integer>> perms = new ArrayList<List<Integer>>();
    
    Arrays.sort(nums);
    List<Integer> list = new ArrayList<Integer>();
    for (int num : nums) list.add(num);
    
    permute(perms, list, 0);

    return perms;
  }
  
  public void permute(List<List<Integer>> perms, List<Integer> list, int start)
  {
    int size = list.size();
    if (start == size)
    {
      if (!perms.contains(list))
        perms.add(new ArrayList<Integer>(list));
    }
    else
    {
      for (int i=start; i<size; i++)
      {
        Collections.swap(list, i, start);
        permute(perms, list, start+1);
        Collections.swap(list, i, start);
      }
    }
  }
}
