package com.example.leetcode._151_to_200._155_MinStack;

import com.example.leetcode.utils.myStringUtils;

public class Main155
{
  public static void main(String[] args)
  {
    System.out.println("155. Min Stack");
    
    String format1 = "\r\nMinStack obj = new MinStack();";
    String format2 = "obj.push(%d);";
    String format3 = "obj.pop();";
    String format4 = "obj.top();\t--> %d";
    String format5 = "obj.getMin();\t--> %d";
    
    for (String[][] testcase : _TestCases)
    {
      String[] orders = testcase[0];
      String[] values = testcase[1];
      
      MinStack obj = new Solution155v2();
      
      for (int i=0; i<orders.length; i++)
      {
        String order = orders[i];
        
        if (order == "MinStack")
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
        else if (order == "getMin")
        {
          int val = obj.getMin();
          System.out.println(String.format(format5, val));
        }
      }
      System.out.println("\r\n"+myStringUtils.dashLine(30));
    }
    
  }

  private static String[][][] _TestCases = 
  {
    { 
      { "MinStack","push","push","push","getMin","pop","top","getMin" },
      { "", "-2", "0", "-3", "", "", "", "" }  
    },
    {
      {"MinStack","push","push","push","getMin","pop","getMin"},
      { "","0","1","0","","",""}
    },
    {
      {"MinStack","push","push","push","push","getMin","pop","getMin",
        "pop","getMin","pop","getMin"},
      {"","2","0","3","0","","","","","","",""}
    },
    {
      {"MinStack","push","push","push","push","pop","getMin","pop","getMin","pop","getMin"},
      {"","512","-1024","-1024","512","","","","","",""}      
    },
    { 
      {"MinStack","push","push","push","top","pop","getMin","pop","getMin",
       "pop","push","top","getMin","push","top","getMin","pop","getMin"},
      {"", "2147483646","2147483646","2147483647","","","","","",
       "","2147483647","","","-2147483648","","","",""}  
    }
  };
}
