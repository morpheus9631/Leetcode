package com.example.leetcode._001_to_050._038_CountAndSay;

import java.util.ArrayList;
import java.util.List;

public class _038_CountAndSay
{
	public static void main(String[] args)
	{
	  TestCase038 tc = new TestCase038();
	  Solution038 sol = new Solution038v3();

    String format1 = "\r\nInput: %d";
    String format2 = "Output: %s";
	  
	  for (TestVal038 tv : tc.get())
	  {
	  	int n = tv.val;
      System.out.println(String.format(format1, n));
	  	
	  	String res = sol.countAndSay(n);
      System.out.println(String.format(format2, res));
	  }
	}
}

class TestVal038
{
	public int val;
	
	public TestVal038(int val) {
		this.val = val;
	}
}

class TestCase038
{
  public List<TestVal038> get()
  {
  	List<TestVal038> list = new ArrayList<TestVal038>();
  	
  	TestVal038 ts;
  	ts = new TestVal038(1); list.add(ts);
  	ts = new TestVal038(2); list.add(ts);
  	ts = new TestVal038(3); list.add(ts);
  	ts = new TestVal038(4); list.add(ts);
  	ts = new TestVal038(5); list.add(ts);
  	ts = new TestVal038(10); list.add(ts);
  	
  	return list;
  }
}  
