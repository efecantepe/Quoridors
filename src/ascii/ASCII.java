package ascii;

import board.Board;
import board.Tile;
import player.Alliance;

import java.util.Scanner;

/**
 *  @author Efe Can Tepe
 *          This class is created for testing the code so for on the ASCII code
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
        drawBoard(board);
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
