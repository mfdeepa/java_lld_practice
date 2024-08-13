package practiceDesignPattern.ticTacToe.strategy;

import practiceDesignPattern.ticTacToe.model.Board;
import practiceDesignPattern.ticTacToe.model.Cell;
import practiceDesignPattern.ticTacToe.model.CellState;

import java.util.List;

public class MediumBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Cell makeMove(Board board) {
        for(List<Cell> row: board.getBoard()){
            for(Cell cell: row){
                if(CellState.EMPTY.equals(cell.getCellState())){
                    return cell;
                }
            }

        }
        return null;
    }
}
