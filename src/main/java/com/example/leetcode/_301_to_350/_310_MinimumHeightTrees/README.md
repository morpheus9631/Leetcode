## 310\. Minimum Height Trees

    For a undirected graph with tree characteristics, we can choose any node as the root. 
    
    The result graph is then a rooted tree. 
    
    Among all possible rooted trees, those with minimum height are called minimum height trees (MHTs). 
    
    Given such a graph, write a function to find all the MHTs and return a list of their root labels.
    
    Format
    
    The graph contains n nodes which are labeled from 0 to n - 1. 
    
    You will be given the number n and a list of undirected edges (each edge is a pair of labels).
    
    You can assume that no duplicate edges will appear in edges. 
    
    Since all edges are undirected, [0, 1] is the same as [1, 0] and thus will not appear together in edges.
    

    Example 1:

        Given n = 4, edges = [[1, 0], [1, 2], [1, 3]]
        
              0
              |
              1
             / \
            2   3
          
        return [1]
      
      
    Example 2:

        Given n = 6, edges = [[0, 3], [1, 3], [2, 3], [4, 3], [5, 4]]
        
           0  1  2
            \ | /
              3
              |
              4
              |
              5
            
        return [3, 4] 

--------------------------------------------------------------------------------        
        
    Solution：
    
        從葉子節點開始進行 BFS，相連邊數為 1 的頂點即為葉子節點。找高度最小的節點，即找離所有葉子節點最遠的節點，也即找最中心的節點。
        
        其實作方法為：
        
        每次去掉當前圖的所有葉子節點，重複此操作直到只剩下最後的根。
        
        根據這個思路可以回答題目中的 [ hint : How many MHTs can a graph have at most? ]，
        
        只能有一個或者兩個最小高度樹樹根。
        
  
  