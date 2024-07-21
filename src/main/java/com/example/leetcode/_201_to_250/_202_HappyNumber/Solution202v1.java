package com.example.leetcode._201_to_250._202_HappyNumber;

import java.util.LinkedList;
import java.util.List;

/*
 * Your runtime beats 60.45% of java submissions.
 */

public class Solution202v1 implements Solution202
{
  public boolean isHappy(int n) 
  {
    List<Integer> list = new LinkedList<Integer>();
    list.add(new Integer(n));
    
    int num1 = n;
    
    while (true)
    {
      int num2 = 0;
      while (num1 > 0)
      {
        num2 += Math.pow(num1%10, 2.0);
        num1 /= 10;
      }
      System.out.println(num1+", "+num2);
      
      if (num2 == 1) break;
      
      if (list.contains(new Integer(num2))) return false;
      list.add(new Integer(num2));
      
      num1 = num2;
    }
    return true;
  }
}
