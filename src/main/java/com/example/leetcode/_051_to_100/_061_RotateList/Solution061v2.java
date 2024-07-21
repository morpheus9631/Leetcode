package com.example.leetcode._051_to_100._061_RotateList;

import com.example.leetcode.utils.ListNode;

public class Solution061v2 implements Solution061
{
  public ListNode rotateRight(ListNode head, int k) 
  {
    if (head == null || head.next == null) return head;

    ListNode point = head;
    int len = 1;
    while (point.next != null) { len++; point = point.next; }
    
    k %= len; 
    if (k == 0) return head;
    
    point.next = head;
    int i = 0, steps = len - k;
    while(i++ < steps) point = point.next;
    head = point.next;
    point.next = null;
    
    return head; 
  }
}
