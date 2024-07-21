package com.example.leetcode._101_to_150._141_LinkedListCycle;

import java.util.Arrays;

import com.example.leetcode.utils.ListNode;
import com.example.leetcode.utils.myListUtils;
import com.example.leetcode.utils.myStringUtils;

public class Main141
{
  public static void main(String[] args)
  {
    System.out.println("141. Linked List Cycle");
    
    String format = "\r\nS = %s"
                  + "\r\nand is a %scycle list."
                  + "\r\n\r\nReturn:"
                  + "\r\nIt is a cycle list? %b"
                  + "\r\n\r\n" + myStringUtils.dashLine();
    
    Solution141 sol = new Solution141v2();
    
    for (int[][] testcase : _testCases)
    {
      int[] nums = testcase[0];
      
      boolean isCycle = (testcase[1][0] > 0);
      String cycleStr = isCycle ?  "" : "non-";
      
      ListNode head = createList(nums, isCycle);
      
      boolean res = sol.hasCycle(head);
      System.out.println(
          String.format(format, Arrays.toString(nums), cycleStr, res));
    }
  }

  private static int[][][] _testCases = 
  {
      { { 3, 2, 0, -4 }, {0} }  // 1 is cycle list, 0 is non-cycle list 
    , { { 3, 2, 0, -4 }, {1} }
    , { { 1, 2 }, { 0 } }    
  };
  
  private static ListNode createList(int[] nums, boolean isCycle)
  {
    ListNode head = myListUtils.toList(nums);
    
    if (isCycle)
    {
      ListNode ptr = head;
      while (ptr.next != null) ptr = ptr.next;
      ptr.next = head;
    }
    
    return head;
  }
}
