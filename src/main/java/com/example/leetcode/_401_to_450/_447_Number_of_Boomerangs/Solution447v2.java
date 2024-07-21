package com.example.leetcode._401_to_450._447_Number_of_Boomerangs;

import java.util.HashMap;

public class Solution447v2 implements Solution447
{
  public int numberOfBoomerangs(int[][] points)
  {
    int res = 0;

    int len = points.length;
    if (len < 3) return 0;
    
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    
    for (int i=0; i<len; i++)
    {
      map.clear();
      for (int j = 0; j<len; j++)
      {
        if (i == j) continue;
        int dist = getDist(points[i], points[j]);
        map.put(dist, map.getOrDefault(dist, 0)+1);
      }
      
      for(int val : map.values()){
        if (val >= 2) { res += val*(val-1); }
      }  
    }

    return res;
  }
  
  private int getDist(int[] p1, int[] p2)
  {
    int x1 = p1[0], y1 = p1[1];
    int x2 = p2[0], y2 = p2[1];
    return (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
  }
}
