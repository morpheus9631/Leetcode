## 136\. Single Number

    Given an array of integers, every element appears twice except for one. 
    
    Find that single one.
    
    Note:
    
      Your algorithm should have a linear runtime complexity. 
      
      Could you implement it without using extra memory?
      
--------------------------------------------------------------------------------------------

    解題：
    
      使用 "位元 XOR 運算子 (^)"
      
      XOR：若輸入的兩個位元不同時，結果為 1；若輸入的兩個位元相同時，結果是 0 。
      
      For example: 
        
        0101   (expression1)
        1100   (expression2)
        ----
        1001   (result)      