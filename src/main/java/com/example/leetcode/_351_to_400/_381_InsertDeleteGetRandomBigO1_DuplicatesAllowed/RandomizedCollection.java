package com.example.leetcode._351_to_400._381_InsertDeleteGetRandomBigO1_DuplicatesAllowed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RandomizedCollection 
{
  private Map<Integer, List<Integer>> _Map = null;
  
  List<Integer> elemList = new ArrayList<Integer>();

  /** Initialize your data structure here. */
  public RandomizedCollection() {
     _Map = new HashMap<Integer, List<Integer>>();
  }
  
  /** Inserts a value to the collection. 
   *  Returns true if the collection did not already contain the specified element. 
   */
  public boolean insert(int val) 
  {
    boolean isContain = _Map.containsKey(val); 

    if (!isContain) _Map.put(val, new ArrayList<Integer>());
    _Map.get(val).add(val);
    elemList.add(val);

    return !isContain; 
  }
  
  /** Removes a value from the collection. 
   *  Returns true if the collection contained the specified element. 
   */
  public boolean remove(int val) 
  {
    if (_Map.containsKey(val) && _Map.get(val).size() > 0)
    {
      _Map.get(val).remove(Integer.valueOf(val));
      elemList.remove(Integer.valueOf(val));
      return true;
    }
    else
      return false;
  }
  
  /** Get a random element from the collection. */
  public int getRandom() 
  {
    int rand = (int) (Math.random() * elemList.size());
    return elemList.get(rand);
  }
}

/**
* Your RandomizedCollection object will be instantiated and called as such:
* RandomizedCollection obj = new RandomizedCollection();
* boolean param_1 = obj.insert(val);
* boolean param_2 = obj.remove(val);
* int param_3 = obj.getRandom();
*/