## 233\. Number of Digit One

    Given an integer n, 
  
    count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
  
    For example:
  
        Given n = 13,
    
        Return 6, because digit 1 occurred in the following numbers: 1, 10, 11, 12, 13. 

        
    解法：
  
      可以做循環從 1 到 n 一個個找。慢。
    
      更好的是用歸納法總結出 1 出現的次數的規律。
    
      假設 n=abcde 五位數字的時候，我們分析百位 c，有三種情況：
    
      1）c == 0 的時候，比如 12013，此時百位出現 1 的是：00100 ~ 00199, 01100~01199,...,11100~11199，共 1200 個，
    
        顯然這個有高位數字決定，並且受當前位數影響； 個數就是 ab*100
      
      2）c == 1 的時候，比如 12113，此時百位出現 1 的肯定包括 c=0 的情況，另外還需要考慮低位的情況即：00100~00113 共 14 個; 
    
        個數等於 ab*100+ de + 1
        
      3）c >= 2 的時候，比如 12213，此時百位出現 1 的是：00100~00199， 01100~01199,...,11100~11199, 12100~12199，
    
        共 1300 個，這個由高位數字決定，其實是加一，並且乘以當前位數; 個數就是 (ab+1)*100
      
      總結起來，對於一個 n = abcde 來說，百位出現1的個數計算方法為 ：
    
        if (c==0) ans = ab*100;
        if (c==1) ans = ab*100+cd+1
        if (c>1)  ans = (ab+1)*100
            