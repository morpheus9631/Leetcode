package com.example.leetcode._201_to_250._206_ReverseLinkedList;

import com.example.leetcode.utils.ListNode;
import com.example.leetcode.utils.myListNodeUtils;

public class Main206
{
  public static void main(String[] args)
  {
    System.out.println("206. Reverse Linked List");
    
    String format = "\r\nNums = %s"
                  + "\r\nReturn: %s";
    
    Solution206 sol = new Solution206v2();

    for (int[] nums : _testCases)
    {
      ListNode head = myListNodeUtils.createList(nums);
      String str1 = myListNodeUtils.toString(head);
      
      head = sol.reverseList(head);
      String str2 = myListNodeUtils.toString(head);
      
      System.out.println(String.format(format, str1, str2));
    }
  }
  
  private static int[][] _testCases = 
  {
      {1}
    , {1,2}
    , {1,2,3}
    , {1,2,3,4,5,6}
  };
}
