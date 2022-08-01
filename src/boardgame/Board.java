package boardgame;

public class Board {
    private int row;
    private int columns;
    private Piece[][] pieces;


    public Board(int row, int columns) {
        this.row = row;
        this.columns = columns;
        pieces = new Piece[row][columns];
    }

    public int getRow() {
        return row;
    }

    public int getColumns() {
        return columns;
    }

    public Piece piece(int row, int columns){
        return pieces[row][columns];
    }

    public Piece piece(Position position){
        return pieces[position.getRow()][position.getColumn()];
    }
}
