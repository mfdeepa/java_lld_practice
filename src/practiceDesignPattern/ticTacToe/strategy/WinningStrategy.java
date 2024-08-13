package practiceDesignPattern.ticTacToe.strategy;

import practiceDesignPattern.ticTacToe.model.Board;
import practiceDesignPattern.ticTacToe.model.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);
    void handleUndo(Board board, Move lastMove);
}
