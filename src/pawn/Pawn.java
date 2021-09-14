package pawn;

import player.Alliance;

public class Pawn {

    private Alliance alliance;
    private int currentRow;
    private int currentColumn;

    public Pawn(int currentRow, int currentColumn, Alliance alliance){
        this.alliance = alliance; // setting the alliance on the board;
        this.currentRow = currentRow;
        this.currentColumn = currentColumn;
    }

    /**
     *  @author Efe Can Tepe
     *          This method is created for calculating the pawn moves on the board
     */
    public void calculateLegalPawnMoves(){

    }

    public int getCurrentRow(){
        return currentRow;
    }

    public int getCurrentColumn(){
        return currentColumn;
    }

    public Alliance getAlliance(){
        return alliance;
    }

}
