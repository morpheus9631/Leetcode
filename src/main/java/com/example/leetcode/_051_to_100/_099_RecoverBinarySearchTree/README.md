## 99\. Recover Binary Search Tree
    
    Two elements of a binary search tree (BST) are swapped by mistake.
    
    Recover the tree without changing its structure.
    
    Note:
    
      A solution using O(n) space is pretty straight forward. 
    
      Could you devise a constant space solution?

--------------------------------------------------------------------------------

    Solution:
    
        當有序二元樹的數字順序因其中 2 個數字互換造成錯誤時，有兩種情形：
        
        1.連續的 2 個數字順序錯誤:
            
            也就是在第 i 和 i+1 位置的數字順序錯誤, 將這 2 個數字直接對調即可。
          
        2.不連續的 2 個數字的順序錯誤:
        
            也就是在第 i 和 i+1 位置的數字順序錯誤, 以及第 j 和  j+1 位置的數字順序錯誤。
            
            此時需要將第 i 個位置和第 j+1 個位置的數字互換。
            
            
        舉例來說，假設正確的二元樹以中序尋訪的結果為 1234567, 其中 5 和 1 的位置錯誤，
        
        所以取得的數字順序為  5234167，也就是 i=0, i+1=1 和 j=3, j+1=4 位置的數字順序錯誤
        
        此時需要互換 i=0 和 j+1=4 的數字。
        
        所以解法為，從最左邊開始，一次取兩個數字做比較，如果發生第一個數字大於第二數字的情形，就記錄下來。
        
        第一次記錄 i 和 i+1 的位置，第二次僅將 i+1 位置改為 j+1 位置，最後再將 i 和 j+1 位置的數字互換。

