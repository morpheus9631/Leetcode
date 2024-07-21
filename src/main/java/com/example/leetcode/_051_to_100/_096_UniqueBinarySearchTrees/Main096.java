package com.example.leetcode._051_to_100._096_UniqueBinarySearchTrees;

public class Main096
{
  public static void main(String[] args)
  {
    System.out.println("96. Unique Binary Search Trees");

    String format = "\r\nN = %d"
                  + "\r\nTotal of %d unique BST's";
    
    Solution096 sol = new Solution096v1();

    int n = 3;
    int k = sol.numTrees(n);
    System.out.println(String.format(format, n, k));
  }

}
