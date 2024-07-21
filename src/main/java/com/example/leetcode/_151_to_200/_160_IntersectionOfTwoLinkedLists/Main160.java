package com.example.leetcode._151_to_200._160_IntersectionOfTwoLinkedLists;

import com.example.leetcode.utils.ListNode;
import com.example.leetcode.utils.myListNodeUtils;
import com.example.leetcode.utils.myStringUtils;

public class Main160
{
  
  public static void main(String[] args)
  {
    System.out.println("160. Intersection of Two Linked Lists");
    
    String format = "\r\nList A: %s"
                  + "\r\nList B: %s"
                  + "\r\nThe intersection is %s"
                  + "\r\n\r\n" + myStringUtils.dashLine();
    
    Solution160 sol = new Solution160v1();
    
    for (int[][] testcase : _testCases)
    {
      ListNode headA = myListNodeUtils.createList(testcase[0]);
      ListNode headB = myListNodeUtils.createList(testcase[1]);
      ListNode headC = sol.getIntersectionNode(headA, headB);

      String aStr = myListNodeUtils.toString(headA);
      String bStr = myListNodeUtils.toString(headB);
      String cStr = "null";
      if (headC != null) cStr = Integer.toString(headC.val);
      
      System.out.println(String.format(format, aStr, bStr, cStr));
    }
  }
  
  private static int[][][] _testCases = 
  {
    { {11,12,31,32,33}, {21,22,23,31,32,33} },
    { {1,3,5,7,9,11,13,15,17,19,21}, {} }
  };
  

//  public static ListNode createLinkedList(int[] nums, ListNode cHead)
//  {
//    ListNode headNode = createLinkedList(nums);
//
//    ListNode currNode = headNode; 
//    while (currNode.next != null) currNode = currNode.next;
//    currNode.next = cHead;
//    
//    return headNode;
//  }
//
//  public static ListNode createLinkedList(int[] nums)
//  {
//    ListNode root = null;
//    
//    ListNode preNode = null;
//    for (int i=0; i<nums.length; i++)
//    {
//      ListNode currNode = new ListNode(nums[i]);
//      
//      if (root == null) 
//      {
//        root = currNode;
//        preNode = currNode;
//        continue;
//      }
//      
//      preNode.next = currNode;
//      preNode = currNode;
//    }
//    return root;
//  }
  
}
