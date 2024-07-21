package com.example.leetcode._401_to_450._429_NaryTreeLevelOrderTraversal;

import java.util.List;

public class Main0429 {

  public static void main(String[] args)
  {
    int num = 429;
    String title = "N-ary Tree Level Order Traversal";
    String format = "%d. %s\r\n";
    System.out.println(String.format(format, num, title));
    
    int[][][] train_data = TestData.TrainData;
    Node root = TreeUtil.createTree(train_data);
    String str = NodeUtil.toString(root);
    System.out.println(str);
    
    Solution0429 sol = new Solution0429v1();
    List<List<Integer>> result = sol.levelOrder(root);
    
    format = "\r\nResult: %s";
    System.out.println(String.format(format, result));
    
  }

}
