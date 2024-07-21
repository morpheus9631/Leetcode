package com.example.leetcode._051_to_100._083_RemoveDuplicatesFromSortedList;

import com.example.leetcode.utils.ListNode;

/*
 * Your runtime beats 59.40 % of java submissions.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution083v2 implements Solution083
{
  public ListNode deleteDuplicates(ListNode head) 
  { 
    if (head == null) return null;
    if (head.next == null) return head;
    
    ListNode ptr = head;
    while (ptr.next != null) 
    {
      if (ptr.next.val == ptr.val) 
      {
        ListNode nxtNode = ptr.next;
        while (nxtNode != null && nxtNode.val == ptr.val) {
          nxtNode = nxtNode.next; 
        }
        ptr.next = nxtNode;
      }
      if (ptr.next != null) ptr = ptr.next;
    }
    
    return head;
  }
}