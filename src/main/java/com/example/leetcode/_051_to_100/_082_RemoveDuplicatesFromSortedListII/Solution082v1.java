package com.example.leetcode._051_to_100._082_RemoveDuplicatesFromSortedListII;

import com.example.leetcode.utils.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution082v1 implements Solution082
{
  public ListNode deleteDuplicates(ListNode head) 
  {
    if (head == null) return null;
    
    ListNode new_head = new ListNode(0);
    ListNode new_ptr = new_head;
    
    ListNode ptr = head.next;
    ListNode pre = head;
    
    boolean isDuplicate = false;
    while (ptr != null)
    {
      if (ptr.val != pre.val)
      {
        new_ptr.next = new ListNode(pre.val);
        new_ptr = new_ptr.next;
      }
      else
      {
        isDuplicate = true;
        while (ptr != null && ptr.val == pre.val) {
          ptr = ptr.next;
        }
        if (ptr == null) break;
        isDuplicate = false;
      }
      pre = ptr;
      ptr = ptr.next;
    }

    if (!isDuplicate)
    {
      new_ptr.next = new ListNode(pre.val);
      new_ptr = new_ptr.next;
    }
    
    return new_head.next;
  }
}