package ascii;

import board.Board;
import board.Tile;
import move.Move;
import player.Alliance;

import java.util.Scanner;

/**
 *  @author Efe Can Tepe
 *          This class is created for testing the code so for on the ASCII code.
 *
 */
public class ASCII {

    public ASCII(){
        start();
    }

    public static void main(String [] args){
        new ASCII();
    }

    private static void start(){
        Scanner scan = new Scanner(System.in);
        Board board = new Board();

        Alliance alliance = Alliance.WHITE;

        drawBoard(board);

        // For testing I use the while(true)
        while(true){
            System.out.println("Destination Row");
            int destinationRow = scan.nextInt();
            System.out.println("Destination Column");
            int destinationColumn = scan.nextInt();
            Tile destinationTile = new Tile(destinationRow, destinationColumn);

            if(alliance == Alliance.WHITE){
                System.out.println("White Alliance");
                board = board.getWhitePawn().executeMove(new Move(board.getWhitePawn().getCurrentTile(), destinationTile));
                alliance = alliance.getOpposite();
            }

            else if(alliance == Alliance.BLACK){
                System.out.println("Black Alliance");
                board = board.getBlackPawn().executeMove(new Move(board.getBlackPawn().getCurrentTile(), destinationTile));
                alliance = alliance.getOpposite();
            }
            drawBoard(board);
        }

    }

    private static void drawBoard(Board board){
        Tile[][] holder = board.getGameBoard();

        for(int a = 8; a >= 0; a--){
            for(int b = 0; b < 9; b++){

                if(holder[a][b].getPawnOnTheTile() != null){

                    String rep = holder[a][b].getPawnOnTheTile().getAlliance() == Alliance.BLACK ? "x" : "X";
                    System.out.printf("%3s", rep);
                }

                else{
                    System.out.printf("%3s", holder[a][b]);
                }
            }
            System.out.println();
        }
    }
}
