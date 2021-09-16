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
     *
     *          TODO: Include special cases on the board.
     */
    public void calculateLegalPawnMoves(){
        List<Move> legalPawnMoves = new ArrayList<Move>();

        if(currentTile.getUpTile() != null){
            legalPawnMoves.add(new Move(currentTile, currentTile.getUpTile()));
        }

        if(currentTile.getLeftTile() != null){
            legalPawnMoves.add(new Move(currentTile, currentTile.getLeftTile()));
        }

        if(currentTile.getRightTile() != null){
            legalPawnMoves.add(new Move(currentTile, currentTile.getRightTile()));
        }

        if(currentTile.getDownTile() != null){
            legalPawnMoves.add(new Move(currentTile, currentTile.getDownTile()));
        }
        pawnMoves = legalPawnMoves;
    }

    public Board executeMove(final Move executedMove){
        calculateLegalPawnMoves();
        for(Move move : pawnMoves){
            if(move.equals(executedMove)){
                Tile destinationTileHolder = executedMove.getDestinationTile();
                Tile currentTileHolder = executedMove.getCurrentTile();
                board.getGameBoard()[destinationTileHolder.getRow()][destinationTileHolder.getColumn()].
                        setPawnOnTheTile(currentTileHolder.getPawnOnTheTile());

                board.getGameBoard()[currentTileHolder.getRow()][currentTileHolder.getColumn()].
                        setPawnOnTheTile(null);

                System.exit(3);
                break;
            }
        }
        return board;
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
