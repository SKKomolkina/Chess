package org.example;

public class Pawn extends ChessPiece {

    public Pawn(String color) {
        super(color);
    }

    public String getSymbol() {
        return "P";
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColum) {
        if ((line < 0 || line > 7 || column < 0 || column > 7 ||
                toLine < 0 || toLine > 7 || toColum < 0 || toColum > 7)) {
            return false;
        }

        int direction = color.equals("White") ? 1 : -1;

        if (toLine == line + direction && toColum == column) {
            return true;
        }

        return line == (color.equals("White") ? 1 : 6) && toLine == line + 2 * direction && toColum == column;

    }
}
