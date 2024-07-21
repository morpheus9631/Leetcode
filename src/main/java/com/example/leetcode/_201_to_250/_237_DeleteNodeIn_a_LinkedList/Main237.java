package com.example.leetcode._201_to_250._237_DeleteNodeIn_a_LinkedList;

import com.example.leetcode.utils.ListNode;
import com.example.leetcode.utils.myListNodeUtils;

public class Main237
{
  public static void main(String[] args)
  {
    System.out.println("237. Delete Node in a Linked List");
    
    String format = "\r\nList: %s"
                  + "\r\nDelete node: %d"
                  + "\r\nReturn: %s"
                  ;
    
    Solution237 sol = new Solution237v1();
    
    for (int[][] testcase :_testCases)
    {
      ListNode head = myListNodeUtils.createList(testcase[1]);
      String str1 = myListNodeUtils.toString(head);
      
      int n = testcase[0][0];
      ListNode deleteNode = findNode(head, n);
      
      sol.deleteNode(deleteNode);
      
      System.out.println(String.format(format, 
          str1, n, myListNodeUtils.toString(head)));
    }
  }

  private static int[][][] _testCases = 
  {
      { {3}, {1,2,3,4} }    
  };
  
  private static ListNode findNode(ListNode head, int n)
  {
    ListNode node = head;
    while (node != null) {
      if (node.val == n) break;
      node = node.next;
    }
    return node;
  }
}
