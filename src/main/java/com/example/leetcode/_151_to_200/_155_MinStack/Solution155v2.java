package com.example.leetcode._151_to_200._155_MinStack;

import java.util.Stack;

/*
 * Your runtime beats 82.77% of java submissions. <-- Only one time
 * Your runtime beats 61.97% of java submissions. <-- usually
 */

public class Solution155v2 extends MinStack
{
  Stack<Integer> stack = new Stack<Integer>();
  Stack<Integer> minStack = new Stack<Integer>();
  
  public void push(int x) 
  {
    stack.push(x);
    
    if (minStack.isEmpty())
      minStack.push(x);
    else if (x <= minStack.peek())
        minStack.push(x);
  }

  public void pop() 
  {
    if (stack.isEmpty()) return;

    int v1 = stack.pop();
    int v2 = minStack.peek();
    if (v1 == v2) minStack.pop();

    if (minStack.isEmpty()) refreshMinStack();
  }

  public int top() 
  {
    return stack.peek();
  }

  public int getMin() 
  {
    return minStack.peek();
  }
  
  private void refreshMinStack()
  {
    for (int i=0; i<stack.size(); i++)
    {
      Integer num = stack.get(i);
      if (minStack.isEmpty())
        minStack.push(num);
      else
      {
        if (num < minStack.peek()) minStack.push(num);
      }
    }
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