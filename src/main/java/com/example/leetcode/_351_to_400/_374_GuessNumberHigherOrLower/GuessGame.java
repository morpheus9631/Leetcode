package com.example.leetcode._351_to_400._374_GuessNumberHigherOrLower;

public class GuessGame
{
  protected int _Ans = -1;

  public void setAnswer(int n) { this._Ans = n; }
  
  public int guess(int n)
  {
    return ((n > this._Ans) ? -1 : ((n < this._Ans) ? 1 : 0));
  }
}
