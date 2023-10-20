package com.example.chess;

public class Knight extends Piece {
 public Knight(String color) {
     super(color);
 }

 @Override
 public boolean isValidMove(int startX, int startY, int endX, int endY, Chessboard board) {
     // Implement valid move logic for the knight
     // Check if the move follows the L-shaped pattern of the knight
     // Check whether the destination is a valid square

     int horizontalDistance = Math.abs(endX - startX);
     int verticalDistance = Math.abs(endY - startY);

     // Check if the move follows the L-shaped pattern of the knight (2 squares in one direction, 1 square in another)
     boolean isLShapedMove = (horizontalDistance == 2 && verticalDistance == 1) ||
                             (horizontalDistance == 1 && verticalDistance == 2);

     // The destination square must be empty or occupied by an opponent's piece
     Piece destinationPiece = board.getPiece(endX, endY);
     return isLShapedMove && (destinationPiece == null || !destinationPiece.getColor().equals(getColor()));
 }
}

