package com.example.chess;

public class Pawn extends Piece {
 public Pawn(String color) {
     super(color);
 }

 @Override
 public boolean isValidMove(int startX, int startY, int endX, int endY, Chessboard board) {
     // Implement valid move logic for the pawn
     // Check if the move is valid based on the pawn's color (direction)
     // Check for standard and capture moves

     int dx = endX - startX;
     int dy = endY - startY;

     // Determine the direction based on the pawn's color
     int direction = getColor().equalsIgnoreCase("White") ? 1 : -1;

     // Check for standard pawn move (1 square forward)
     boolean isStandardMove = dx == direction && dy == 0 && board.getPiece(endX, endY) == null;

     // Check for pawn's initial two-square move
     boolean isInitialMove = dx == 2 * direction && dy == 0 && startX == 1 && board.getPiece(endX, endY) == null;

     // Check for pawn capture move (diagonal capture)
     boolean isCaptureMove = Math.abs(dx) == 1 && dy == direction && board.getPiece(endX, endY) != null &&
                             !board.getPiece(endX, endY).getColor().equals(getColor());

     // A pawn can move forward by one square or two squares on its initial move,
     // or capture a piece diagonally forward.
     return isStandardMove || isInitialMove || isCaptureMove;
 }
}

