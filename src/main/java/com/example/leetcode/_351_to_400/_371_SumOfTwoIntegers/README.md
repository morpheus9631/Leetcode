## 371\. Sum of Two Integers

    Calculate the sum of two integers a and b, 
    
    but you are not allowed to use the operator + and -.

    Example:
    
        Given a = 1 and b = 2, return 3.
        
-------------------------------------------------------------------------------
        
    解題：
    
        1.將 a, b 兩數做位元相加時，可得：(1) 0+0=0, (2) 0+1=1, (3),1+0=1, (4) 1+1=0
        
            所以 a, b 兩數做位元相加運算時和 a xor b 的結果相同。
          
        2.因為 a, b 兩數相加時若同位元均為 1 時須進位，所以和 (a & b) << 1 的結果相同，
        
          所以 a + b = (a xor b) + ((a & b) << 1)
          
        3.因為不能用 +, - 運算，所以用遞迴方式計算 (a xor b) 和 ((a & b) << 1) 的值就可以得到解。
        