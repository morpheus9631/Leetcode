package com.example.leetcode._051_to_100._062_UniquePaths;

import java.util.ArrayList;
import java.util.List;

/*
 * m = 23, n = 12 時, Time Limit Exceeded 
 */

public class Solution062v1 implements Solution062
{
  public int uniquePaths(int m, int n) 
  {
    int numPath = 0;
    
    int start = 0, end = m * n - 1;
    List<Integer> openList = new ArrayList<Integer>();
    openList.add(start);
    
    while (!openList.isEmpty())
    {
      int loc = openList.remove(0);

      int row = loc / n;
      int col = loc % n;
      
      if (loc == end) 
      { 
        numPath++;
        continue; 
      }
      
      if (row+1 < m) openList.add(0, (row+1)*n+col);
      if (col+1 < n) openList.add(0, row*n+(col+1));
    }
    
    return numPath;
  }
}  
