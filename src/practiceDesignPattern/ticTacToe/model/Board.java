package practiceDesignPattern.ticTacToe.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class Board {
    private int dimension;
    private List<List<Cell>> board;
    public Board(int dimension){
        this.dimension = dimension;
        this.board = new ArrayList<>();
        for(int i = 0; i<dimension; i++){
            board.add(new ArrayList<>());
            for(int j = 0; j<dimension; j++){
                board.get(i).add(new Cell(i,j));
            }
        }
    }

    public void printBoard(){
        for(List<Cell> row: board){
            for(Cell cell: row){
                cell.printCell();
            }
            System.out.println();
        }
    }
}
