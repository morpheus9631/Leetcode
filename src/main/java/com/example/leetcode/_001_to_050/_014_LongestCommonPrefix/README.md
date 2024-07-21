## 14\. Longest Common Prefix

    Write a function to find the longest common prefix string amongst an array of strings.
    
-------------------------------------------------------------------------------------------

    解題：
    1.當字串陣列為 null 時回傳    null
    
    2.當字串陣列長度為 0 時回傳 ""
    
    3.當字串陣列長度為 1 時回傳第一個字串
    
    4.當字串陣列長度大於 2 時：
      
      a.先比較 strs[0] 和 strs[1]，找出最長共同字首字串，以 LCPS 表示
      
      b.將 LCPS 依序和剩餘的字串比較，並將比較結果取代 LCPS
      
      c. LCPS 即為解
      
        
    