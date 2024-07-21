package com.example.leetcode._051_to_100._083_RemoveDuplicatesFromSortedList;

import com.example.leetcode.utils.ListNode;
import com.example.leetcode.utils.myListNodeUtils;

public class Main083
{
  public static void main(String[] args)
  {
    System.out.println("83. Remove Duplicates from Sorted List\r\n");
    
    String format1 = "Input: %s";
    String format2 = "Output: %s\r\n";
    
    Solution083 sol = new Solution083v2();

    for (int[] nums :_testCases)
    {
      ListNode head = myListNodeUtils.createList(nums);

      String inStr = myListNodeUtils.toString(head);
      System.out.println(String.format(format1, inStr));

      ListNode res = sol.deleteDuplicates(head);

      String outStr = myListNodeUtils.toString(res);
      System.out.println(String.format(format2, outStr));
    }
  }
  
  private static int[][] _testCases = 
  {
      {1,1,2}       // 1->2
    , {1,1,2,3,3}   // 1->2->3
    , {1,1,1}       // 1
  };
}  
