package com.example.leetcode._001_to_050._047_PermutationsII;

import java.util.Arrays;
import java.util.List;

import com.example.leetcode.utils.myListUtils;
import com.example.leetcode.utils.myStringUtils;

public class Main047
{
  public static void main(String[] args)
  {
    System.out.println("47. Permutations II");
  
    Solution047 sol = new Solution047v2();

    for (int[] test_case : _testCases)
    {
      List<List<Integer>> solset = sol.permuteUnique(test_case);
      
      String solsetStr = myListUtils.toString(solset);
      String outstr = String.format(_format, Arrays.toString(test_case))
                      .replaceAll(_replaceStr, solsetStr);
      System.out.println(outstr);
    }
  }
  
  private static int[][] _testCases = 
  {
      {1,1,2}        
    , {1}               // Excepted: [1]
    , {1,2,3}           // Expected: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
    , {0,3,2,1,1,1}
    , {1,1,0,0,1,-1,-1,1}
  };

  private static String _replaceStr = "###";
  
  private static String _format =
        "\r\nS = %s"
      + "\r\n\r\nAll possible unique permutations is:"
      + "\r\n" + _replaceStr
      + "\r\n\r\n" + myStringUtils.dashLine();
  
}
