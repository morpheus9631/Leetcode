package com.example.leetcode._101_to_150._120_Triangle;

import java.util.ArrayList;
import java.util.List;


public class Solution120v1 implements Solution120
{
  public int minimumTotal(List<List<Integer>> triangle) 
  {
    int minSum = Integer.MAX_VALUE;

    if (triangle == null) 
      throw new IllegalArgumentException("Illegal triangle");
   
    int rows = triangle.size();
    if (rows == 0) return 0;

    int num00 = triangle.get(0).get(0);
    if (rows == 1) return num00;
   
    int num10 = triangle.get(1).get(0);
    int num11 = triangle.get(1).get(1);
    if (rows == 2) return num00 + ((num10 < num11) ? num10 : num11); 
   
    List<Integer> openList = new ArrayList<Integer>();
    openList.add(num00 + num10);
    openList.add(num00 + num11);
   
    for (int i=2; i<rows; i++)
    {
      List<Integer> closeList = new ArrayList<Integer>();

      System.out.println("O1: "+openList.toString());
     
      for (int j=0; j<openList.size(); j++)
      {
        closeList.add(openList.get(j) + triangle.get(i).get(j));
        closeList.add(openList.get(j) + triangle.get(i).get(j+1));
      }
      System.out.println("C2: "+closeList.toString());

      /*
       * 將 closeList 的值寫回 openList.
       * 假設第 k 列有 k 個元素，第 k+1 列有 k+1 元素
       * 在第 k 列中的第 j 個元素會和第 k+1 列的 j 和 j+1 元素計算和, 因此在計算後會產生 2^k 個元素。
       * 然而， 2^k 個元素 > k+1 個, 所以會造成三角矩陣無法維持, 所以需要減少元素個數, 以利後續計算.
       * 
       * 減少的方法為：
       *   除了第一個和最後一個元素外, 每兩個元素一組，保留其中一個, 這樣就可以將元素個數從 2^k 個減少為 k+1。
       *   因為要求最小值，所以保留較小的那一個.
       */
      openList.clear();
      openList.add(closeList.get(0));
      for (int j=1; j<closeList.size()-1; j+=2)
      {
        int num1 = closeList.get(j);
        int num2 = closeList.get(j+1);
        if (num1 < num2)
          openList.add(num1);
        else
          openList.add(num2);
      }
      openList.add(closeList.get(closeList.size()-1));
      System.out.println("O2: "+openList.toString());
    }
    for (int sum : openList) if (sum < minSum) minSum = sum;
    return minSum;
  }
}
