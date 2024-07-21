package com.example.leetcode._051_to_100._058_LengthOfLastWord;

/*
 * Your runtime beats 50.81% of java submissions.
 */

public class Solution058v2 implements Solution058
{
  public int lengthOfLastWord(String s) 
  {
    int idx = s.length() - 1;

    // �q�r����ݦV�e��Ĥ@�Ӥ��O ' ' ���r��
    while (idx >= 0 && s.charAt(idx) == ' ') idx--;

    // �p�G�䤣��r���h�^�� 0
    if (idx < 0) return 0;  
    int tmp = idx;

    // �q�r����ݦV�e��Ĥ@��  ' '
    while (idx >= 0 && s.charAt(idx) != ' ') idx--;

    return tmp - idx;
  }
}