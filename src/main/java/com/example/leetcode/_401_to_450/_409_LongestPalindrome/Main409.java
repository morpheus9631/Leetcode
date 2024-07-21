package com.example.leetcode._401_to_450._409_LongestPalindrome;

import com.example.leetcode.utils.myStringUtils;

public class Main409
{
  public static void main(String[] args)
  {
    System.out.println("409. Longest Palindrome");
    
    String format = "\r\nInput:\r\n \"%s\""
                  + "\r\n\r\nOutput:\r\n%d"
                  + "\r\n\r\n" + myStringUtils.dashLine()
                  ;
    
    Solution409 sol = new Solution409v1();
    
    for (String str : _testCases)
    {
      int res = sol.longestPalindrome(str);
      
      System.out.println(String.format(format, str, res));
    }
  }
  
  private static String[] _testCases = 
  {
      "abccccdd"
    , "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"
    , "bb"
  };
}
