package com.example.leetcode._001_to_050._021_MergeTwoSortedLists;

import com.example.leetcode.utils.ListNode;

public class Solution021v1 implements Solution021
{
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
  {
    if (l1 == null) return l2;
    if (l2 == null) return l1;
    
    ListNode head = null;
    ListNode ptr = null;

    int val = -1;
    while (l1 != null && l2 != null)
    {
      if (l1.val <= l2.val)
      {
        val = l1.val;
        l1 = l1.next;
      }
      else
      {
        val = l2.val;
        l2 = l2.next;
      }
      
      if (head == null)
      {
        head = new ListNode(val);
        ptr = head;
      }
      else
      {
        ptr.next = new ListNode(val);
        ptr = ptr.next;
      }
    }

    while (l1 != null) {
      ptr.next = new ListNode(l1.val);
      ptr = ptr.next;
      l1 = l1.next;
    }
    
    while (l2 != null) {
      ptr.next = new ListNode(l2.val);
      ptr = ptr.next;
      l2 = l2.next;
    }
    
    return head;
  }
}
