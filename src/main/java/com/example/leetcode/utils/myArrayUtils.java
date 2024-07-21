package com.example.leetcode.utils;

import java.util.Arrays;

public class myArrayUtils
{
  public static <T> boolean contains(final T[] array, final T target) 
  {
    if (target == null)
    {
      for (final T e : array) {
        if (e == null) return true;
      }
    }
    else
    {
      for (final T e : array) {
        if (e == target || target.equals(e)) return true;
      }
    }  
    
    return false;
  }
    
  public static boolean contains(final int[] array, final int target) 
  {  
    Arrays.sort(array);  
    return Arrays.binarySearch(array, target) != -1;  
  }  
  
  // ---------------------------------------------------------------------------
  public static <T> String toString(final T[] array)
  {
    if (array == null) return null;
    if (array.length == 0) return "[]";

    StringBuilder sb1 = new StringBuilder("%s");
        
    T obj = array[0];
    if (obj instanceof java.lang.Character) 
      sb1.insert(0, "'").append("'");
    else if (obj instanceof java.lang.String)
      sb1.insert(0, "\"").append("\"");
    
    String connectMark = ", ";
    String format = sb1.append(connectMark).toString();

    StringBuilder sb2 = new StringBuilder();
    for (T t : array) {
      sb2.append(String.format(format, t.toString()));
    }
    
    int idx = sb2.lastIndexOf(connectMark);
    sb2.delete(idx, idx+connectMark.length());

    sb2.insert(0, "[").append("]");

    return sb2.toString();
  }

  // ---------------------------------------------------------------------------
  public static String toString(final int[] array)
  {
    if (array == null || array.length == 0) return null;
    
    int len = array.length;
    Integer[] IntegerArray = new Integer[len];
    for (int i=0; i<len; i++) {
      IntegerArray[i] = Integer.valueOf(array[i]);
    }
    
    return toString(IntegerArray);
  }

  // ---------------------------------------------------------------------------
  public static <T> String toString(final T[][] matrix, String connectMark, 
      boolean isQuoted)
  {
    if (matrix == null || matrix[0].length == 0) return null;

    T obj = null;
    int max_len = 0;
    for (T[] array : matrix) 
    {
      for (T t : array) 
      {
        if (t == null) continue;
        if (obj == null) obj = t; 
          
        int len = String.valueOf(t).length();
        if (len > max_len) max_len = len;
      }
    }

    StringBuilder sb1 = new StringBuilder("%s");
    if (max_len > 0) sb1.insert(1, String.valueOf(max_len));
    if (isQuoted)
    {
      if (obj instanceof java.lang.Character)
        sb1.insert(0, "'").append("'");
      else if (obj instanceof java.lang.String)
        sb1.insert(0,  "\"").append("\"");
    }
    String format = sb1.append(connectMark).toString();
    
    String startMark = "[";
    String endMark = "]";
    
    StringBuilder sb2 = new StringBuilder();
    for (T[] array : matrix) 
    {
      sb2.append("\r\n ").append(startMark);
      for (T t : array) {
        sb2.append(String.format(format, t.toString()));
      }
      int idx = sb2.lastIndexOf(connectMark);
      sb2.delete(idx, idx+connectMark.length());
      
      sb2.append(endMark).append(connectMark);
    }
    int idx = sb2.lastIndexOf(connectMark);
    sb2.delete(idx, idx+connectMark.length());
    
    sb2.insert(0, "[").append("\r\n]");

    return sb2.toString();
  }

  // ---------------------------------------------------------------------------
  public static <T> String toString(final T[][] matrix)
  {
    return toString(matrix, ", ", true);
  }

  public static <T> String toRowString(final T[][] matrix)
  {
    String outstr = toString(matrix, ", ", true)
                   .replace("\r\n ", "").replaceAll("\r\n", "");
    return outstr;
  }
  
  // ---------------------------------------------------------------------------
  public static String toString(final int[][] matrix)
  {
    if (matrix == null || matrix.length == 0) return null;
    
    int rows = matrix.length;
    int cols = matrix[0].length;
    
    Integer[][] IntegerMatrix = new Integer[rows][cols];
    for (int i=0; i<rows; i++) {
      for (int j=0; j<cols; j++) {
        IntegerMatrix[i][j] = Integer.valueOf(matrix[i][j]);
      }
    }
    return toString(IntegerMatrix, ", ", true);
  }

  public static String toRowString(final int[][] matrix)
  {
    String outstr = toString(matrix)
                   .replace("\r\n ", "").replaceAll("\r\n", "");
    return outstr;
  }
  
  // ---------------------------------------------------------------------------
  public static String toString(final char[][] matrix)
  {
    if (matrix == null || matrix.length == 0) return null;
    
    int rows = matrix.length;
    int cols = matrix[0].length;
    
    Character[][] charMatrix = new Character[rows][cols];
    for (int i=0; i<rows; i++) {
      for (int j=0; j<cols; j++) {
        charMatrix[i][j] = Character.valueOf(matrix[i][j]);
      }
    }
    return toString(charMatrix, " ", false);
  }
  
  // ---------------------------------------------------------------------------
  
}
