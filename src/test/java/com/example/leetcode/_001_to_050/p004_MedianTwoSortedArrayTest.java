package com.example.leetcode._001_to_050;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.leetcode._001_to_050.p004_MedianOfTwoSortedArrays.*;

@SpringBootTest
public class p004_MedianTwoSortedArrayTest {

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

    @Test
    public void testSolution01()
    {
        Solution004 sol = new Solution004v1();
        for (TestCase tc : testcaseAry) {

            int[] nums1 = tc.getNums1();
            int[] nums2 = tc.getNums2();
            double exxpected = tc.getExpected();
            double actual = sol.findMedianSortedArrays(nums1, nums2);
            assertEquals(exxpected, actual);
        }
    }

    @Test
    public void testSolution02()
    {
        Solution004 sol = new Solution004v2();
        for (TestCase tc : testcaseAry) {

            int[] nums1 = tc.getNums1();
            int[] nums2 = tc.getNums2();
            double exxpected = tc.getExpected();
            double actual = sol.findMedianSortedArrays(nums1, nums2);
            assertEquals(exxpected, actual);
        }
    }

    @Test
    public void testSolution03()
    {
        Solution004 sol = new Solution004v3();
        for (TestCase tc : testcaseAry) {

            int[] nums1 = tc.getNums1();
            int[] nums2 = tc.getNums2();
            double exxpected = tc.getExpected();
            double actual = sol.findMedianSortedArrays(nums1, nums2);
            assertEquals(exxpected, actual);
        }
    }

    @Test
    public void testSolution04()
    {
        Solution004 sol = new Solution004v4();
        for (TestCase tc : testcaseAry) {

            int[] nums1 = tc.getNums1();
            int[] nums2 = tc.getNums2();
            double exxpected = tc.getExpected();
            double actual = sol.findMedianSortedArrays(nums1, nums2);
            assertEquals(exxpected, actual);
        }
    }
}
