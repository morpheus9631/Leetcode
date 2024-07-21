package com.example.leetcode._001_to_050.p004_MedianOfTwoSortedArrays;

import java.util.Arrays;

import com.example.leetcode.utils.myStringUtils;

public class Main004
{
    private static TestCase[] testcaseAry = {
        new TestCase(new int[] {1,3},        new int[] {2}      , 2.0),
        new TestCase(new int[] {1,3},        new int[] {2,4}    , 2.5),
        new TestCase(new int[] {1,2},        new int[] {3,4}    , 2.5),
        new TestCase(new int[] {1,2,3},      new int[] {4,5}    , 3.0),
        new TestCase(new int[] {1},          new int[] {2,3,4,5}, 3.0),
        new TestCase(new int[] {2,3,4,5},    new int[] {1}      , 3.0),
        new TestCase(new int[] {3},          new int[] {1,2,4,5}, 3.0),
        new TestCase(new int[] {3,6,7,8,9 }, new int[] {1,2,4,5}, 5.0),
        new TestCase(new int[] {},           new int[] {1}      , 1.0),
        new TestCase(new int[] {2},          new int[] {}       , 2.0),
        new TestCase(new int[] {1},          new int[] {1}      , 1.0),
        new TestCase(new int[] {100000},     new int[] {100001} , 100000.5),
        new TestCase(new int[] {},           new int[] {1,2,3,4}, 2.5)
    };

    public static void main(String[] args)
    {
        System.out.println("4. Median of Two com.example.leetcode.sorted Arrays");

        String format = 
                    "nums1: %s"
                + "\nnums2: %s"
                + "\nThe median is %.1f"
                + "\n" + myStringUtils.dashLine();
        
        Solution004 sol = new Solution004v4();
        
        System.out.println(String.format("\n%s", myStringUtils.dashLine()));
        for (TestCase tc : testcaseAry)
        {            
            int[] nums1 = tc.getNums1();
            int[] nums2 = tc.getNums2();

            double result = sol.findMedianSortedArrays(nums1, nums2);
            
            String str1 = Arrays.toString(nums1);
            String str2 = Arrays.toString(nums2);
            System.out.println(String.format(format, str1, str2, result));
        }
    }
}



