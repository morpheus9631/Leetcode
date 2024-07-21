package com.example.leetcode._351_to_400._373_Find_K_PairsWithSmallestSums;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * 2016.10.13: 利用最小堆積 (min heap) 樹來完成
 */

public class Solution373v2 implements Solution373
{
  public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) 
  {
    List<int[]> res = new ArrayList<int[]>();
    
    if (nums1 == null || nums2 == null) return res;
    
    int m = nums1.length;
    int n = nums2.length;
    if (m == 0 || n == 0) return res;
    
    k = Math.min(k,  m*n);
    
    Queue<int[]> queue = new PriorityQueue<int[]>(k,new Comparator<int[]>()
    {
      public int compare(int[] o1,int[] o2)
      {
        int tmp1 = o1[0] + o1[1];
        int tmp2 = o2[0] + o2[1];
        return tmp1 - tmp2;
      }            
    });

    for (int i=0; i<nums1.length; i++)
    {
      for (int j=0; j<nums2.length; j++) {
        queue.add(new int[]{nums1[i],nums2[j]});
      }
    }

    while (k-- > 0) 
    {
      int[] tmp = queue.poll();
      if (tmp == null) break;
      res.add(tmp);
    }
    return res;
  }    
}

