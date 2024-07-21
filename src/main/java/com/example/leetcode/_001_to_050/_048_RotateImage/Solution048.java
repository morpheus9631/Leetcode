package com.example.leetcode._001_to_050._048_RotateImage;

/*
 * 數學方法：
 *   1.把矩陣的上下列對調，也就是第 0 列和第 n-1 列對調，第 1 列和第 n-2 列對調,...。
 *   2.執行鏡像交換，也就是第 (i,j) 個 元素和第 (j,i) 個元素交換.
 *   3.完成。
 */

public interface Solution048
{
  public void rotate(int[][] matrix);
}
