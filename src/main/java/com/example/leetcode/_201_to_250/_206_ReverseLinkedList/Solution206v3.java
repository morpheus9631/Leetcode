package com.example.leetcode._201_to_250._206_ReverseLinkedList;

import com.example.leetcode.utils.ListNode;

/*
 * Your runtime beats 4.32% of java submissions.
 */

public class Solution206v3 implements Solution206
{
  public ListNode reverseList(ListNode head)
  {
    if (head == null || head.next == null) return head;

    ListNode next = head.next;
    head.next = null;

    ListNode ptr = reverseList(next);
    next.next = head;

    return ptr;
  }
}
