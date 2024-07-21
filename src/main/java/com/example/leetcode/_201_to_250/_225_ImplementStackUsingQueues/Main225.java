package com.example.leetcode._201_to_250._225_ImplementStackUsingQueues;

import com.example.leetcode.utils.myStringUtils;

public class Main225
{
  public static void main(String[] args)
  {
    System.out.println("225. Implement Stack using Queues");
    
    String format1 = "\r\nMyStack obj = new MyStack();";
    String format2 = "obj.push(%d);";
    String format3 = "obj.pop();\t--> %d";
    String format4 = "obj.top();\t--> %d";
    String format5 = "obj.empty();\t--> %b";
    
    for (String[][] testcase : _TestCases)
    {
      String[] orders = testcase[0];
      String[] values = testcase[1];
      
      MyStack obj = new Solution225v1();
      
      for (int i=0; i<orders.length; i++)
      {
        String order = orders[i];
        
        if (order == "MyStack")
        {  
          System.out.println(String.format(format1));
        }  
        else if (order == "push")
        {
          int val = Integer.parseInt(values[i]); 
          obj.push(val);
          System.out.println(String.format(format2, val));
        }
        else if (order == "pop")
        {
          obj.pop();
          System.out.println(String.format(format3));
        }
        else if (order == "top")
        {
          int val = obj.top();
          System.out.println(String.format(format4, val));
        }
        else if (order == "empty")
        {
          boolean isEmpty = obj.empty();
          System.out.println(String.format(format5, isEmpty));
        }
      }
      System.out.println("\r\n"+myStringUtils.dashLine(30));
    }
    
  }

  private static String[][][] _TestCases = 
  {
    { // [null,null,null,2]
      { "MyStack","push","push","top" },
      { "", "1", "2", "" }  
    }
  };
}
