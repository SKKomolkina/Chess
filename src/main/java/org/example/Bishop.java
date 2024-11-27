package org.example;

public class Bishop extends ChessPiece {

    public Bishop(String color) {
        super(color);
    }

    public String getSymbol() {
        return "B";
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColum) {
        if (line < 0 || line > 7 || column < 0 || column > 7 || toLine < 0 || toLine > 7 || toColum < 0 || toColum > 7) {
            return false;
        }

        int x = Math.abs(toLine - line);
        int y = Math.abs(toColum - column);

        if (x != y) {
            return false;
        }

        return chessBoard.isPathClear(line, column, toLine, toColum);
    }
}
