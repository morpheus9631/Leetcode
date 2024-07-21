package com.example.leetcode._351_to_400._373_Find_K_PairsWithSmallestSums;

import java.util.Arrays;
import java.util.List;

import com.example.leetcode.utils.myStringUtils;

public class Main373
{
  public static void main(String[] args)
  {
    System.out.println("373. Find K Pairs with Smallest Sums");

    String format = "\r\nk = %d"
                  + "\r\nnum1 = %s"
                  + "\r\nnum2 = %s"
                  + "\r\nReturn: %s"
                  + "\r\n\r\n" + myStringUtils.dashLine()
                  ;    
    Solution373 sol = new Solution373v2();
    
    for (int[][] testcase : _testCases)
    {
      int k = testcase[0][0];
      int[] nums1 = testcase[1];
      int[] nums2 = testcase[2];
      List<int[]> res = sol.kSmallestPairs(nums1, nums2, k);

      System.out.println(String.format(format, 
          k, Arrays.toString(nums1), Arrays.toString(nums2), 
          listIntToString(res)));
    }
  }

  private static int[][][] _testCases = 
  {
      { {3}, {1,7,11}, {2,4,6} }
    , { {2}, {1,1,2}, {1,2,3} }
    , { {3}, {1,2}, {3} }
    , { {5}, {}, {} }
    , { {1}, {}, {3,5,7,9} }  
    , { {3}, {1,2,4,5,6}, {3,5,7,9} }   // Expected: Expected: [[1,3],[2,3],[1,5]] 
    
  };
  
  private static String listIntToString(List<int[]> list)
  {
    if (list == null) return null;
    
    StringBuilder sb = new StringBuilder();
    if (list.isEmpty()) return sb.toString();
    
    for (int[] nums : list)
    {
      sb.append(Arrays.toString(nums)).append(",");
    }
    int idx = sb.lastIndexOf(",");
    sb.delete(idx, sb.length());
    
    sb.insert(0, "[").append("]");

    return sb.toString();
  }
}
