package com.example.leetcode._051_to_100._059_SpiralMatrixII;

public class Solution059v3 implements Solution059 
{
  public int[][] generateMatrix(int n) 
  {
    int[][] matrix = new int[n][n];

    if(n < 1) return matrix;
    
    int k = 1, lower = 0, upper = n-1;
    while(lower < upper) 
    {
      for(int col = lower; col < upper; col++)
        matrix[lower][col] = k++;
      
      for(int row = lower; row < upper; row++)
        matrix[row][upper] = k++;
      
      for(int col = upper; col > lower; col--)
        matrix[upper][col] = k++;

      for(int row = upper; row > lower; row--)
        matrix[row][lower] = k++;
      
      System.out.println("A: "+lower +", " + upper);
      
      lower++; upper--;
    }
    if(lower == upper) matrix[lower][upper] = k;
    
    return matrix;
  }
}
