## 335\. Self Crossing

    You are given an array x of n positive numbers. 
    
    You start at point (0,0) and moves x[0] metres to the north, 
    
    then x[1] metres to the west, x[2] metres to the south, x[3] metres to the east and so on. 
    
    In other words, after each move your direction changes counter-clockwise.
    
    Write a one-pass algorithm with O(1) extra space to determine, if your path crosses itself, or not.
    
    Example 1:
    
        Given x = [2, 1, 1, 2],
          
          ┌───┐
          │   │
          └───┼──>
              │
            
        Return true (self crossing)
      
    Example 2:
    
        Given x = [1, 2, 3, 4],
        
          ┌──────┐
          │      │
          └────────────>
          
        Return false (not self crossing)
      
    Example 3:
    
        Given x = [1, 1, 1, 1],
        
          ┌───┐
          │   │
          └───┼>
          
        Return true (self crossing)

--------------------------------------------------------------------------------    
    
    Solutions:
    
        四邊的情形：
        
               [i-2]
              ┌─────┐
          [i-1] │     │[i-3]
              └───> │
               [i]
              
          1.當 [i-1] <= [i-3] && [i] >= [i-2] 就會有相交的情形。
          2.當 [i-1] >  [i-1] 時，則恆為 false
        
        
        五邊的情形：
        
                [i-3]
               ┌──────┐
          [i-2]│    [i-4] ^ [i]
               │      │   │
               └──────────┘ 
                 [i-1]
              
          1.當 [i-1] < [i-3] && [i] >= [i-2] 時會有相交的情形。
          2.當 [i-1] = [i-3] && [i] >= [i-2]-[i-4] 時會有相交的情形。
          3.當 [i-1] > [i-3] 時恆為 false
        
        
        六邊的情形：
        
                        [i] 
                      <────┐
                 [i-4]     │
                ┌──────┐   │
                │    [i-5] │ [i-1]
           [i-3]│      │   │
                └──────────┘ 
                  [i-2]
              
          1.當 [i-1] <  [i-3]-[i-5] && [i] >= [i-2] 時會有相交的情形。
          2.當 [i-1] >= [i-3]-[i-5] && [i-1] <= [i-3] && [i] >= [i-2]-[i-4] 時會有相交的情形。
          3.當 [i-1] >  [i-3] 時恆為 false
        
        
        七邊的情形：
        
                  [i-1] 
              ┌─────────────┐
           [i]│   [i-5]     │
              ↓  ┌──────┐   │
                 │    [i-6] │ [i-2]
            [i-4]│      │   │
                 └──────────┘ 
                     [i-3]
              
          1.當 [i-1] <  [i-3]-[i-5] && [i] >= [i-2] 時會有相交的情形。
          2.當 [i-1] >= [i-3]-[i-5] && [i-1] <= [i-3] && [i] >= [i-2]-[i-4] 時會有相交的情形。
          3.當 [i-1] >  [i-3] 時恆為 false
          
        
        由此可知，當邊大於七個時，會相交與否的情形和六邊時一樣，所以寫到六邊就可以了
        
        然而，上述的方法僅適用於遞增，對於遞減的情形則不適用，為了應付 leetcode，所以加上了 (x[i-2] > x[i-4])，但不是正解
    
