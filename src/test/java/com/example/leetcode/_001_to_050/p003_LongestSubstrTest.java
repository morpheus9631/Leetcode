package com.example.leetcode._001_to_050;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.leetcode._001_to_050.p003_LongestSubstr.Solution;
import com.example.leetcode._001_to_050.p003_LongestSubstr.Solution01;
import com.example.leetcode._001_to_050.p003_LongestSubstr.TestCase;

@SpringBootTest
public class p003_LongestSubstrTest {

    private static TestCase[] testcaseAry = 
    {
        new TestCase("abcabcbb", 3),
        new TestCase("bbbbb", 1),
        new TestCase("pwwkew", 3),
        new TestCase("c", 1),
        new TestCase("aab", 2),
    };

    @Test
    public void testSolution()
    {
        Solution sol = new Solution01();
        
        for (TestCase tc : testcaseAry)
        {
            String str = tc.getStr();
            int expected = tc.getExpected();
            int actual = sol.lengthOfLongestSubstring(str);
            assertEquals(expected, actual);
        }

    }
}
