package practiceDesignPattern.ticTacToe.factories;

import practiceDesignPattern.ticTacToe.model.DifficultyLevel;
import practiceDesignPattern.ticTacToe.strategy.BotPlayingStrategy;
import practiceDesignPattern.ticTacToe.strategy.EasyBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(DifficultyLevel difficultyLevel) {
        return new EasyBotPlayingStrategy();
    }
}
