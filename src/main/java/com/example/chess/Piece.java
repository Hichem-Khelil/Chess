package com.example.chess;

public abstract class Piece {
	 private final String color;
	 
	 public Piece(String color) {
	     this.color = color;
	 }
	 
	 public abstract boolean isValidMove(int startX, int startY, int endX, int endY, Chessboard board);
	 
	 // Getter and setter methods for color
	 public String getColor() {
	     return color;
	 }
	 
	}
