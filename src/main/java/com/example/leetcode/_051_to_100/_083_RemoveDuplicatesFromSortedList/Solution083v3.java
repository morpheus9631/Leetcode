package com.example.leetcode._051_to_100._083_RemoveDuplicatesFromSortedList;

import com.example.leetcode.utils.ListNode;

/*
 * Your runtime beats 59.40 % of java submissions.
 */

public class Solution083v3 implements Solution083
{
  @Override
  public ListNode deleteDuplicates(ListNode head)
  {
    if (head == null) return null;
    if (head.next == null) return head;
    
    ListNode ptr = head;
    while (ptr.next != null) 
    {
      if (ptr.val == ptr.next.val) 
      {
        do {
          ptr.next = ptr.next.next; 
        } while (ptr.next != null && ptr.val == ptr.next.val);
      }
      
      if (ptr.next != null) ptr = ptr.next;
    }
    return head;
  }
}
