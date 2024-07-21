package com.example.leetcode._001_to_050._035_SearchInsertPosition;

import java.util.Arrays;

import com.example.leetcode.utils.myArrayUtils;
import com.example.leetcode.utils.myStringUtils;

public class Main035
{
  public static void main(String[] args)
  {
      System.out.println("35. Search Insert Position");
      
      Solution035 sol = new Solution035v1();

      for (int[][] test_case : _testCases)
      {
        int[] nums = test_case[0];
        int target = test_case[1][0];
        int idx = sol.searchInsert(nums, target);
        
        
        boolean isFound = myArrayUtils.contains(nums, target);
        System.out.println(isFound);
        String outstr = (isFound)
            ? String.format(_format1, Arrays.toString(nums), target, idx)
            : String.format(_format2, Arrays.toString(nums), target, idx)
            ;
        System.out.println(outstr); 
      }
  }
  
  private static int[][][] _testCases =
  {
      { {1}, {0} }
    , { {1,3,5,6}, {5} }
    , { {1,3,5,6}, {2} }
    , { {1,3,5,6}, {7} }
    , { {1,3,5,6}, {0} }
  };
  
  private static String _format1 = 
      "\r\nNums: %s"
    + "\r\nTarget = %d"
    + "\r\n\r\nIndex is %d"
    + "\r\n\r\n" + myStringUtils.dashLine();
  
  private static String _format2 = 
      "\r\nNums: %s"
    + "\r\nTarget = %d"
    + "\r\n\r\nIt would be inserted in index %d"
    + "\r\n\r\n" + myStringUtils.dashLine();
}
