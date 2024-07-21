package com.example.leetcode._201_to_250._206_ReverseLinkedList;

import java.util.Stack;

import com.example.leetcode.utils.ListNode;

/*
 * Your runtime beats 2.24% of java submissions. 
 */

public class Solution206v1 implements Solution206
{
  public ListNode reverseList(ListNode head)
  {
    if (head == null ||head.next == null) return head;
    
    Stack<ListNode> stack = new Stack<ListNode>();
    
    ListNode ptr = null;
    while(head != null)
    {
      ptr = head;
      head = head.next;
      ptr.next = null;
      stack.push(ptr);
    }
    
    while (!stack.isEmpty())
    {
      ListNode last_node = stack.pop();
      if (head == null)
        head = last_node;
      else 
        ptr.next = last_node;
      ptr = last_node;
    }
    
    return head;
  }
}
