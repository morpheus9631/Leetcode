## 115\. Distinct Subsequences

    Given a string S and a string T, count the number of distinct subsequences of T in S.
    
    A subsequence of a string is a new string which is formed from the original string by
    
    deleting some (can be none) of the characters without disturbing the relative positions
    
    of the remaining characters.
    
    (ie, "ACE" is a subsequence of "ABCDE" while "AEC" is not).
    
    
    Here is an example:
    
      S = "rabbbit", T = "rabbit"
      
      Return 3.

--------------------------------------------------------------------------------

    動態規劃題:
    
     先用二維動態規劃的思路解釋下：(Solution115v1)
  
        設 match 是動態規劃表，其中  match[i][j] 表示 S.substring(0,i) 對 T.substring(0,j) 
        
        有幾種組成方式，遞推公式為：
        
            若 S.charAt(i-1) == T.charAt(j-1)，則 match[i][j] = match[i-1][j-1] + match[i-1][j]。
             
            若 S.charAt(i-1) != T.charAt(j-1)，則 match[i][j] = match[i-1][j]。
            
    
    
    那麼能不能改成一維數組？(Solution115v2)
    
        仔細看一下遞推公式，計算 dp[i][j] 需要的額外信息只有左邊一格的舊制，
        
        那麼就直接用hold將其保存起來不就好了，
        
        於是就可以把二維的動態規劃數組優化成了一維的，對空間複雜度進行了改進。
        
        同時，進一步改進在於如果對於 T 中的某一位，前一位的構造已經失敗（也就是構造到前一位的方位數為0），
        
         那麼也就不用計算當前位了，直接進入下一層循環即可。
    
  