package pawn;

import board.Board;
import board.Tile;
import move.Move;
import player.Alliance;

import java.util.ArrayList;
import java.util.List;

public class Pawn {

    private Tile currentTile;
    private List<Move> pawnMoves;
    private Board board;
    private Alliance alliance;

    public Pawn(final Tile currentTile, final Alliance alliance, final Board board){
        this.board = board;
        this.alliance = alliance; // setting the alliance on the board;
        this.currentTile = currentTile;
    }

    /**
     *  @author Efe Can Tepe
     *          This method is created for calculating the pawn moves on the board
     */
    public void calculateLegalPawnMoves(){
        List<Move> legalPawnMoves = new ArrayList<Move>();



    }

    public void setCurrentTile(final Tile currentTile){
        this.currentTile = currentTile;
    }

    public Tile getCurrentTile(){
        return currentTile;
    }


    public Alliance getAlliance(){
        return alliance;
    }

}
