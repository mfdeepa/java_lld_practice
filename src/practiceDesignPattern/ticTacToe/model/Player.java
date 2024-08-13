package practiceDesignPattern.ticTacToe.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Player {
    private Character symbol;
    private String name;
    private int id;
    private PlayerType playerType;

    public abstract Cell makeMove(Board board);
    public Player(Character symbol, String name, int id, PlayerType playerType) {
        this.symbol = symbol;
        this.name = name;
        this.id = id;
        this.playerType = playerType;
    }

}
