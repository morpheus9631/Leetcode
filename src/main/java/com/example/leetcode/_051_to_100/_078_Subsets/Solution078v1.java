package com.example.leetcode._051_to_100._078_Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 
 * 1. 以 DFS（深度優先搜尋）為基礎的遞迴方法。
 * 
 *    原數組中每一個元素在子集中有兩種狀態：選擇、和不選擇。
 *   
 *    因此可以建構一棵二元樹來表示所有的選擇狀態：
 *  
 *    二元 樹中的第 i+1 層第 0 層無節點表示子集中加入或不加入第i個元素，左子樹表示加入，右子樹表示不加入。
 *  
 *    所有葉節點即為所求子集。因此可以採用DFS的遞歸思想求得所有葉節點。
 *    
 *    
 *    
 */

public class Solution078v1 implements Solution078
{
  public List<List<Integer>> subsets(int[] nums) 
  {
    List<List<Integer>> resList = new ArrayList<List<Integer>>();

    if (nums == null || nums.length == 0) return resList;

    List<Integer> list = new ArrayList<Integer>();

    Arrays.sort(nums);
    resList.add(list);

    for (int len=1; len <= nums.length; len++) {
      DFS(nums, 0, len, list, resList);
    }

    return resList;
  }
  
  public void DFS(int[] nums, int start, int len
                , List<Integer> list, List<List<Integer>> res)
  {
    if (list.size() == len)
    {
      res.add(new ArrayList<Integer>(list));
      return;
    }
    
    for  (int i=start; i<nums.length; i++)
    {
      if (list.contains(nums[i])) continue;
      
      list.add(nums[i]);
      DFS(nums, i+1, len, list, res);
      list.remove(list.size()-1);
    }
  }
}
