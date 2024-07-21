## 295\. Find Median from Data Stream

    Median is the middle value in an ordered integer list. 
    
    If the size of the list is even, there is no middle value. 
    
    So the median is the mean of the two middle value.
    
    Examples:
    
      [2,3,4] , the median is 3
    
      [2,3], the median is (2 + 3) / 2 = 2.5
    
    Design a data structure that supports the following two operations:
    
    void addNum(int num) - Add a integer number from the data stream to the data structure.
    double findMedian() - Return the median of all elements so far.
    
    
    For example:
    
      add(1)
      add(2)
      findMedian() -> 1.5
      add(3)
      findMedian() -> 2
    
--------------------------------------------------------------------------------------------

    Analysis
    
      First of all, it seems that the best time complexity we can get for this problem 
      
      is O(log(n)) of add() and O(1) of getMedian(). 
      
      This data structure seems highly likely to be a tree.
      
      We can use heap to solve this problem. 
      
      In Java, the PriorityQueue class is a priority heap. 
      
      We can use two heaps to store the lower half and the higher half of the data stream. 
      
      The size of the two heaps differs at most 1. 
    