package com.example.leetcode._151_to_200._160_IntersectionOfTwoLinkedLists;

import com.example.leetcode.utils.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution160v1 implements Solution160 
{
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
  {
     if (headA == null || headB == null) return null;

     int lenA = 0;
     ListNode tmpNodeA = headA;
     while (tmpNodeA != null) {
       lenA++;
       tmpNodeA = tmpNodeA.next;
     }
     
     int lenB = 0;
     ListNode tmpNodeB = headB;
     while (tmpNodeB != null) {
       lenB++;
       tmpNodeB = tmpNodeB.next;
     }
     
     // 將較長的 linkedlist 移到 headA
     if (lenB > lenA)
     {
       ListNode tmpNode = headA; headA = headB; headB = tmpNode;
       int tmp = lenA; lenA = lenB; lenB = tmp;
     }
     
     // headA 先移動兩條 linkedlist 中較長的部分
     int len = lenA - lenB;
     while (len-- > 0) headA = headA.next;
     
     while (headA != null)
     {
       if (headA.val == headB.val) break;
       headA = headA.next;
       headB = headB.next;
     }
     return headA;
  }
}