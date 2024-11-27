package org.example;

public class Horse extends ChessPiece {

    public Horse(String color) {
        super(color);
    }

    public String getSymbol() {
        return "H";
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColum) {
        if ((line < 0 || line > 7 || column < 0 || column > 7 ||
                toLine < 0 || toLine > 7 || toColum < 0 || toColum > 7)) {
            return false;
        }

        int x = Math.abs(toLine - line);
        int y = Math.abs(toColum - column);

        return (x == 1 && y == 2) || (x == 2 && y == 1);

    }
}
