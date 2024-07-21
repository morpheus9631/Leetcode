package com.example.leetcode._051_to_100._059_SpiralMatrixII;

import com.example.leetcode.utils.myArrayUtils;

public class Main059
{
  public static void main(String[] args)
  {
    System.out.println("59. Spiral Matrix II");
    
    String replaceStr = "###";
    String format = "\r\nn = %d"
                  + "\r\nThe matrix is:"
                  + "\r\n" + replaceStr
                  ;
    
    Solution059 sol = new Solution059v1();
    
    int n = 4;
    int[][] matrix = sol.generateMatrix(n);
    
    String outstr = String.format(format, n)
                    .replace(replaceStr, myArrayUtils.toString(matrix));
    System.out.println(outstr);
  }
}
