package com.example.chess;

public class Rook extends Piece {
 public Rook(String color) {
     super(color);
 }

 @Override
 public boolean isValidMove(int startX, int startY, int endX, int endY, Chessboard board) {
     // Implement valid move logic for the rook
     // Check if the move is valid in a straight line (horizontal or vertical)
     // Check for obstructions and whether the destination is a valid square

     // Calculate the horizontal and vertical distances
     int horizontalDistance = Math.abs(endX - startX);
     int verticalDistance = Math.abs(endY - startY);

     // Check if the move is valid in a straight line (horizontal or vertical)
     boolean isStraightMove = (horizontalDistance == 0 && verticalDistance > 0) ||
                              (horizontalDistance > 0 && verticalDistance == 0);

     // Check for obstructions along the path of the move
     int dx = (endX - startX) > 0 ? 1 : ((endX - startX) < 0 ? -1 : 0);
     int dy = (endY - startY) > 0 ? 1 : ((endY - startY) < 0 ? -1 : 0);

     int x = startX + dx;
     int y = startY + dy;

     while (x != endX || y != endY) {
         if (board.getPiece(x, y) != null) {
             // There is an obstruction along the path
             return false;
         }
         x += dx;
         y += dy;
     }

     // The destination square must be empty or occupied by an opponent's piece
     Piece destinationPiece = board.getPiece(endX, endY);
     return isStraightMove && (destinationPiece == null || !destinationPiece.getColor().equals(getColor()));
 }
}

