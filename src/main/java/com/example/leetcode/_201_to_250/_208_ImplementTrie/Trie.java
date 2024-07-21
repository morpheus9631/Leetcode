package com.example.leetcode._201_to_250._208_ImplementTrie;

import java.util.Map;

public class Trie 
{
  private TrieNode root;

  /** Initialize your data structure here. */
  public Trie() 
  {
    root = new TrieNode();
  }
  
  /** Inserts a word into the trie. */
  public void insert(String word) 
  {
    Map<Character, TrieNode> children = root.children;  
  
    for(int i=0; i<word.length(); i++) 
    {  
      char ch = word.charAt(i);  

      if (!children.containsKey(ch))
        children.put(ch, new TrieNode(ch));
      
      TrieNode t = children.get(ch);
      children = t.children;

      if(i == word.length()-1) t.isWord = true;
    }    
  }

  /** Returns if the word is in the trie. */
  public boolean search(String word) 
  {
    if (word == null || word.length() == 0) return false;
      
    TrieNode t = root;

    for (int i=0; i<word.length(); i++)
    {
      char ch = word.charAt(i);
      if (!t.children.containsKey(ch)) return false;
      t = t.children.get(ch);
    }
    
    return (t == null || t.isWord == true);
  }

  /** Returns if there is any word in the trie that starts with the given prefix. */
  public boolean startsWith(String prefix) 
  {
    if (prefix == null || prefix.length() == 0) return false;
    
    TrieNode t = root;

    for (int i=0; i<prefix.length(); i++)
    {
      char ch = prefix.charAt(i);
      if (!t.children.containsKey(ch)) return false;
      t = t.children.get(ch);
    }
    
    return (t != null);
  }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
