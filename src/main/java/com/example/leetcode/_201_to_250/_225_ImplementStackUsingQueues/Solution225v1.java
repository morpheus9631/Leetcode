package com.example.leetcode._201_to_250._225_ImplementStackUsingQueues;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Your runtime beats 58.67% of java submissions.
 */

public class Solution225v1 extends MyStack
{
  Queue<Integer> queue = new LinkedList<Integer>();

  public void push(int x)
  {
    this.queue.offer(new Integer(x));
  }
  
  public int pop()
  {
    Queue<Integer> tmpQ = new LinkedList<Integer>();
    
    while (this.queue.size() > 1) {
      tmpQ.offer(this.queue.poll());
    }
    
    Integer val = this.queue.poll();
    this.queue = tmpQ;
    return val;
  }
  
  public int top()
  {
    Queue<Integer> tmpQ = new LinkedList<Integer>();
    
    while (this.queue.size() > 1) {
      tmpQ.offer(this.queue.poll());
    }
    
    Integer val = this.queue.poll();
    tmpQ.offer(val);
    this.queue = tmpQ;
    return val;
  }
  
  public boolean empty()
  {
    return this.queue.isEmpty();
  }
  
}
