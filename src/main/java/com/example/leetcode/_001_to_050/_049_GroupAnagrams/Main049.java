package com.example.leetcode._001_to_050._049_GroupAnagrams;

import java.util.List;

import com.example.leetcode.utils.myArrayUtils;
import com.example.leetcode.utils.myListUtils;
import com.example.leetcode.utils.myStringUtils;

public class Main049
{
  public static void main(String[] args)
  {
    System.out.println("49. Group Anagrams");
    
    String replaceStr = "###";
    
    String format = "\r\nS = %s"
                  + "\r\n\r\nRetutn: "
                  + "\r\n" + replaceStr
                  + "\r\n\r\n" + myStringUtils.dashLine();
                  ;
    
    Solution049 sol = new Solution049v2();
    
    for (String[] test_case : _testCases)
    {
      List<List<String>> solset = sol.groupAnagrams(test_case);
      
      String caseStr = myArrayUtils.toString(test_case); 
      String solsetStr = myListUtils.toString(solset);
      String outstr = String.format(format, caseStr).replace(replaceStr, solsetStr);
      System.out.println(outstr);
    }
  }
  
  private static String[][] _testCases =
  {
    { "eat", "tea", "tan", "ate", "nat", "bat" },
    { "", "" },
    { "" },
    { "ant", "ant" }
  };
}
