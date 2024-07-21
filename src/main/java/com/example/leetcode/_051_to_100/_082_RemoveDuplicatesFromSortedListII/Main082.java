package com.example.leetcode._051_to_100._082_RemoveDuplicatesFromSortedListII;

import com.example.leetcode.utils.ListNode;
import com.example.leetcode.utils.myListNodeUtils;

public class Main082
{
  public static void main(String[] args)
  {
    System.out.println("82. Remove Duplicates from Sorted List II");
    
    String format = "\r\n Given: %s"
                  + "\r\nReturn: %s";

    Solution082 sol = new Solution082v1();

    for (int[] nums : _testCases)
    {
      ListNode head = myListNodeUtils.createList(nums);
      String str1 = myListNodeUtils.toString(head);
      
      ListNode new_head = sol.deleteDuplicates(head);
      String str2 = myListNodeUtils.toString(new_head);
      
      System.out.println(String.format(format, str1, str2));
    }
  }
  
  private static int[][] _testCases =
  {
    {1,2,3,3,4,4,5}, {1,1,1,2,3}, {}, {1,1}, {1,1,2} 
  };
}
