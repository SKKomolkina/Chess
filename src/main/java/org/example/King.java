package org.example;

public class King extends ChessPiece {
    public boolean hadMoving = false;

    public King(String color) {
        super(color);
    }

    public String getSymbol() {
        return "K";
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColum) {
        if ((line < 0 || line > 7 || column < 0 || column > 7 ||
                toLine < 0 || toLine > 7 || toColum < 0 || toColum > 7)) {
            return false;
        }

        if (line == toLine && column == toColum) {
            return false;
        }

        return (Math.abs(line - toLine) <= 1 && Math.abs(column - toColum) <= 1);
    }

    public boolean isUnderAttack(ChessBoard board, int line, int column) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board.board[i][j] != null && !board.board[i][j].getColor().equals(this.color)) {
                    if (board.board[i][j].canMoveToPosition(board, i, j, line, column)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
