package com.example.chess;

//Chessboard.java
public class Chessboard {
 private final Piece[][] board;

 public Chessboard() {
     board = new Piece[8][8];
     initializeBoard();
 }

 // Initialize the chessboard with pieces in their starting positions
 private void initializeBoard() {
     // Initialize pawns
     for (int i = 0; i < 8; i++) {
         board[1][i] = new Pawn("White");
         board[6][i] = new Pawn("Black");
     }

     // Initialize rooks
     board[0][0] = new Rook("White");
     board[0][7] = new Rook("White");
     board[7][0] = new Rook("Black");
     board[7][7] = new Rook("Black");

     // Initialize knights
     board[0][1] = new Knight("White");
     board[0][6] = new Knight("White");
     board[7][1] = new Knight("Black");
     board[7][6] = new Knight("Black");

     // Initialize bishops
     board[0][2] = new Bishop("White");
     board[0][5] = new Bishop("White");
     board[7][2] = new Bishop("Black");
     board[7][5] = new Bishop("Black");

     // Initialize queens
     board[0][3] = new Queen("White");
     board[7][3] = new Queen("Black");

     // Initialize kings
     board[0][4] = new King("White");
     board[7][4] = new King("Black");
 }

 public Piece getPiece(int x, int y) {
     return board[x][y];
 }

 public void setPiece(int x, int y, Piece piece) {
     board[x][y] = piece;
 }

}


