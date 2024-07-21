package com.example.leetcode._251_to_300._295_FindMedianFromDataStream;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder 
{
  PriorityQueue<Integer> maxHeap;  //lower half
  PriorityQueue<Integer> minHeap;  //higher half

  /** initialize your data structure here. */
  public MedianFinder()
  {
    maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
    minHeap = new PriorityQueue<Integer>();
  }

  // Adds a number into the data structure.
  public void addNum(int num) 
  {
    if (maxHeap.size() == 0) {
      maxHeap.add(num);
    } 
    else
    {
      if (maxHeap.size() == minHeap.size()) 
      {
        if (num <= minHeap.peek()) {
          maxHeap.add(num);
        } 
        else // we always have maxHeap.size() >= minHeap.size() 
        { 
          maxHeap.add(minHeap.remove());
          minHeap.add(num);
        }
      }
      else // maxheap.size() == minHeap.size() + 1 
      { 
        if (num >= maxHeap.peek()) {
          minHeap.add(num);
        } 
        else // num < maxHeap.peek() 
        { 
          minHeap.add(maxHeap.remove());
          maxHeap.add(num);
        }
      }
    }    
  }

  // Returns the median of current data stream
  public double findMedian() 
  {
    if (minHeap.size() == maxHeap.size()) 
    {
      double low = (double) maxHeap.peek();
      double high = (double) minHeap.peek();
      return (low + high) / 2.0;
    } else {
      return (double) maxHeap.peek();
    }  
  }
}

//Your MedianFinder object will be instantiated and called as such:
//MedianFinder mf = new MedianFinder();
//mf.addNum(1);
//mf.findMedian();