package com.example.leetcode._101_to_150._141_LinkedListCycle;

import com.example.leetcode.utils.ListNode;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution141v2 implements Solution141
{
  public boolean hasCycle(ListNode head) 
  {
    ListNode fast = head;
    ListNode slow = head;

    while (fast != null && fast.next != null) 
    {
      fast = fast.next.next;
      slow = slow.next;
      if (slow == fast) break;
    }
    return !(fast == null || fast.next == null);
  }
}