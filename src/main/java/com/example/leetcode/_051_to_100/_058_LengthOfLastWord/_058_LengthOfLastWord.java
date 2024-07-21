package com.example.leetcode._051_to_100._058_LengthOfLastWord;

import java.util.ArrayList;
import java.util.List;

public class _058_LengthOfLastWord
{
	public static void main(String[] args)
	{
	  TestCase058 tc = new TestCase058();
	  Solution058 sol = new Solution058v3();

    String format1 = "\r\nInput: '%s'";
    String format2 = "Output: %d";
	  
	  for (TestVal058 tv : tc.get())
	  {
	  	String s = tv.str;
      System.out.println(String.format(format1, s));
	  	
	  	int res = sol.lengthOfLastWord(s);
      System.out.println(String.format(format2, res));
	  }
	}
}

class TestVal058
{
	public String str;
	
	public TestVal058(String str) {
		this.str = str;
	}
}

class TestCase058
{
  public List<TestVal058> get()
  {
  	List<TestVal058> list = new ArrayList<TestVal058>();
  	
  	TestVal058 ts;
  	ts = new TestVal058("Hello World"); list.add(ts); // 5
  	ts = new TestVal058("a"); list.add(ts);						// 1
  	ts = new TestVal058(""); list.add(ts);						// 0
  	
  	return list;
  }
}  

