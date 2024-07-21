package com.example.leetcode.utils;

import java.lang.reflect.Array;
import java.util.List;

public class myListUtils
{
  // ---------------------------------------------------------------------------
  @SuppressWarnings("unchecked")
  public static <T> T[] toArray(final List<T> list)
  {
    if (list == null || list.isEmpty()) return null;
    
    int size = list.size();

    Class<? extends T> cls = (Class<? extends T>) list.get(0).getClass();
    final T[] array = (T[]) Array.newInstance(cls, size);

    for(int i=0; i<size; i++) array[i] = list.get(i);
    
    return array;
  }
  
  // ---------------------------------------------------------------------------
  public static <T> int[] toIntArray(final List<T> list)
  {
    if (list == null || list.isEmpty()) return null;

    int size = list.size();
    int[] array = new int[size];
    for (int i=0; i<size; i++) {
      array[i] = Integer.parseInt(list.get(i).toString());
    }
    
    return array;
  }

  // ---------------------------------------------------------------------------
  @SuppressWarnings("unchecked")
  public static <T> T[][] toMartix(final List<List<T>> listList)
  {
    if (listList == null || listList.isEmpty()) return null;

    Class<? extends T> cls = (Class<? extends T>) listList.get(0).get(0).getClass();

    int rows = listList.size();
    T[][] matrix = (T[][]) Array.newInstance(cls, rows, 0);
    for (int i=0; i<rows; i++)
    {
      int cols = listList.get(i).size();
      matrix[i] = (T[]) Array.newInstance(cls, cols);
      for (int j=0; j<cols; j++) {
        matrix[i][j] = listList.get(i).get(j); 
      }
    }
    return matrix;
  }

  // ---------------------------------------------------------------------------
  public static <T> String toString(List<List<T>> listList)
  {
    if (listList == null) return null;
    if (listList.isEmpty()) return "[]";
    
    
    T obj = null;
    for (List<T> list : listList) 
    {
      if (list.isEmpty()) continue;
      obj = list.get(0);
      break;
    }
    
    StringBuilder sb1 = new StringBuilder("%s");
    if (obj instanceof java.lang.String)
      sb1.insert(0, "\"").append("\"");
    else if (obj instanceof java.lang.Character)
      sb1.insert(0, "'").append("'");
 
    String connectMark = ", "; 
    String format = sb1.append(connectMark).toString();
    
    String startMark = "[";
    String endMark = "]";
    StringBuilder sb2 = new StringBuilder();
    
    for (List<T> list : listList)
    {
      sb2.append("\r\n ").append(startMark);
      
      if (list.size() > 0)
      {
        for (T t : list) {
          sb2.append(String.format(format, t.toString()));
        }
        int idx = sb2.lastIndexOf(connectMark);
        sb2.delete(idx, idx+connectMark.length());
      }
      
      sb2.append(endMark).append(connectMark);
    }
    int idx = sb2.lastIndexOf(connectMark);
    sb2.delete(idx, idx+connectMark.length());
    
    sb2.insert(0, startMark).append("\r\n"+endMark);
    
    return sb2.toString();
  }
  
  // ---------------------------------------------------------------------------
  public static <T> String toRowString(List<T> list)
  {
    if (list == null) return null;
    if (list.isEmpty()) return "[]";
    
    T obj = list.get(0);
    
    StringBuilder sb1 = new StringBuilder("%s");
    if (obj instanceof java.lang.String)
      sb1.insert(0, "\"").append("\"");
    else if (obj instanceof java.lang.Character)
      sb1.insert(0, "'").append("'");
 
    String connectMark = ", "; 
    String format = sb1.append(connectMark).toString();
    
    String startMark = "[";
    String endMark = "]";
    StringBuilder sb2 = new StringBuilder();
    
    for (T t : list) sb2.append(String.format(format, t.toString()));
    
    int idx = sb2.lastIndexOf(connectMark);
    sb2.delete(idx, idx+connectMark.length());
    
    sb2.insert(0, startMark).append(endMark);
    
    return sb2.toString();
  }
  
  // ---------------------------------------------------------------------------
  public static ListNode toList(int[] nums)
  {
    if (nums == null || nums.length == 0) return null;
    
    int i = 0;
    ListNode head = new ListNode(nums[i++]);
    ListNode point = head;

    while (i < nums.length)
    {
      point.next = new ListNode(nums[i++]);
      point = point.next;
    }
    return head;
  }
  
  // --------------------------------------------------------------------------
  public static ListNode createList(int n)
  {
    if (n <= 0) return null;
    
    int[] nums = new int[n];
    for (int i=0; i<n; i++) nums[i] = i;
      
    return toList(nums);
  }

}
