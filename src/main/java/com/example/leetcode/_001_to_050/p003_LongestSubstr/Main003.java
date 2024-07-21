package com.example.leetcode._001_to_050.p003_LongestSubstr;

import com.example.leetcode.utils.myStringUtils;

public class Main003
{
    private static TestCase[] testcaseAry = 
    {
        new TestCase("abcabcbb", 3),
        new TestCase("bbbbb", 1),
        new TestCase("pwwkew", 3),
        new TestCase("c", 1),
        new TestCase("aab", 2),
    };

    public static void main(String[] args)
    {
        System.out.println("3. Longest Substring Without Repeating Characters");
        
        String format = "String: %s"
                        + "\nLength is %d"
                        + "\n" + myStringUtils.dashLine();
        
        Solution sol = new Solution01();
        
        System.out.println(String.format("\n%s", myStringUtils.dashLine()));
        for (TestCase tc : testcaseAry)
        {
            String str = tc.getStr();
            int len = sol.lengthOfLongestSubstring(str);
            
            System.out.println(String.format(format, str, len));
        }
    }
            
}
