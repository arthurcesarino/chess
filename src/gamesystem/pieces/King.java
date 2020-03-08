package gamesystem.pieces;

import boardgame.Board;
import gamesystem.ChessPiece;
import gamesystem.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
