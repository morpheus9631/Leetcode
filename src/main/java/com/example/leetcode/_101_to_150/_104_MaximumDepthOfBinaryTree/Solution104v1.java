package com.example.leetcode._101_to_150._104_MaximumDepthOfBinaryTree;

import java.util.LinkedList;
import java.util.List;
import com.example.leetcode.utils.TreeNode;

/*
 * Your runtime beats 1.51% of java submissions.
 */

public class Solution104v1 implements Solution104
{
  public int maxDepth(TreeNode root)
  {
    int depth = 0;
    
    if (root == null) return depth;
    
    List<TreeNode> currList = new LinkedList<TreeNode>();
    currList.add(root);
    
    while (true)
    {
      List<TreeNode> nextList = new LinkedList<TreeNode>();

      while (!currList.isEmpty())
      {
        TreeNode node = currList.remove(0);
        if (node != null)
        {
          nextList.add(node.left);
          nextList.add(node.right);
        }
      }
      if (nextList.isEmpty())
        break;
      else
        currList.addAll(nextList);

      depth++;
    }
    
    return depth;
  }
}
