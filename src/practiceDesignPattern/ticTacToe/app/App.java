package practiceDesignPattern.ticTacToe.app;

import practiceDesignPattern.ticTacToe.controller.GameController;
import practiceDesignPattern.ticTacToe.exception.DuplicateSymbolForPlayer;
import practiceDesignPattern.ticTacToe.exception.MoreThanOneBotException;
import practiceDesignPattern.ticTacToe.exception.PlayersAndBoardCountMismatch;
import practiceDesignPattern.ticTacToe.model.*;
import practiceDesignPattern.ticTacToe.strategy.ColWinningStrategy;
import practiceDesignPattern.ticTacToe.strategy.DiagonalWinningStrategy;
import practiceDesignPattern.ticTacToe.strategy.RowWinningStrategy;
import practiceDesignPattern.ticTacToe.strategy.WinningStrategy;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws PlayersAndBoardCountMismatch, DuplicateSymbolForPlayer, MoreThanOneBotException {

        GameController gameController = new GameController();
        Scanner scanner = new Scanner(System.in);

        int dimension = 3;
        ArrayList<Player> players = new ArrayList<>();

        players.add(new HumanPlayer('X', "Deepa", 1, PlayerType.HUMAN,scanner));
        players.add(new HumanPlayer('0', "Vidit", 2, PlayerType.HUMAN,scanner));
//        players.add(new Bot('0', "GPT", 2, PlayerType.BOT, DifficultyLevel.EASY));

        ArrayList<WinningStrategy> winningStrategies = new ArrayList<>();
        winningStrategies.add(new RowWinningStrategy());
        winningStrategies.add(new ColWinningStrategy());
        winningStrategies.add(new DiagonalWinningStrategy());

        Game game = gameController.createGame(dimension, players, winningStrategies);


        while(GameState.IN_PROG.equals(game.getGameState())) {
            gameController.printBoard(game);

            // if somebody wants to make an undo

            System.out.println("Does anyone want to undo ? (y/n");
            String undo = scanner.next();

            if(undo.equalsIgnoreCase("y")){
                gameController.undo(game);
                continue;
            }

            gameController.makeMove(game);
        }

        if(GameState.CONCLUDED.equals(game.getGameState())){
            System.out.println(game.getWinner().getName()+" Has won the game");
        }
        if(GameState.DRAW.equals(game.getGameState())){
            System.out.println("It's a draw");
        }

    }
}
