package com.example.leetcode._151_to_200._200_NumberOfIslands;

import java.util.Arrays;

public class Solution200v1 implements Solution200
{
  public int numIslands(char[][] grid) 
  {
    int cnt = 0;
    
    if (grid == null) throw new IllegalArgumentException("Illegal grid");
    
    int rows = grid.length;
    if (rows == 0) return 0;
    
    int cols = grid[0].length;
    if (cols == 0) return 0;
    
    boolean[][] visit = null;
    visit = new boolean[rows][cols];
    for (int i=0; i<rows; i++) Arrays.fill(visit[i], false);
    
    for (int i=0; i<rows; i++) 
    {
      for (int j=0; j<cols; j++) 
      {
        if (visit[i][j] == false) 
        {
          boolean isIsland = DFS(grid, visit, i, j);
          if (isIsland) cnt++;
        }
      }
    }

    return cnt;
  }
  
  private boolean DFS(char[][] grid, boolean[][] visit, int row, int col)
  {
    if (visit[row][col]) return false;
    
    visit[row][col] = true;
    if (grid[row][col] == '0') return false; 
    
    if (row-1 >= 0 && visit[row-1][col] == false)
      DFS(grid, visit, row-1, col);
    
    if (row+1 < grid.length && visit[row+1][col] == false)
      DFS(grid, visit, row+1, col);
    
    if (col-1 >= 0 && visit[row][col-1] == false)
      DFS(grid, visit, row, col-1);
    
    if (col+1 < grid[0].length && visit[row][col+1] == false)
      DFS(grid, visit, row, col+1);
    
    return true;
  }
}
