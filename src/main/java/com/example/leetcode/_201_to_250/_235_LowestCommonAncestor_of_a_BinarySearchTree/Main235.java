package com.example.leetcode._201_to_250._235_LowestCommonAncestor_of_a_BinarySearchTree;

import com.example.leetcode.utils.TreeNode;
import com.example.leetcode.utils.myStringUtils;
import com.example.leetcode.utils.myTreeUtils;

public class Main235
{
  public static void main(String[] args)
  {
    System.out.println("235. Lowest Common Ancestor of a Binary Search Tree");
    
    String format = "\r\nBST: %s"
                  + "\r\nLCA of node %d and %d is %d."
                  + "\r\n\r\n" + myStringUtils.dashLine()
                  ;
    
    Solution235 sol = new Solution235v1();
    
    for (Integer[][] testcase : _TestCases)
    {
      Integer[] nums = testcase[1];
      TreeNode root = myTreeUtils.createBinaryTree(nums);
      //System.out.println(myTreeUtils.toString(root));

      TreeNode p = new TreeNode(testcase[0][0]);
      //TreeNode p = myTreeUtils.searchNode(root, testcase[0][0]);
      //System.out.println((p == null) ? "null" : p.val); 
      
      TreeNode q = new TreeNode(testcase[0][1]);
      //TreeNode q = myTreeUtils.searchNode(root, testcase[0][1]);
      //System.out.println((p == null) ? "null" : q.val); 

      TreeNode lcs = sol.lowestCommonAncestor(root, p, q);
      
      System.out.println(String.format(format, 
          myTreeUtils.toString(root), p.val, q.val, lcs.val));
    }
  }
  
  private static Integer[][][] _TestCases = 
  {
      { {2,8}, {6,2,8,0,4,7,9,(Integer)null,(Integer)null,3,5} }  
    , { {2,4}, {6,2,8,0,4,7,9,(Integer)null,(Integer)null,3,5} }
    , { {2,1}, {2,1} }                                            // Expected: 2
    , { {1,3}, {2,1,3} }                                          // Expected: 2
    , { {2,3}, {3,1,4,null,2} }                                   // Expected: 3
    , { {3,5}, {6,2,8,0,4,7,9,null,null,3,5} }                    // Expected: 4
    , { {2,4}, {3,1,4,null,2} }                                   // Expected: 3
  };
}
