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

/*
 * 2017.03.09:  Time Limit Exceeded 
 */
public class Solution141v1 implements Solution141
{
  public boolean hasCycle(ListNode head) 
  {
    if (head == null) return false;
    
    ListNode point = head.next;
    while (point != null)
    {
      if (point.val == head.val) return true;
      point = point.next;
    }
  
    return false;
  }
}