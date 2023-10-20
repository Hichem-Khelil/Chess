package com.example.chess;


public class King extends Piece {
 public King(String color) {
     super(color);
 }

 @Override
 public boolean isValidMove(int startX, int startY, int endX, int endY, Chessboard board) {
     // Implement valid move logic for the king
     // Check if the move is within one square in any direction
     // Check for obstructions and whether the destination is a valid square
     
     // Check if the move is within one square horizontally or vertically
     boolean isHorizontalMove = Math.abs(endX - startX) == 1 && endY == startY;
     boolean isVerticalMove = Math.abs(endY - startY) == 1 && endX == startX;
     
     // Check if the move is within one square diagonally
     boolean isDiagonalMove = Math.abs(endX - startX) == 1 && Math.abs(endY - startY) == 1;
     
     // The destination square must be empty or occupied by an opponent's piece
     Piece destinationPiece = board.getPiece(endX, endY);
     return (isHorizontalMove || isVerticalMove || isDiagonalMove) && 
            (destinationPiece == null || !destinationPiece.getColor().equals(getColor()));
 }
}

