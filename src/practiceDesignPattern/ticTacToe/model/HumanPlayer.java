package practiceDesignPattern.ticTacToe.model;

import java.util.Scanner;

public class HumanPlayer extends Player{
    public Scanner scanner;
    public HumanPlayer(Character symbol, String name, int id, PlayerType playerType, Scanner scanner) {
        super(symbol, name, id, playerType);
        this.scanner = scanner;
    }

    @Override
    public Cell makeMove(Board board) {
        System.out.println(this.getName()+ ", Its's your turn to make the move, enter row and col ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        // validating row and col before assign the symbol
        while(!validateRowAndCol(row,col, board)){
            System.out.println(this.getName()+ ", Invalid move, please enter row and col again.");
            row = scanner.nextInt();
            col = scanner.nextInt();;
        }
        // It's a valid move.
        Cell cell = board.getBoard().get(row).get(col);
        cell.setCellState(CellState.FILLED);
        cell.setPlayer(this);
        return cell;
    }
    private boolean validateRowAndCol(int row, int col, Board board){
        if(row >= board.getDimension() || row< 0){
            return false;
        }
        if(col >= board.getDimension() || col <0){
            return false;
        }
        if(CellState.FILLED.equals(board.getBoard().get(row).get(col).getCellState())){
            return false;
        }
        return true;
    }
}
