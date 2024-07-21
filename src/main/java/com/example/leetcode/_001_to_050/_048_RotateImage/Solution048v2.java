package com.example.leetcode._001_to_050._048_RotateImage;

import java.util.ArrayList;
import java.util.List;

/*
 * You are given an n x n 2D matrix representing an image.
 * 
 * Rotate the image by 90 degrees (clockwise).
 * 
 * Follow up:
 * 
 * Could you do this in-place?
 * 
 */

/*
 * 在一維矩陣中移動位置, 方法如下：
 * 
 *              123      741
 * For example: 456  --> 852 
 *              789      963
 * 
 * 以一維陣列來看：  123456789 -> 741852963
 * 
 * 將 123456789 分三段來看： 123 456 789
 * 
 * 123 不動下, 456 須分別往前移動 3, 2, 1個位置.
 * 
 * 也就是: 123 456 -> 4 123 56 -> 41 5 236 -> 4152 6 3
 * 
 * 而 789 須分別往前移動 6, 4, 2 個位置
 * 
 * 也就是： 415263 789 -> 7 415263 89 -> 741 8 5263 9 -> 741852 9 63
 *
 * 所以，從第 1列 (列編號從 0 開始) 開始，每一個數字須往前移動   (i*(col-j)) 個位置
 * 
 */

public class Solution048v2 implements Solution048
{
  public void rotate(int[][] matrix) 
  {
    if (matrix == null)
      throw new IllegalArgumentException("illegal matrix");
    
    int rows = matrix.length;
    if (rows == 0) return;
    
    int cols = matrix[0].length;
    if (cols == 0) return;
    
    if (rows != cols) 
      throw new IllegalArgumentException("rows != cols");
    
    // 先將二維陣列轉為一維矩陣
    List<Integer> list = new ArrayList<Integer>();
    for (int i=0; i<rows; i++) { 
      for (int j=0; j<cols; j++) {
        list.add(matrix[i][j]);
      }
    }
    
    for (int i=1; i<rows; i++)
    {
      for (int j=0; j<cols; j++)
      {
        int loc1 = (i * rows) + j;
        int loc2 = i * (cols - j);
        int val = list.remove(loc1);
        list.add(loc1-loc2, val);
      }
    }
    
    // 寫回原矩陣
    for (int i=0; i<rows; i++) {
      for (int j=0; j<cols; j++) {
        matrix[i][j] = list.get(i * rows + j);
      }
    }
  }  
}