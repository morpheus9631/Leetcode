package com.example.leetcode._151_to_200._165_CompareVersionNumbers;

import com.example.leetcode.utils.myStringUtils;

public class Main165
{
  public static void main(String[] args)
  {
    System.out.println("165. Compare Version Numbers");

    String replaceStr = "###";
    
    String format = "\r\nVersion 1: %s"
                  + "\r\nVersion 2: %s"
                  + "\r\n\r\n%s " + replaceStr + " %s"
                  + "\r\n\r\n" + myStringUtils.dashLine();

    Solution165 sol = new Solution165v1();
    for (String[] testcase : _testCases)
    {
      String strV1 = testcase[0];
      String strV2 = testcase[1];
      
      int res = sol.compareVersion(strV1, strV2);
      String strRes = (res == 1) ? ">" : (res == 1) ? "=" : "<";
      
      String outstr = String.format(format, strV1, strV2, strV1, strV2)
                            .replace(replaceStr, strRes);
      System.out.println(outstr);
    }
  }

  private static String[][] _testCases = 
  {
    { "0", "1" }, 
    { "1.0", "1.1" },
    { "0.1", "0.0.1" },
    { "1.0", "1" }
  };
}
