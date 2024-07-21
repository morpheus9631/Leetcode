## 400\. Nth Digit

    Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...
    
    Note:
        n is positive and will fit within the range of a 32-bit signed integer (n < 2^31).
    
    Example 1:
    
        Input: 3
        Output: 3

    Example 2:
    
        Input: 11
        Output: 0
    
    Explanation:
        
        The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0, 
        which is part of the number 10.
        
----------------------------------------------------------------------------------------------------

    解題:
    
      求從 1 開始的第 n 個數字為何? 要注意的是求的是數字而不是整數
      
      例如： 

        12是一個整數，有兩個數字 1 和 2

      所以要考慮的是第 n 個數是有多少位數，起主要規律為：

        個位數：1-9， 一共有 9 個整數，共計 9 個數字 = 1 x 9 x 10^1 
        十位數：10-99，一共有 90 個整數，  共計 180 個數字 = 2 x 9 x 10^2
        百位數：100-999，一共有 900 個整數， 共計 2700 個數字 = 3 x 9 x 10^3
        千位數，1000-9999，一共有 9000 個整數，共計 36000 個數字 = 4 x 9 x 10^4
 
      以此類推，只要先找到是那一個整數，就可以找到對應的數字。
              