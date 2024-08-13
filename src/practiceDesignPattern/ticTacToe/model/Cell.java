package practiceDesignPattern.ticTacToe.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cell {
    int row;
    int col;
    private CellState cellState;
    private Player player;
    public Cell(int row, int col){
        this.row = row;
        this.col = col;
        this.cellState = CellState.EMPTY;
    }

    public void printCell(){
        if(cellState.equals(CellState.FILLED)){
            System.out.println("| "+ player.getSymbol() + " |");
        }
        else{
            System.out.println("| - |");
        }

        /*
        | x || - || - |
        | 0 || - || - |
        | 0 || - || - |
         */
    }

}
