package com.example.leetcode._051_to_100._069_Sqrt_of_x;

import java.util.LinkedList;
import java.util.List;

public class Main069
{
  public static void main(String[] args)
  {
    int[][] vals = new int[][] {
      { 4, 2 },
      { 8, 2 }, 
      { 2147395599, 46339 }       
    };

    System.out.println("69. Sqrt(x)");
    
    Solution069 sol = new Solution069v2();
    
    TestList069 list = new TestList069(vals);
    for (TestCase069 tc : list.get())
    {
      int x = tc.getInput();
      int res = sol.mySqrt(x);
        
      String format = "Input: %d\r\nOutput: %d\r\n";
      String outstr = String.format(format, x, res);
      System.out.println(outstr);
    }
  }
}

class TestCase069 
{
  private int _In;
  private int _Out;
  
  public TestCase069(int in, int out) {
    this._In = in; this._Out = out;
  }
  
  public int getInput()  { return this._In; }
  public int getOutput() { return this._Out; }
}

class TestList069
{
  private List<TestCase069> _list = new LinkedList<TestCase069>();
  
  public TestList069(int[][] cases)
  {
    for (int[] vals : cases)
    {
      int v1 = vals[0];
      int v2 = vals[1];
      this._list.add(new TestCase069(v1, v2));
    }
  }
  
  public List<TestCase069> get() { return this._list; }
}
