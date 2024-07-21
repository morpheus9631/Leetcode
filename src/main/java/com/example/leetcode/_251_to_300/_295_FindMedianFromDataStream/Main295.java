package com.example.leetcode._251_to_300._295_FindMedianFromDataStream;

public class Main295
{
  public static void main(String[] args)
  {
    System.out.println("295. Find Median from Data Stream");
    
    String format = "\r\nadd(%d)\r\nfindMedian() -> %5.1f";
    
    double mid = -1;
    MedianFinder mf = new MedianFinder();

    for (int num : _testCases)
    {
      mf.addNum(num);
      mid = mf.findMedian(); 
      
      System.out.println(String.format(format, num, mid));
    }
  }
  
  private static int[] _testCases = 
  {
    6, 10, 2, 6, 5, 0, 6, 3, 1, 0, 0 
  };
}
