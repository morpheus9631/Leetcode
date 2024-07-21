package com.example.leetcode._201_to_250._234_PalindromeLinkedList;

import java.util.Arrays;

import com.example.leetcode.utils.ListNode;
import com.example.leetcode.utils.myListNodeUtils;

public class Main234
{
  public static void main(String[] args)
  {
    System.out.println("234. Palindrome Linked List");
    
    String format = "\r\nList = %s"
                  + "\r\nIs it a palindrome? %b"
                  ;

    Solution234 sol = new Solution234v3();
    
    for (int[] nums : _testCases)
    {
      ListNode head = myListNodeUtils.createList(nums);
      boolean isP = sol.isPalindrome(head);
      
      System.out.println(
          String.format(format, Arrays.toString(nums), isP));
    }
  }
  
  private static int[][] _testCases = 
  {
      { 1, 2, 2, 2, 1 }
    , { 1, 2 }            // false
    , { 1 }               // true
    , { 1, 0, 0 }         // false
    , { 1, 1, 2, 1 }      // false
    , { 0, 0 }            // true
    , {
        -16557,-8725,-29125, 28873,-21702, 15483,-28441,-17845,-4317,-10914,
        -10914,-4317,-17845,-28441, 15483,-21702, 28873,-29125,-8725,-16557
      }
  };
}
