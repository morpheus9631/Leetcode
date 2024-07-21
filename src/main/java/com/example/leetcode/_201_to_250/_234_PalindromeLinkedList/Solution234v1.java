package com.example.leetcode._201_to_250._234_PalindromeLinkedList;


import java.util.ArrayList;
import java.util.List;

import com.example.leetcode.utils.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


public class Solution234v1 implements Solution234
{
  public boolean isPalindrome(ListNode head) 
  {
    if (head == null) return true;

    List<Integer> list = new ArrayList<Integer>();
    
    ListNode ptr = head;
    while (ptr != null)
    {
      list.add(ptr.val);
      ptr = ptr.next;
    }
    System.out.println(list.toString());
    
    int left = 0, right = list.size()-1;
    while (left < right)
    {
      int v1 = list.get(left);
      int v2 = list.get(right);
      if (v1 != v2) return false;
      left++;
      right--;
    }
    
    return true;
  }
}