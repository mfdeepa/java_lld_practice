package practiceDesignPattern.ticTacToe.strategy;

import practiceDesignPattern.ticTacToe.model.Board;
import practiceDesignPattern.ticTacToe.model.Cell;

public interface BotPlayingStrategy {
    Cell makeMove(Board board);
}
