package com.example.leetcode._201_to_250._225_ImplementStackUsingQueues;

abstract public class MyStack
{
  /** Initialize your data structure here. */
  public MyStack() { } 
  
  /** Push element x onto stack. */
  abstract public void push(int x);
  
  /** Removes the element on top of the stack and returns that element. */
  abstract public int pop();
  
  /** Get the top element. */
  abstract public int top();
  
  /** Returns whether the stack is empty. */
  abstract public boolean empty();
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
*/