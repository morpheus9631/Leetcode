package com.example.leetcode._201_to_250._208_ImplementTrie;

/*
 * 208. Implement Trie (Prefix Tree)
 * 
 *    Implement a trie with insert, search, and startsWith methods.
 *    
 *    Note:
 *      
 *      You may assume that all inputs are consist of lowercase letters a-z. 
 */

public class Main208
{
  public static void main(String[] args)
  {
    System.out.println("208. Implement Trie (Prefix Tree)");
    
    String format = "\r\nSearch = \"%s\""        
                  + "\r\nIs it search? %b"
                  + "\r\nIs it prefix? %b"
                  ;
   
    Trie trie = new Trie();
    for (String word : _wordCases) trie.insert(word);
    showWords();
    
    for (String search : _searchCases)
    {
      boolean isSearch = trie.search(search);
      boolean isPrefix = trie.startsWith(search);
   
      System.out.println(
          String.format(format, search, isSearch, isPrefix));
    }
  }

  private static String[] _wordCases =
  {
    "something", "Trie", "search"   
  };

  private static String[] _searchCases = 
  {
      null                      // Expected: null
    , "a"                       // Expected: false
    , "something"
  };
  
  private static void showWords()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("\r\nWords:\r\n [");
    for (String word : _wordCases) {
      sb.append("\"").append(word).append("\", ");
    }
    int idx = sb.lastIndexOf(", ");
    sb.delete(idx, idx+2).append("]");
    System.out.println(sb.toString());
  }
}


