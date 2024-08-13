package practiceDesignPattern.ticTacToe.model;


import lombok.Getter;
import lombok.Setter;
import practiceDesignPattern.ticTacToe.factories.BotPlayingStrategyFactory;
import practiceDesignPattern.ticTacToe.strategy.BotPlayingStrategy;
@Getter
@Setter
public class Bot extends Player{


    private DifficultyLevel difficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(Character symbol, String name, int id, PlayerType playerType, DifficultyLevel difficultyLevel){
        super(symbol, name, id, playerType);
        this.difficultyLevel = difficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(difficultyLevel);

    }

    @Override
    public Cell makeMove(Board board) {
        System.out.println("Bot is making the move ");
        Cell cell = botPlayingStrategy.makeMove(board);
        cell.setCellState(CellState.FILLED);
        cell.setPlayer(this);
        return cell;
    }

}
