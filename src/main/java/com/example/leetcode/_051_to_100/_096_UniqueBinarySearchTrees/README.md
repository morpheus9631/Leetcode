## 96\. Unique Binary Search Trees

    Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

    For example,
      
      Given n = 3, there are a total of 5 unique BST's.

           1         3     3      2      1
            \       /     /      / \      \
             3     2     1      1   3      2
            /     /       \                 \
           2     1         2                 3

-----------------------------------------------------------------------------------------------

  Solution: 

    卡特蘭樹：
    
    一個節點作為根節點，所有可能性 = 左邊的節點數 * 右邊的節點數。
    
    f(k) = f(k) * f(n-1-k)
      
    其中，f(k) 表示根節點左子樹有 k 個節點，f(n-1-k) 表示右子樹有n-1-k個節點。
    
    f(n) = f(0)*f(n-1) + f(1)*f(n-2) + f(2)*f(n-3) + ... + f(n-2)*f(1) + f(n-1)*f(0)
    
      = 2*f(n-1) + f(1)*f(n-2) + f(2)*f(n-3) + ... + f(n-2)*f(1)
    