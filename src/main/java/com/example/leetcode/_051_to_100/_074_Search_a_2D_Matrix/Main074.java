package com.example.leetcode._051_to_100._074_Search_a_2D_Matrix;

import com.example.leetcode.utils.myArrayUtils;
import com.example.leetcode.utils.myStringUtils;

public class Main074
{

  public static void main(String[] args)
  {
    System.out.println("74. Search a 2D Matrix");
    
    String replaceStr = "###";
    
    String format = "\r\nMatrix:"
                  + "\r\n" + replaceStr
                  + "\r\n\r\nTarget is %d: %b"
                  +"\r\n\r\n" + myStringUtils.dashLine(); 
        
    Solution074 sol = new Solution074v1();
    
    int len = _testCases.length;
    for (int i=0; i<len; i++)
    {
      int[][] testcase = _testCases[i];
      int target = _testTargets[i];
      
      boolean isFound = sol.searchMatrix(testcase, target);
      
      
      String outstr = String.format(format, target, isFound)
                      .replace(replaceStr, myArrayUtils.toString(testcase));
      System.out.println(outstr);
    }
  }
  
  private static int[][][] _testCases =
  {
    { {1,3,5,7}, {10,11,16,20}, {23,30,34,50} }
  };
  
  private static int[] _testTargets = { 3 }; 
}
