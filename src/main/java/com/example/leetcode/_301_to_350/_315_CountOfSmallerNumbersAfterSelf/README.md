## 315\. Count of Smaller Numbers After Self

    You are given an integer array nums and you have to return a new counts array. 
    
    The counts array has the property where counts[i] is the number of smaller elements 
    
    to the right of nums[i].
    
    Example:
    
        Given nums = [5, 2, 6, 1]
      
        To the right of 5 there are 2 smaller elements (2 and 1).
        To the right of 2 there is only 1 smaller element (1).
        To the right of 6 there is 1 smaller element (1).
        To the right of 1 there is 0 smaller element.
        
        Return the array [2, 1, 1, 0]. 
      
-------------------------------------------------------------------------------------------

    關於merge sort
      
        合併排序的時候，會先一直遞迴到只剩下兩個元素，然後對這兩個元素進行 merge，merge 到一個臨時數組。
      
        在合併的過程中就肯定有元素之間的交換，只不過這裡的不是在原來數組上 in place 交換，
      
        而是直接賦值到一個臨時數組裡。參考http://www.jianshu.com/p/ae97c3ceea8d
      
    
    具體思路
      
        有很多思路可以參考，不過都是 O(nlogn)，最經典的思路就是做 merge sort。
      
        因為 merge sort中，要進行合併，合併的時候就可以有大小關係的體現。
      
        例如，merge sort 的時候先把 nums 按中點分為 left 和 right，當 left 和 right 都有序之後，
      
        如果沒有逆序的話，left 的所有的數應該要小於 right 的數，left={a1,a2,a3}, right={b1,b2,b3}，i=j=0. 
      
        如果 i=j=1 的時候，a2>b2>b1, 對於 a2 就應該記 2 次逆序，
      
        這裡不要用 left[i]>right[j] 時就記錄一次逆序（自己錯誤的code裡面寫了例子）。
      
        而是要用 left[i]<=right[j] 時，這個時候證明，有 0-(j-1) 這麼多的元素，都是 left[i]>right[j]，
      
        即 left[i] 的逆序，所以這裡為 left[i] 記上 j 次逆序即可。
      
        例如 left={5,6,7}, right={1,2,3}, j 肯定等於 3 的時候，再對 i=0 的元素 5 對應的逆序數加上 3. 對應code看看。
      
        然後這些跟 left[i] 逆序的元素在合併之後就 ordered 了，
      
        對於 left[i], 再繼續遞歸看看還是否存在 right 部分，繼續在合併的過程中找逆序，找到逆序之後又合併消除逆序，然後。。。。遞歸。
    
    
    感覺上解法為：
    
        當合併排序法在合併左、右子矩陣時，如果左邊第 i 個位置的數值小於右邊第 j 個位置的數值時，
    
        要將 (j-1) 的數值加入第 i 個數值儲存 "Count of Smaller Numbers After Self" 的陣列中
