package com.example.leetcode._151_to_200._155_MinStack;

import java.util.ArrayList;
import java.util.List;

/*
 * Your runtime beats 12.32% of java submissions.
 */

public class Solution155v1 extends MinStack
{
  List<Integer> _Stack = new ArrayList<Integer>();;
  int _MinVal = Integer.MAX_VALUE;
  
  /** initialize your data structure here. */

  public void push(int x) 
  {
    if (this._Stack.isEmpty())
      this._MinVal = x;
    else
      if (x < _MinVal) _MinVal = x; 
  
    this._Stack.add(0, x);
  }

  public void pop() 
  {
    int val = this._Stack.remove(0);
    
    if (!this._Stack.isEmpty() && val == _MinVal)
    {
      _MinVal = this._Stack.get(0);
      for (int i=1; i<this._Stack.size(); i++) {
        if (this._Stack.get(i) < _MinVal) _MinVal = this._Stack.get(i);
      }  
    }
  }

  public int top() 
  {
    return this._Stack.get(0);
  }

  public int getMin() 
  {
    return this._MinVal;
  }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */