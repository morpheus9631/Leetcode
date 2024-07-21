package com.example.leetcode._001_to_050._021_MergeTwoSortedLists;

import com.example.leetcode.utils.ListNode;
import com.example.leetcode.utils.myListNodeUtils;
import com.example.leetcode.utils.myStringUtils;

public class Main021
{

  public static void main(String[] args)
  {
    System.out.println("21. Merge Two Sorted Lists");
    
    String format = "\r\nL1: %s"
                  + "\r\nL2: %s"
                  + "\r\n\r\nMerge: %s"
                  + "\r\n\r\n" + myStringUtils.dashLine();
    
    Solution021 sol = new Solution021v1();

    int[][][] testcases = getTestCases();
    for (int[][] test_case : testcases)
    {
      int[] nums1 = test_case[0];
      int[] nums2 = test_case[1];
      
      ListNode l1 = myListNodeUtils.createList(nums1);
      ListNode l2 = myListNodeUtils.createList(nums2);
      ListNode lm = sol.mergeTwoLists(l1, l2);
      
      System.out.println(String.format(format, 
          myListNodeUtils.toString(l1), myListNodeUtils.toString(l2), myListNodeUtils.toString(lm)));
    }
  }

  public static int[][][] getTestCases()
  {
    int[][][] testcases =
    {
        { {1,3,5,7,9}, {2,4,6,8} }
      , { {}, {} }
      , { {1}, {2} }
      , { {1,3,5,7,9,11,13,15,17}, {2,4,6,8} }
    };
    return testcases;
  }
}
