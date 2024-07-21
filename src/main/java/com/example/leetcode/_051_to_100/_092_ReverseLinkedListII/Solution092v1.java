package com.example.leetcode._051_to_100._092_ReverseLinkedListII;

import com.example.leetcode.utils.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution092v1 implements Solution092
{
  public ListNode reverseBetween(ListNode head, int m, int n) 
  {
    if (m == n) return head; 
    
    int cnt = 1;
    ListNode ptr = head;
    ListNode pre = null;
   
    ListNode b1 = null;
    ListNode b2 = null;
    ListNode b3 = null;
    ListNode b4 = null;
    
    while (ptr != null)
    {
      if (cnt == m)
      {
        b1 = pre;
        b2 = ptr;
      }
      else if (cnt == n)
      {
        b3 = ptr;
        b4 = ptr.next;
        break;
      }

      pre = ptr;
      ptr = ptr.next;
      cnt++;
    }
    
    if (b1 != null) b1.next = null;
    b3.next = null;
    ListNode revHead = reverseList(b2);
    
    ListNode new_head = null;
    if (b1 != null)
    {
      b1.next = revHead;
      new_head = head;
    }
    else
      new_head = revHead;
    b2.next = b4;
    
    return new_head;
  }
  
  private ListNode reverseList(ListNode ptr)
  {
    ListNode pre = null;
    while (ptr != null)
    {
      ListNode tmp = ptr.next;
      ptr.next = pre;
      pre = ptr;
      ptr = tmp;
    }
    return pre;
  }
}