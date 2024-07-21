package com.example.leetcode._001_to_050._048_RotateImage;

import com.example.leetcode.utils.myArrayUtils;

public class Main048
{
  public static void main(String[] args)
  {
    System.out.println("48. Rotate Image");
    
    Solution048 sol = new Solution048v2();
    
    int len = 3;
    int[][] test_case = getTestCase(len);
    
    System.out.println("\r\nSource matrix:");
    System.out.println(myArrayUtils.toString(test_case));
    
    sol.rotate(test_case);
    
    System.out.println("\r\nRotate matrix:");
    System.out.println(myArrayUtils.toString(test_case));
  }
  
  private static int[][] getTestCase(int len)
  {
    int[][] matrix = new int[len][len];

    for (int i=0; i<len; i++) {
      for (int j=0; j<len; j++) {
        matrix[i][j] = (i * len) + j + 1;
      }
    }
    
    return matrix;
  }
}
