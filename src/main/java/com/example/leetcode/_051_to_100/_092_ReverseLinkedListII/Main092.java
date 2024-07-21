package com.example.leetcode._051_to_100._092_ReverseLinkedListII;

import com.example.leetcode.utils.ListNode;
import com.example.leetcode.utils.myListNodeUtils;

public class Main092
{
  public static void main(String[] args)
  {
    System.out.println("92. Reverse Linked List II");
    
    String format = "\r\nGiven: %s"
                  + "\r\nm = %d, n = %d"
                  + "\r\nReturn: %s"
                  ;
    
    Solution092 sol = new Solution092v1();
    
    for (int[][] testcase : _testCases)
    {
      int[] nums = testcase[0];
      int m = testcase[1][0];
      int n = testcase[1][1];
      
      ListNode head = myListNodeUtils.createList(nums);
      ListNode new_head = sol.reverseBetween(head, m, n);

      System.out.println(String.format(format, 
          myListNodeUtils.toStringWithNull(new_head), m, n, 
          myListNodeUtils.toStringWithNull(new_head)));
    }
  }
  
  private static int[][][] _testCases =
  {
    { {1,2,3,4,}, {2,4} },
    { {3,5}, {1,2} },
    { {5}, {1,1} }
  };
}
