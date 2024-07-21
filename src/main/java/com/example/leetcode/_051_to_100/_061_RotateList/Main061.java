package com.example.leetcode._051_to_100._061_RotateList;

import com.example.leetcode.utils.ListNode;
import com.example.leetcode.utils.myListNodeUtils;
import com.example.leetcode.utils.myStringUtils;

public class Main061
{
  public static void main(String[] args)
  {
    System.out.println("61. Rotate List");
    
    String format = "\r\nGiven %s"
                  + "\r\n  and k = %d"
                  + "\r\n\r\nReturn %s"
                  + "\r\n\r\n" + myStringUtils.dashLine();
    
    Solution061 sol = new Solution061v2();
    
    for (int[][] test_case : _testCases)
    {
      int[] nums = test_case[0];
      int k = test_case[1][0];
      
      ListNode head = myListNodeUtils.createList(nums);
      String srcStr = myListNodeUtils.toString(head);
      
      ListNode new_head = sol.rotateRight(head, k);
      String newStr = myListNodeUtils.toString(new_head);
      
      System.out.println(String.format(format, srcStr, k, newStr));
    }
  }
  
  private static int[][][] _testCases = 
  {
    { {1,2,3,4,5}, {2} },
    { {}, {0} },
    { {1}, {1} },
    { {1}, {99} },
    { {1,2}, {3} }
  };
}
