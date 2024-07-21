package com.example.leetcode._201_to_250._206_ReverseLinkedList;

import com.example.leetcode.utils.ListNode;

/*
 * Your runtime beats 36.62% of java submissions.
 */

public class Solution206v2 implements Solution206
{
  public ListNode reverseList(ListNode head)
  {
    if (head == null ||head.next == null) return head;
    
    ListNode new_head = null;
    while (head != null)
    {
      ListNode ptr = head;
      head = head.next;
      ptr.next = new_head;
      new_head = ptr;
    }
    head = new_head;
    
    return head;
  }
}
