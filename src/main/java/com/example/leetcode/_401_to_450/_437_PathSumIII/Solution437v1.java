package com.example.leetcode._401_to_450._437_PathSumIII;

import com.example.leetcode.utils.TreeNode;

/*
 * Your runtime beats 62.37 % of java submissions.
 */

public class Solution437v1 implements Solution437
{
  public int pathSum(TreeNode root, int sum)
  {
    if (root == null) return 0;
    return dfs(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
  }

  private int dfs(TreeNode root, int sum)
  {
    int res = 0;
    if (root == null) return res;
    if(sum == root.val) res++;
  
    res += dfs(root.left,  sum-root.val);
    res += dfs(root.right, sum-root.val);
    
    return res;
  }  
}
