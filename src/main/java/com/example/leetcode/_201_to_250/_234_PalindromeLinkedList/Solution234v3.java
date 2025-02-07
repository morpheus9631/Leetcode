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


public class Solution234v3 implements Solution234
{
  public boolean isPalindrome(ListNode head) 
  {
    if (head == null) return true;
    
    ListNode middle = findMiddle(head);
    middle.next = reverse(middle.next);
    
    ListNode p1 = head, p2 = middle.next;
    while (p1 != null && p2 != null && p1.val == p2.val) 
    {
      p1 = p1.next;
      p2 = p2.next;
    }
    return p2 == null;
  }

  private ListNode findMiddle(ListNode head) 
  {
    if (head == null) return null;

    ListNode slow = head, fast = head.next;
    while (fast != null && fast.next != null) 
    {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  private ListNode reverse(ListNode head) 
  {
    ListNode prev = null;
    
    while (head != null) 
    {
      ListNode temp = head.next;
      head.next = prev;
      prev = head;
      head = temp;
    }
    return prev;
  } 
}