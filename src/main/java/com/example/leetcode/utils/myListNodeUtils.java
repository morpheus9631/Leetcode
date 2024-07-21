package com.example.leetcode.utils;

public class myListNodeUtils
{
  public static ListNode createList(final int[] nums)
  {
    ListNode head = null;
    
    if (nums == null || nums.length == 0) return null;
    
    ListNode ptr = null;
    for(int num : nums)
    {
      if (head == null)
      {
        head = new ListNode(num);
        ptr = head;
        continue;
      }
      
      ptr.next = new ListNode(num);
      ptr = ptr.next;
    }
    return head;
  }
  
  // ---------------------------------------------------------------------------
  private static String toString(final ListNode head, boolean hasNullNode)
  {
    if (head == null) {
      return (hasNullNode) ? "NULL" : ""; 
    }
      
    StringBuffer sb = new StringBuffer();
    String connectMark = "->";
    
    ListNode ptr = head; 
    while (ptr != null) 
    {
      sb.append(String.valueOf(ptr.val));
      if (ptr.next != null) sb.append(connectMark);
      ptr = ptr.next;
    }
    if (hasNullNode) sb.append("->NULL");
    
    return sb.toString();
  }

  public static String toStringWithNull(final ListNode head)
  {
    if (head == null) return null;
    return toString(head, true);
  }

  public static String toString(final ListNode head)
  {
    if (head == null) return null;
    return toString(head, false);
  }
  
  
  
}
