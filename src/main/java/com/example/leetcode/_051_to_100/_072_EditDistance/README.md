## 72\. Edit Distance

    Given two words word1 and word2, 
    
    find the minimum number of steps required to convert word1 to word2. 
    
    (each operation is counted as 1 step.)
    
    You have the following 3 operations permitted on a word:
    
        a) Insert a character
        b) Delete a character
        c) Replace a character
        

    解題思路：
    
        典型的動態規劃題目。維護一個二維數組 dis[][]，
        dis[i][j] 表示：word1 的前 i 個元素與 word2 的前 j 個元素的 edit distance 值。
        
        遞推關係為：
           當 word1[i] == word2[j]，dis[i][j] = dis[i][j-1]。
           當 word1[i] != word2[j]，dis[i][j] = min(dis[i-1][j-1], dis[i][j-1], dis[i-1][j]) + 1。
            
        解釋一下第二種情況下的遞推公式：
           dis[i][j] = dis[i-1][j-1] + 1意味著替換字符
           dis[i][j] = dis[i - 1][j] + 1意味著刪除字符 
           dis[i][j] = dis[i][j - 1] + 1意味著插入字符
              
        再簡化方法：
            其中，數組我們可以用一維即可，用一個 upleft 表示左上的值即(dp[i-1][j-1]).