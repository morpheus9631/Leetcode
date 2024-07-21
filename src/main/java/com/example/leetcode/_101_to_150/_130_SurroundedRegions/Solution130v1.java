package com.example.leetcode._101_to_150._130_SurroundedRegions;

import java.util.ArrayList;
import java.util.List;

public class Solution130v1 implements Solution130
{
  public void solve(char[][] board) 
  {
  	if (board == null)
  		throw new IllegalArgumentException("Illegal matrix...");
  	
  	int rows = board.length;
  	if(rows == 0) return;
  	
  	int cols = board[0].length;
  	if (cols == 0) return;
  	
  	boolean[][] checked = new boolean[rows][cols];
  	for (int i=0; i<rows; i++) {
  		for (int j=0; j<cols; j++) {
  			checked[i][j] = false;
  		}
  	}
  	
  	char targetChar = 'O';
  	char replacementChar = '#';
  	char passChar = 'X';

  	// 從第一列元素中有 'O' 開始 flood fill
  	for (int j=0; j<cols; j++) 
  	{
  		int i = 0;
  		if (board[i][j] == targetChar) {
  			checked[i][j] = true;  			
  		  BFS(board, i, j, targetChar, replacementChar, checked);
  		}
  	}

  	// 從最後一列元素中有 'O' 開始 flood fill 
  	for (int j=0; j<cols; j++) 
  	{
  		int i = rows - 1;
  		if (board[i][j] == targetChar) {
  			checked[i][j] = true;  			
  		  BFS(board, i, j, targetChar, replacementChar, checked);
  		}  		  
  	}
  	
  	// 從第一行元素中有 'O' 開始 flood fill 
  	for (int i=1; i<rows-1; i++) 
  	{
  		int j = 0;
  		if (board[i][j] == targetChar) {
  			checked[i][j] = true;  			
  		  BFS(board, i, j, targetChar, replacementChar, checked);
  		}
  	}

  	// 從最後一行元素中有 'O' 開始 flood fill 
  	for (int i=1; i<rows-1; i++) 
  	{
  		int j = cols - 1;
  		if (board[i][j] == targetChar) {
  			checked[i][j] = true;  			
    		BFS(board, i, j, targetChar, replacementChar, checked);
  		}
  	}

  	// 將沒有和邊連通的 'O' 轉成 'X', 並且把 '#' 轉回 'O'
  	for (int i=0; i<rows; i++) 
  	{
  		for (int j=0; j<cols; j++) 
  		{
  			if (board[i][j] == targetChar) 
  				board[i][j] = passChar;
  			else if (board[i][j] == replacementChar)
  				board[i][j] = targetChar;
  		}
  	}
  }
  
  private void BFS(char[][] board, int row, int col, 
  		             char targetChar, char replacementChar, boolean[][] checked)
  {
  	int rows = board.length;
  	int cols = board[0].length;

  	List<Elem> floodList = new ArrayList<Elem>();
  	floodList.add(new Elem(row, col, board[row][col]));

  	boolean isAdd = false;
  	int i = 0, j = 0;
  	while (!floodList.isEmpty())
  	{
  		Elem e = floodList.remove(0);

  		int ei = e.getRow(); 
  		int ej = e.getCol();
  		if (e.getData() == targetChar) board[ei][ej] = replacementChar;
  
  		i = ei - 1; j = ej;
  		isAdd = ((i >= 0) && (board[i][j] == targetChar));
  		if (isAdd) {
  			checked[i][j] = true;  			
  			floodList.add(new Elem(i, j, targetChar));
  		}
  		
  		i = ei + 1; j = ej;
  		isAdd = ((i < rows) && (board[i][j] == targetChar) && !checked[i][j]);
  		if (isAdd) {
  			checked[i][j] = true;  			
  			floodList.add(new Elem(i, j, targetChar));
  		}

  		i = ei; j = ej - 1;
  		isAdd = ((j >= 0) && (board[i][j] == targetChar));
    	if (isAdd) {
  			checked[i][j] = true;  			
    		floodList.add(new Elem(i, j, targetChar));
    	}

  		i = ei; j = ej + 1;
  		isAdd = ((j < cols) && (board[i][j] == targetChar));
  		if (isAdd) {
  			checked[i][j] = true;  			
  			floodList.add(new Elem(i, j, targetChar));
  		}
  	}
  }
  
  private class Elem
  {
  	int _Row = -1;
  	int _Col = -1;
  	char _Data = '\u0000';

  	public Elem(int x, int y, char ch)
  	{
  		this._Row = x; this._Col = y; this._Data = ch;
  	}
  	
  	public int getRow() { return this._Row; }
  	public int getCol() { return this._Col; }
  	public char getData() { return this._Data; }
  	
  	@SuppressWarnings("unused")
    public String showContents()
  	{
  		String format = "[%d, %d, \'%s\']";
  		return String.format(format, _Row, _Col, _Data);
  	}
  }
}