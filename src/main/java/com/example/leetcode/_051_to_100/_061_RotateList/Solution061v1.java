package com.example.leetcode._051_to_100._061_RotateList;

import com.example.leetcode.utils.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution061v1 implements Solution061
{
  public ListNode rotateRight(ListNode head, int k) 
  {
    ListNode new_head = null;
    
    if (head == null) return null;
    if (k == 0) return head;
    
    int len = 0;
    ListNode point = head;
    while (point != null) { len++; point = point.next; }

    int k1 = k % len;
    if (k1 == 0) return head;
    
    point = head;
    int cnt = 0, steps = len - k1;
    while (++cnt < steps) point = point.next;
    
    new_head = point.next;
    point.next = null;

    ListNode tail = new_head;
    while(tail.next != null) tail = tail.next;
    tail.next = head;
    
    return new_head;
  }
}

