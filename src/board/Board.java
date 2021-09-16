package board;

import pawn.Pawn;
import player.Alliance;

public class Board {

    private static final int START_WHITE_ROW = 0;
    private static final int START_WHITE_COLUMN = 4;
    private static final int START_BLACK_ROW = 8;
    private static final int START_BLACK_COLUMN = 4;

    private Pawn blackPawn;
    private Pawn whitePawn;

    private Tile[][] gameBoard;

    public Board(){
        createBoard();
    }


    private void createBoard(){
        gameBoard = new Tile[BoardUtils.HEIGHT_TILES][BoardUtils.ROW_TILES];
        arrangeTilesOnBoard();
        connectTilesOnTheBoard(); // Making the graph
        createPiecesOnTheBoard(); // Creating the pieces on the board
    }

    private void arrangeTilesOnBoard(){
        for(int a = 0; a < BoardUtils.ROW_TILES; a++){

            for(int b = 0; b < BoardUtils.HEIGHT_TILES; b++){
                gameBoard[a][b] = new Tile(a,b);
            }
        }
    }

    /**
     *  Connecting all the tiles it.(Converting disjoint tiles into graph to )
     */
    private void connectTilesOnTheBoard(){
        for(int a = 0; a < BoardUtils.ROW_TILES - 1; a++){
            for(int b = 0; b < BoardUtils.HEIGHT_TILES - 1; b++){
                Tile holder = gameBoard[a][b];
                Tile right = gameBoard[a][b + 1];
                Tile up = gameBoard[a + 1][b];
                holder.setRightTile(right);
                right.setLeftTile(holder);
                holder.setUpTile(up);
                up.setDownTile(holder);
            }
        }
    }

    private void createPiecesOnTheBoard(){
        Tile initialBlackTile = gameBoard[START_BLACK_ROW][START_BLACK_COLUMN];
        Tile initialWhiteTile = gameBoard[START_WHITE_ROW][START_WHITE_COLUMN];

        blackPawn = new Pawn(initialBlackTile, Alliance.BLACK, this);
        whitePawn = new Pawn(initialWhiteTile, Alliance.WHITE, this);
        initialBlackTile.setPawnOnTheTile(blackPawn);
        initialWhiteTile.setPawnOnTheTile(whitePawn);
    }

    public Pawn  getBlackPawn(){
        return blackPawn;
    }

    public Pawn getWhitePawn(){
        return whitePawn;
    }

    public Tile[][] getGameBoard(){
        return gameBoard;
    }

    public void setWhitePawn(final Pawn pawn){
        whitePawn = pawn;
    }

    public void setBlackPawn(final Pawn pawn){
        blackPawn = pawn;
    }
}
