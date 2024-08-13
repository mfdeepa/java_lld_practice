package practiceDesignPattern.ticTacToe.controller;

import practiceDesignPattern.ticTacToe.exception.DuplicateSymbolForPlayer;
import practiceDesignPattern.ticTacToe.exception.MoreThanOneBotException;
import practiceDesignPattern.ticTacToe.exception.PlayersAndBoardCountMismatch;
import practiceDesignPattern.ticTacToe.model.Game;
import practiceDesignPattern.ticTacToe.model.Player;
import practiceDesignPattern.ticTacToe.strategy.WinningStrategy;

import java.util.List;

public class GameController {
    public Game createGame(int dimension, List<Player> playerList,
                           List<WinningStrategy> winningStrategyList)
            throws PlayersAndBoardCountMismatch, DuplicateSymbolForPlayer, MoreThanOneBotException {

        return Game.getBuilder()
                .setPlayers(playerList)
                .setDimension(dimension)
                .setWinningStrategies(winningStrategyList)
                .build();
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public void printBoard(Game game){

        game.printBoard();
    }


    public void undo(Game game) {

        game.undo();


    }

}
