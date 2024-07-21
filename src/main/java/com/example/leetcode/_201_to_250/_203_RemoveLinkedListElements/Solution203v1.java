package com.example.leetcode._201_to_250._203_RemoveLinkedListElements;

import com.example.leetcode.utils.ListNode;

/*
 * Your runtime beats 67.69% of java submissions.
 */

public class Solution203v1 implements Solution203
{
  public ListNode removeElements(ListNode head, int val)
  {
    if (head == null) return null;
    
    while (head.val == val) 
    {
      if (head.next == null) return null;
      head = head.next;
    }

    ListNode ptr = head;
    while (ptr.next != null)
    {
      if (ptr.next.val == val)
        ptr.next = ptr.next.next;
      else
        ptr = ptr.next;
    }
    
    return head;
  }
}
