package com.example.leetcode._001_to_050.p001_TwoSum;

import java.util.Arrays;

public class Main001v1
{
    private static TestCase[] testcaseAry = {
        new TestCase(9, new int[]{2,7,11,15}, new int[] {0,1}),
        new TestCase(6, new int[]{3,2,4},         new int[] {1,2}),
        new TestCase(0, new int[]{0,4,3,0},     new int[] {0,3}),
        new TestCase(0, new int[]{-3,4,3,90}, new int[] {0,2})
    };

    public static void main(String[] args)
    {
        System.out.println("1. Two Sum");

        String format = "\r\nnums = %s, target = %d"
                                    + "\r\nReturn: %s"
                                    ;
        
        Solution03 sol = new Solution03();
        
        for (TestCase    tc : testcaseAry)
        {
            int target = tc.getTarget();
            int[] nums = tc.getNums();
            int[] actual = sol.twoSum(nums, target);
            
            System.out.println(String.format(format, 
                    Arrays.toString(nums), target, Arrays.toString(actual)));
        }
    }
}
