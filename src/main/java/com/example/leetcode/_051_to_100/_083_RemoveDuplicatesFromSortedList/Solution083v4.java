package com.example.leetcode._051_to_100._083_RemoveDuplicatesFromSortedList;

import com.example.leetcode.utils.ListNode;

/*
 * Your runtime beats 100.00 % of java submissions.
 */

public class Solution083v4 implements Solution083
{
  @Override
  public ListNode deleteDuplicates(ListNode head)
  {
    ListNode ptr = head;
    while(ptr != null && ptr.next != null) 
    {
      if(ptr.val == ptr.next.val) 
        ptr.next = ptr.next.next;
      else 
        ptr = ptr.next;
    }
    return head;
  }
}
