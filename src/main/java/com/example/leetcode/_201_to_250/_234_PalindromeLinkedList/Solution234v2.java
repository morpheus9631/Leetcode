package com.example.leetcode._201_to_250._234_PalindromeLinkedList;

import com.example.leetcode.utils.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


public class Solution234v2 implements Solution234
{
  public boolean isPalindrome(ListNode head) 
  {
    if (head == null) return true;

    ListNode ptr = head;
    ListNode pptr = new ListNode(head.val);
    
    int cnt = 1;
    while (ptr.next != null)
    {
      ptr = ptr.next;
      ListNode tmp = new ListNode(ptr.val);
      tmp.next = pptr;
      pptr = tmp;
      cnt++;
    }

    ListNode p1 = head;
    ListNode p2 = pptr;
    
    int i = 0; 
    while (i++ <= cnt/2 && p1 != null && p2 != null)
    {
      if (p1.val != p2.val) return false;
      p1 = p1.next;
      p2 = p2.next;
    }
    return true;
  }
}