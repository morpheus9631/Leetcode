package com.example.leetcode._201_to_250._208_ImplementTrie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode
{
  char ch = '\u0000';
  
  boolean isWord = false;
  
  Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
  
  // Initialize your data structure here.
  public TrieNode() { };
  
  public TrieNode(char ch) {
    this.ch = ch;
  }
}
