## 238\. Product of Array Except Self

    Given an array of n integers where n > 1, nums, 
    
    return an array output such that output[i] is equal to
    
    the product of all the elements of nums except nums[i].

    Solve it without division and in O(n).

    For example, given [1,2,3,4], return [24,12,8,6].

    Follow up:
        
        Could you solve it with constant space complexity? 
        
        (Note: The output array does not count as extra space 
    
    for the purpose of space complexity analysis.)
        
  ----------------------------------------------------------------------------
        
    Solution:

    因為不能用法除法，所以不能採用將 1 ~ (i-1) 個 元素值相乘後放在第 i 個元素的方法.
    
    依題意：
    
      輸入為 { a1, a2, a3, a4 } 時，
      輸出為 { a2*a3*a4, a1*a3*a4, a1*a2*a4, a1*a2*a3 }
    
    所以將輸出拆為兩個陣列，
    
      分別是: {        1,    a1, a1*a2, a1*a2*a3 } 和
          { a2*a3*a4, a3*a4,    a4,        1 }
    
    這樣只要兩次迴圈就可以完成了。
