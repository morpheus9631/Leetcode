package com.example.leetcode._101_to_150._115_DistinctSubsequences;

/*
 * 動態規劃題:
 * 
 *   先用二維動態規劃的思路解釋下：
 *   
 *     設match是動態規劃表，其中 match[i][j] 表示 S.substring(0,i) 對 T.substring(0,j) 有幾種組成方式，遞推公式為：
 *     
 *       若 S.charAt(i-1) == T.charAt(j-1)，則 match[i][j] = match[i-1][j-1] + match[i-1][j]。
 *       若 S.charAt(i-1) != T.charAt(j-1)，則 match[i][j] = match[i-1][j]。
 *       
 *   那麼能不能改成一維數組？
 *   
 *     仔細看一下遞推公式，計算 dp[i][j] 需要的額外信息只有左邊一格的舊制，那麼就直接用hold將其保存起來不就好了，
 *     
 *     於是就可以把二維的動態規劃數組優化成了一維的，對空間複雜度進行了改進。
 *     
 *     同時，進一步改進在於如果對於 T 中的某一位，前一位的構造已經失敗（也就是構造到前一位的方位數為0），
 *     
 *     那麼也就不用計算當前位了，直接進入下一層循環即可。
 *     
 *   一維動態規劃數組實現代碼：
 */

public class Solution115v2 implements Solution115
{
  public int numDistinct(String s, String t) 
  {
    int slen = s.length();
    int tlen = t.length();
    
    if (tlen == 0) return 1;
    
    int[] dp = new int[tlen+1];
    dp[0] = 1;
     
    for (int i=0; i<slen; i++) 
    {
      int last = 1;
      for (int j=0; j<t.length(); j++) 
      {
        if (dp[j] == 0) break;

        int temp = dp[j+1];
        if (s.charAt(i) == t.charAt(j)) dp[j+1] += last;
        last = temp;
      }
    }
    return dp[tlen];  
  }
}
