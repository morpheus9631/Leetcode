package com.example.leetcode._001_to_050._016_3SumClosest;

import java.util.Arrays;

import com.example.leetcode.utils.myStringUtils;

public class Main016
{
  public static void main(String[] args)
  {
    System.out.println("16. 3Sum Closest");
    
    String format = "\r\nS = %s"
                  + "\r\nTarget = %d"
                  + "\r\n\r\nThe closest sum is %d."
                  + "\r\n\r\n" + myStringUtils.dashLine();

    Solution016 sol = new Solution016v2();
  
    int[][][] testcases = getTestCases();
    for (int[][] test_case : testcases)
    {
      int[] nums = test_case[0];
      int target = test_case[1][0];
    
      int sum = sol.threeSumClosest(nums, target);
    
      System.out.println(String.format(format
          , Arrays.toString(nums), target, sum));
    }
  }

  private static int[][][] getTestCases()
  {
    int[][][] testcases = 
    {
        { { 0, 0, 0}, {1} }
      , { {-1, 2, 1,-4}, {1} }
      , { {1, 1, -1, -1, 3}, {-1} }
      , { {
              43, 75,-90, 47,-49, 72, 17,-31,-68,-22
            ,-21,-30, 65, 88,-75, 23, 97,-61, 53, 87
            , -3, 33, 20, 51,-79, 43, 80, -9, 34,-89
            , -7, 93, 43, 55,-94, 29,-32,-49, 25, 72
            , -6, 35, 53, 63,  6,-62,-96,-83,-73, 66
            ,-11, 96,-90,-27, 78,-51, 79, 35,-63, 85
            ,-82,-15,100,-82,  1, -4,-41,-21, 11, 12
            , 12, 72,-82,-22, 37, 47,-18, 61, 60, 55
            , 22, -6, 26,-60,-42,-92, 68, 45, -1,-26
            ,  5,-56, -1, 73, 92,-55,-20,-43,-56,-15
            ,  7, 52, 35,-90, 63, 41,-55,-58, 46,-84
            ,-92, 17,-66,-23, 96,-19,-44, 77, 67,-47
            ,-48, 99, 51,-25, 19,  0,-13,-88,-10,-67
            , 14,  7, 89,-69,-83, 86,-70,-66,-38,-50
            , 66,  0,-67,-91,-65, 83, 42, 70, -6, 52
            ,-21,-86,-87,-44,  8, 49,-76, 86, -3, 87
            ,-32, 81,-58, 37,-55, 19,-26, 66,-89,-70
            ,-69, 37,  0, 19,-65, 38,  7,  3,  1,-96
            , 96,-65,-52, 66,  5, -3,-87,-16,-96, 57
            ,-74, 91, 46,-79,  0,-69, 55, 49,-96, 80
            , 83, 73, 56, 22, 58,-44,-40,-45, 95, 99
            ,-97,-22,-33,-92,-51, 62, 20, 70, 90
          }, {284}
        }
    };
    return testcases;
  }
}  

