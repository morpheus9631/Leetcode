package com.example.leetcode._201_to_250._232_ImplementQueueusingStacks;

import java.util.Stack;

public class MyQueue 
{
  Stack<Integer> stack = new Stack<Integer>();
  
  /** Initialize your data structure here. */
  public MyQueue() {}

  /** Push element x to the back of queue. */
  public void push(int x) 
  {
   stack.push(x);   
  }

  /** Removes the element from in front of queue and returns that element. */
  public int pop() 
  {
    return stack.remove(0);
  }

  /** Get the front element. */
  public int peek() 
  {
    return stack.elementAt(0);
  }

  /** Returns whether the queue is empty. */
  public boolean empty() 
  {
    return stack.isEmpty();
  }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */