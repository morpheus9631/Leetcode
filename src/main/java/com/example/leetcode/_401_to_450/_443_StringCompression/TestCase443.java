package com.example.leetcode._401_to_450._443_StringCompression;

import java.util.Arrays;

public class TestCase443
{
  private char[] _Input  = null;
  private char[] _Output = null;
  private int _Answer = 0;
  
  public TestCase443(char[] in, char[] out, int ans)
  {
    this._Input  = in;
    this._Output = out;
    this._Answer = ans;
  }
  
  public char[] getInput()  { return this._Input;  } 
  public char[] getOutput() { return this._Output; } 
  public    int getAnswer() { return this._Answer; }
  
  public String toString()
  {
    StringBuffer sb = new StringBuffer();

    sb.append("{");
    sb.append("\r\n  Input: "     + Arrays.toString(this.getInput()));
    sb.append(",\r\n  Output: " + Arrays.toString(this.getOutput()));
    sb.append(",\r\n  Answer: " + String.valueOf(this.getAnswer()));
    sb.append("\r\n}");
    return sb.toString();
  }
}

