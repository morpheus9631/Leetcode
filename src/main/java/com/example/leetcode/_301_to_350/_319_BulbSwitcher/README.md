## 319\. Bulb Switcher
 
    There are n bulbs that are initially off. 
    
    You first turn on all the bulbs. 
    
    Then, you turn off every second bulb. 
    
    On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on). 
    
    For the ith round, you toggle every i bulb. 
    
    For the nth round, you only toggle the last bulb. 
    
    Find how many bulbs are on after n rounds.
    
    Example:
    
        iven n = 3.
        
        t first, the three bulbs are [off, off, off].
        fter first round, the three bulbs are [on, on, on].
        fter second round, the three bulbs are [on, off, on].
        fter third round, the three bulbs are [on, off, off].
        
        o you should return 1, because there is only one bulb is on.
        
-------------------------------------------------------------------------------------------

    解析：
    
        返回值其實就是 n 開方後向下取整的得數。
        
        對於每個數字來說，除了平方數，都有偶數個因數。
        
        例如：
      
            如 6 有 4 個因數：1×6=6，2×3=6
            
            如 60 有 12 個因數：1×60=60，2×30=60，3×20=60，4×15=60，5×12=60，6×10=60
            
            可以看出，非平方數的因數總是成對出現的，只有平方數的因數才是奇數，因為平方數除平方根外，其他的因數都是成對出現的！
            
            對於當前的開關燈泡問題，可知到最後處在平方數位置的燈泡一定是開啟的，其他位置的燈泡一定是關閉的。
            
            而要計算一個數之下有多少小於或等於它的平方數，使用一個開平方用的函數就可以了.
    
    
    分析規律：
    
        當 n=10 時，觀察每個燈被翻轉的次數。
        
            燈　　號： 1  2  3  4  5  6  7  8  9  10
            翻轉次數： 1  2  2  3  2  4  2  4  3  4
        
        可以看出最後只有翻轉了奇數次的燈 1 4 9 會亮，1 4 9 全都是平方數。
        
        9 號燈會亮 3 次是因為在第 1 次翻轉，第 3 次翻轉，還有第 9 次翻轉都翻轉了。
        
        可以看出，一個數字被翻轉的次數就是他的因子的個數，如果最後是亮著的狀態，那麼它的因子的個數必須為奇數。
        
        結合前面平方數的規律，如果一個數是平方數，那麼它的因子個數一定是奇數，那麼問題就解決了。 
        