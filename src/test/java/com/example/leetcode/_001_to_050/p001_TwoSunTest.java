package com.example.leetcode._001_to_050;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.leetcode._001_to_050.p001_TwoSum.Solution001;
import com.example.leetcode._001_to_050.p001_TwoSum.Solution001v1;
import com.example.leetcode._001_to_050.p001_TwoSum.Solution001v2;
import com.example.leetcode._001_to_050.p001_TwoSum.Solution03;
import com.example.leetcode._001_to_050.p001_TwoSum.Solution04;
import com.example.leetcode._001_to_050.p001_TwoSum.TestCase;

@SpringBootTest
public class p001_TwoSunTest {
    
    private static TestCase[] testcaseAry = {
        new TestCase(9, new int[]{2,7,11,15}, new int[] {0,1}),
        new TestCase(6, new int[]{3,2,4},     new int[] {1,2}),
        new TestCase(0, new int[]{0,4,3,0},   new int[] {0,3}),
        new TestCase(0, new int[]{-3,4,3,90}, new int[] {0,2})
    };

    @Test
    public void testSolution01()
    {
        Solution001 sol = new Solution001v1();
        
        for (TestCase    tc : testcaseAry)
        {
            int target = tc.getTarget();
            int[] nums = tc.getNums();
            int[] expected = tc.getExpected();
            int[] actual = sol.twoSum(nums, target);
            assertArrayEquals(expected, actual);
        }
    }

    @Test
    public void testSolution02()
    {
        Solution001 sol = new Solution001v2();
        
        for (TestCase    tc : testcaseAry)
        {
            int target = tc.getTarget();
            int[] nums = tc.getNums();
            int[] expected = tc.getExpected();
            int[] actual = sol.twoSum(nums, target);
            assertArrayEquals(expected, actual);
        }
    }

    @Test
    public void testSolution03()
    {
        Solution001 sol = new Solution03();
        
        for (TestCase    tc : testcaseAry)
        {
            int target = tc.getTarget();
            int[] nums = tc.getNums();
            int[] expected = tc.getExpected();
            int[] actual = sol.twoSum(nums, target);
            assertArrayEquals(expected, actual);
        }
    }

    @Test
    public void testSolution04()
    {
        Solution001 sol = new Solution04();
        
        for (TestCase    tc : testcaseAry)
        {
            int target = tc.getTarget();
            int[] nums = tc.getNums();
            int[] expected = tc.getExpected();
            int[] actual = sol.twoSum(nums, target);
            assertArrayEquals(expected, actual);
        }
    }
}
