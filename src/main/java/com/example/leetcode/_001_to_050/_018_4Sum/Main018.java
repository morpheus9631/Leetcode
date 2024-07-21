package com.example.leetcode._001_to_050._018_4Sum;

import java.util.Arrays;
import java.util.List;

import com.example.leetcode.utils.myStringUtils;

public class Main018
{
  public static void main(String[] args)
  {
    System.out.println("18. 4Sum");
    
    String replaceStr = "###";
    
    String format = "\r\nS = %s"
                  + "\r\nTarget = %d"
                  + "\r\n\r\nA solution set is:"
                  +"\r\n["+replaceStr+"]"
                  + "\r\n\r\n" + myStringUtils.dashLine();
           
    Solution018 sol = new Solution018v2();
    
    int[][][] testcases = getTestCases();
    for (int[][] test_case : testcases)
    {
      int[] S = test_case[0];
      int target = test_case[1][0];
      
      List<List<Integer>> solset = sol.fourSum(S, target);
      
      StringBuffer sb = new StringBuffer();
      if (solset.size() > 0)
      {
        for (List<Integer> list : solset) {
          sb.append("\r\n  "+list.toString());
        }
        sb.append("\r\n");
      }
      
      String outstr = String.format(format, Arrays.toString(S), target);
      System.out.println(outstr.replace(replaceStr, sb.toString()));
    }
  }

  private static int[][][] getTestCases()
  {
    int[][][] testcases = 
    {
      { { 1, 0, -1, 0, -2, 2 }, {0} },
      { { 1, 1 }, {2} },
      { {-5, 5, 4, -3, 0, 0, 4, -2 }, {4} },
      { { -493,-482,-482,-456,-427,-405,-392,-385,-351,-269,
          -259,-251,-235,-235,-202,-201,-194,-189,-187,-186,
          -180,-177,-175,-156,-150,-147,-140,-122,-112,-112,
          -105, -98, -49, -38, -35, -34, -18,  20,  52,  53,
            57,  76, 124, 126, 128, 132, 142, 147, 157, 180,
           207, 227, 274, 296, 311, 334, 336, 337, 339, 349,
           354, 363, 372, 378, 383, 413, 431, 471, 474, 481,
           492        
        }, { 6189 } 
      }
    };
    return testcases;
  }
  
}
