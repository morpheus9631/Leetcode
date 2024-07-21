package com.example.leetcode._101_to_150._112_PathSum;

import java.util.Arrays;

import com.example.leetcode.utils.TreeNode;
import com.example.leetcode.utils.myTreeUtils;

public class Main112
{

  public static void main(String[] args)
  {
    System.out.println("112. Path Sum");
    
    String format = "\r\nnums: %s"
                  + "\r\nsum: %d"
                  + "\r\nHas path sum? %b";

    Solution112 sol = new Solution112v4();

    for (Integer[][] testcase : _testCases)
    {
      int sum = testcase[0][0];
      Integer[] nums = testcase[1];
      
      TreeNode root = myTreeUtils.createBinaryTree(nums);
      boolean hasPathSum = sol.hasPathSum(root, sum);

      System.out.println(String.format(format, 
          Arrays.toString(nums), sum, hasPathSum));
    }
  }

  private static Integer[][][] _testCases = 
  {
    { // Expected: true
      {22}, {5,4,8,11,(Integer)null,13,4,7,2,(Integer)null,(Integer)null,(Integer)null,1}  
    }
    , { {1}, {1,2} }                      // Expected: false
    , { {-5}, {-2,null,-3} }              // Expected: true
    , { {0}, {} }                         // Expected: false
    , { {3}, {1,-2,-3,1,3,-2,null,-1} }   // Expected: false
    , { {1}, {1,2} }                      // Expected: true
    , { {1}, {1} }                        // Expected: false
    , { {15}, {1,2,null,3,null,4,null,5}} // Expected: true
  };
}
