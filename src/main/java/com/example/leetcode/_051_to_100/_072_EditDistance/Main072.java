package com.example.leetcode._051_to_100._072_EditDistance;

/*
 * 72. Edit Distance
 * 
 *   Given two words word1 and word2, 
 *   
 *   find the minimum number of steps required to convert word1 to word2. 
 *   
 *   (each operation is counted as 1 step.)
 *   
 *   You have the following 3 operations permitted on a word:
 *   
 *     a) Insert a character
 *     b) Delete a character
 *     c) Replace a character
 */

public class Main072
{
  public static void main(String[] args)
  {
    System.out.println("72. Edit Distance");
    
    String word1 = "";
    String word2 = "";

    Solution072 sol = new Solution072v2();
    int numSteps = sol.minDistance(word1, word2);
    System.out.println("\r\nThe minimum number of steps is "+numSteps);
  }
}
