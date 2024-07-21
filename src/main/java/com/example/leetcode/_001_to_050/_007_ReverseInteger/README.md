## 007\. Reverse Integer

    Reverse digits of an integer.

    Example1: x = 123, return 321
    
    Example2: x = -123, return -321
    
--------------------------------------------------------------------------------

    解題：
    
    1.紀錄 x 是否為負數，並將 x 轉成正數    
    
    2.以 long newX 紀錄轉換後的結果，以避免 int 溢位
    
    3.每一次執行時取出 x 的個位數，並將它加到 10 倍 newX 的個位數，然後 x 除以 10
    
    4.計算完後檢查 newX 是否出超 Integer.MAX_VALUE，如果是，則回傳 0
    
    5.如果 x 是負數，則將 newX 變成負數，再回傳結果