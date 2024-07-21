package com.example.leetcode._051_to_100._098_ValidateBinarySearchTree;

import java.util.List;

import com.example.leetcode.utils.TreeNode;
import com.example.leetcode.utils.myTreeUtils;

public class Main098
{
	public static void main(String[] args)
	{
	  System.out.println("98. Validate Binary Search Tree");
	  
	  String format = "\r\nBinary tree %s"
	                + "\r\nIs it a valid BST? %b";

		Solution098 sol = new Solution098v1();
		
		for (Integer[] testcase : _testCases)
		{
	    TreeNode root = myTreeUtils.createBinaryTree(testcase);
	    List<Integer> tree = myTreeUtils.inorderTraversal(root); 
	    
	    boolean isValid = sol.isValidBST(root);
	    System.out.println(String.format(format, tree.toString(), isValid));
		}
	}
	
	private static Integer[][] _testCases = 
	{
	    {2,1,3}, {1,2,3}  
	};
}
