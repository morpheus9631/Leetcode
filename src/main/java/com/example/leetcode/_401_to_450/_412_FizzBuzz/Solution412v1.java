package com.example.leetcode._401_to_450._412_FizzBuzz;

import java.util.ArrayList;
import java.util.List;

/*
 * Your runtime beats 83.23 % of java submissions.
 */

public class Solution412v1 implements Solution412
{
  public List<String> fizzBuzz(int n) 
  {
    List<String> list = new ArrayList<String>();
   
    for (int i=1; i<=n; i++)
    {
      if (i % 15 == 0)
        list.add("FizzBuzz");
      else if (i % 5 == 0)
        list.add("Buzz");
      else if (i % 3 == 0)
        list.add("Fizz");
      else
        list.add(Integer.toString(i));
    }
    
    return list;
  }
}
