package com.example.leetcode.utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class myTreeUtils
{
  public static enum TraversalType 
  { 
    PreOrder, InOrder, PostOrder, LevelOrder 
  };

  // ---------------------------------------------------------------------------
  public static TreeNode createBinaryTree(final Integer[] nums)
  {
    if (nums == null || nums.length == 0) return null;

    int i = 0;
    if (nums[i] == null) return null;
    TreeNode root = new TreeNode(nums[i]);

    List<TreeNode> openList = new LinkedList<TreeNode>();
    openList.add(root);

    while (++i < nums.length)
    {
      TreeNode parent = openList.get(0);
      if (i%2 == 0) openList.remove(parent);

      Integer val = nums[i]; 
      if (val == null) continue;
      TreeNode new_node = new TreeNode(val.intValue());
      
      if (i%2 == 0) {
        parent.right = new_node;
      }
      else {
        parent.left = new_node;
      }  
      openList.add(new_node);
    }
    return root;
  }
  
  // --------------------------------------------------------------------------
  /*
   * PreOrder: Recursive
   * 
   *   The order is: parent -> left child -> right child
   */
  public static void preorderTraversal(TreeNode node, List<Integer> vals)
  {
    if (node == null) return;
    
    vals.add(node.val);
    preorderTraversal(node.left, vals);
    preorderTraversal(node.right, vals);
  }

  /*
   * PreOrder: Iterative
   */
  public static List<Integer> preorderTraversal(TreeNode root)
  {
    List<Integer> res = new ArrayList<Integer>();
    
    if (root == null) return res;
    
    List<TreeNode> list = new ArrayList<TreeNode>();
    list.add(root);
    
    while (!list.isEmpty())
    {
      TreeNode curNode = list.remove(0);
      res.add(curNode.val);
      
      if (curNode.right != null) list.add(0, curNode.right);
      if (curNode.left != null) list.add(0, curNode.left);
    }
    
    return res;
  }
  
  // ---------------------------------------------------------------------------
  /*
   * InOrder: Recursive
   * 
   *   The order is: left child -> parent -> right child
   *    
   */
  public static void inorderTraversal(TreeNode root, List<Integer> list)
  {
    if (root == null) return;
    
    inorderTraversal(root.left, list);
    list.add(Integer.valueOf(root.val));
    inorderTraversal(root.right, list);
  }
  
  /*
   *  InOrder:  Iterative
   */
  public static List<Integer> inorderTraversal(TreeNode root)
  {
    if (root == null) return null;
    
    List<Integer> valList = new ArrayList<Integer>();
    Stack<TreeNode> stack = new Stack<TreeNode>();
    
    TreeNode ptr = root;
    while (!stack.isEmpty() || ptr != null)
    {
      if (ptr != null) 
      {
        stack.push(ptr);
        ptr = ptr.left;
      }
      else
      {
        TreeNode t = stack.pop();
        valList.add(t.val);
        ptr = t.right;
      }
    }

    return valList;    
  }

  // --------------------------------------------------------------------------
  /*
   * PostOrder: Recursive
   * 
   *   The order is: left child -> right child -> parent
   *    
   */
  public static void postorderTraversal(TreeNode node, List<Integer> vals)
  {
    if (node == null) return;
    
    postorderTraversal(node.left, vals);
    postorderTraversal(node.right, vals);
    vals.add(node.val);
  }

  
  /*
   * PostOrder: Iterative
   */
  public static List<Integer> postorderTraversal(TreeNode root)
  {
    List<Integer> res = new ArrayList<Integer>();
    
    if (root == null) return res;
    
    Stack<TreeNode> stack = new Stack<TreeNode>();
    stack.push(root);

    while (!stack.isEmpty())
    {
      TreeNode curNode = stack.pop();
      res.add(0, curNode.val);

      if (curNode.left != null) stack.push(curNode.left);
      if (curNode.right != null) stack.push(curNode.right);
    }
    
    return res;
  }

  // --------------------------------------------------------------------------
  /*
   * LevelOrder: Iterative
   * 
   *   The order is: Breath-first Search
   */
  public static List<Integer> levelorderTraversal(TreeNode root)
  {
    List<Integer> res = new ArrayList<Integer>();
    
    if (root == null) return res;
    
    List<TreeNode> currList = new ArrayList<TreeNode>();
    currList.add(root);

    while (!currList.isEmpty())
    {
      List<TreeNode> nextList = new ArrayList<TreeNode>();
      
      int numNulls = 0;
      while (!currList.isEmpty())
      {
        TreeNode node = currList.remove(0);
        
        if (node != null)
        {  
          res.add(node.val);
          
          nextList.add(node.left);
          if (node.left == null) numNulls++;
          
          nextList.add(node.right);
          if (node.right == null) numNulls++;
        }  
        else
          res.add((Integer)null);
      }

      if (numNulls == nextList.size()) 
        break;
      else
        currList.addAll(nextList);
    }

    return res;
  }

  //----------------------------------------------------------------------------
  public static String toString(TreeNode root)
  {
    return toString(root, TraversalType.LevelOrder);
  }

  public static String toString(TreeNode root, TraversalType type)
  {
    if (root == null) return "null";
      
    List<Integer> list = null;
    switch (type)
    {
      case PreOrder:
        list = preorderTraversal(root);
        break;
      case InOrder:
        list = inorderTraversal(root);
        break;
      case PostOrder:
        list = postorderTraversal(root);
        break;
      case LevelOrder:
      default:
        list = levelorderTraversal(root);
    }
    return list.toString();
  }
  
  // ---------------------------------------------------------------------------
  public static TreeNode searchNode(TreeNode root, Integer val)
  {
    if (root != null)
    {
      if (root.val == val)
        return root;
      else
      {
        TreeNode found_node = searchNode(root.left, val);
        if (found_node == null)
          found_node = searchNode(root.right, val);
        return found_node;
      }
    }
    else
      return null;
  }
  
}
