package com.example.leetcode._151_to_200._155_MinStack;

abstract public class MinStack
{
  /** initialize your data structure here. */
  public MinStack() {}
  
  abstract public void push(int x); 
  abstract public void pop(); 
  abstract public int top(); 
  abstract public int getMin(); 
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */