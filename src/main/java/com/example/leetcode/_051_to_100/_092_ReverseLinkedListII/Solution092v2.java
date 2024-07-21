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

public class Solution092v2  implements Solution092
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
        if (b1 != null) b1.next = null;
        b2 = ptr;
        b3 = ptr;
      }
      else if (cnt > m && cnt < n)
      {
        if (b3 != pre) 
        {
          pre.next = b3;
          b3 = pre;
        }
      }
      else if (cnt == n)
      {
        b4 = ptr.next;
        pre.next = b3;
        ptr.next = pre;
        b3 = ptr;
        break;
      } 
      pre = ptr;
      ptr = ptr.next;
      cnt++;
    }
    
    String s1 = (b1 == null) ? "null" : String.valueOf(b1.val);
    String s2 = (b2 == null) ? "null" : String.valueOf(b2.val);
    String s3 = (b3 == null) ? "null" : String.valueOf(b3.val);
    String s4 = (b4 == null) ? "null" : String.valueOf(b4.val);
    System.out.println("breaks: "+s1+", "+s2+", "+s3+", "+s4);
    
    ListNode new_head = null;
    if (b1 != null)
    {
      b1.next = b3;
      new_head = head;
    }
    else {
      new_head = b3;
    }  
    b2.next = b4;
    
    return new_head;
  }
}