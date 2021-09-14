package game;

import board.Board;
import pawn.Pawn;
import player.Alliance;
import player.Player;

public class Game {

    private Player whitePlayer;
    private Player blackPlayer;
    private Board board;
    private Pawn whitePawn;
    private Pawn blackPawn;

    public Game(){
        this.board = new Board();
        this.whitePawn = board.getWhitePawn();
        this.blackPawn = board.getBlackPawn();
        whitePlayer = new Player("White Player", whitePawn, Alliance.WHITE);
        blackPlayer = new Player("Black Player", blackPawn, Alliance.BLACK);
    }

}
