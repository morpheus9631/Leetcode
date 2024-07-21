## 1\. Two Sum

    Given an array of integers, 
    
    return indices of the two numbers such that they add up to a specific target.

    You may assume that each input would have exactly one solution, 
    
    and you may not use the same element twice.

    Example:
    
      Given nums = [2, 7, 11, 15], target = 9,
      
      Because nums[0] + nums[1] = 2 + 7 = 9,
      
      return [0, 1].

--------------------------------------------------------------------------------------------

    解題：
    
    1.雙迴圈解法：
    
      a.外圈從 i = 0 to nums.length-2, 內圈從 j = i+1 to nums.length-1
      
        依序計算 nums[i] + nums[j] 是否等於  target，如果是則結束運算 。
        
        時間複雜度為 O(n^2)
        
    
    2.使用 HashMap<Integr, List<Integer>>：儲存所有的 <nums[i], [index1, index2]> 資料
    
      a.將 HashMap 的 values 定義為 List<Integer>，並將所有 nums 的索引值存入。
    
      b.若 first num 和 second num 相同，且在 HashMap 中有兩筆 index 資料，則為正確解。
      
      c.若 first num 和 second num 相同，且在 HashMap 中僅有一筆 index 資料，則非正確解。
      
      d.若 first num 和 second num 不同，且兩者均存在於  HashMap 中， 則為正確解。
      
      e.若 first num 和 second num 不同，且 second num 不存在於 HashMap 中，則非正確解。
      
      
    3.使用 HashMap<Integr, Integer>：僅儲存 num 的最後一筆 index 資料：
    
      a.依序從 nums 中取出 first num, second num = target - first num, 
      
        first num index (first index) 為 nums[] 中的 index 
      
      b.查詢 second num 是否存在於 HashMap 中，如果是，則取出 index -> second index
      
      c.如果 first index != second index 則為正確解。
        

      
      
      
    
        
         
