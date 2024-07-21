package com.example.leetcode._051_to_100._072_EditDistance;

/*
 * 解題思路：
 * 
 *    典型的動態規劃題目。維護一個二維數組 dis[][]，
 *    
 *    dis[i][j] 表示：word1 的前 i 個元素與 word2 的前 j 個元素的 edit distance 值。
 *    
 *    遞推關係為：    
 *      
 *      當 word1[i] == word2[j]，dis[i][j] = dis[i][j-1]。
 *      當 word1[i] != word2[j]，dis[i][j] = min(dis[i-1][j-1], dis[i][j-1], dis[i-1][j]) + 1。
 *    
 *    解釋一下第二種情況下的遞推公式：
 *    
 *       dis[i][j] = dis[i-1][j-1] + 1意味著替換字符
 *       dis[i][j] = dis[i - 1][j] + 1意味著刪除字符
 *       dis[i][j] = dis[i][j - 1] + 1意味著插入字符
 * 
 *    再簡化方法：
 *       其中，數組我們可以用一維即可，用一個 upleft 表示左上的值即(dp[i-1][j-1]).
 */


public class Solution072v2 implements Solution072
{
  public int minDistance(String word1, String word2) 
  {
    int m = word1.length();
    int n = word2.length();
    
    int[] dp = new int[n+1];
   
    for (int i=0; i < dp.length; i++) dp[i] = i;
    
    for (int i=1; i <= m; i++) 
    {
      int upleft = dp[0];
      dp[0] = i;
      
      for (int j=1; j <= n; j++) 
      {
        int temp = dp[j];
        if (word1.charAt(i-1) == word2.charAt(j-1))
          dp[j] = upleft;
        else
          dp[j] = Math.min(upleft, Math.min(dp[j], dp[j-1])) + 1;
        upleft = temp;
      }
    }
    return dp[n];
  }
}
