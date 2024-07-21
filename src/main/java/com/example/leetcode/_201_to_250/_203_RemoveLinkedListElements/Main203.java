package com.example.leetcode._201_to_250._203_RemoveLinkedListElements;

import com.example.leetcode.utils.ListNode;
import com.example.leetcode.utils.myListNodeUtils;

public class Main203
{
  public static void main(String[] args)
  {
    System.out.println("152. Maximum Product Subarray");
    
    String format = "\r\nGiven: %s"
                  + "\r\nVal = %d"
                  + "\r\nReturn: %s";
    
    Solution203 sol = new Solution203v1();

    for (int[][] testcase : _testCases)
    {
      int val = testcase[0][0];
      int[] nums = testcase[1];

      ListNode head = myListNodeUtils.createList(nums);
      String str1 = myListNodeUtils.toString(head);
      
      head = sol.removeElements(head, val);
      
      System.out.println(String.format(format, 
          str1, val, myListNodeUtils.toString(head)));
    }
  }
  
  private static int[][][] _testCases = 
  {
      { {6}, {1,2,6,3,4,5,6} }
    , { {1}, {} }
    , { {1}, {1} }
  };
}
