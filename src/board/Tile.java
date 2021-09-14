package board;

import pawn.Pawn;

public class Tile {

    private int row;
    private int column;

    private Pawn pawnOnTheTile;

    private Tile up;
    private Tile down;
    private Tile right;
    private Tile left;

    public Tile(int row, int column){
        this.row = row;
        this.column = column;
    }

    public Tile getUpTile(){
        return up;
    }

    public Tile getDownTile(){
        return down;
    }

    public Tile getRightTile(){
        return right;
    }

    public Tile getLeftTile(){
        return left;
    }

    public void setUpTile(Tile upTile){
        up = upTile;
    }

    public void setDownTile(Tile downTile){
        down = downTile;
    }

    public void setRightTile(Tile rightTile){
        right = rightTile;
    }

    public void setLeftTile(Tile leftTile){
        left = leftTile;
    }

    public Pawn getPawnOnTheTile(){
        return pawnOnTheTile;
    }

    public void setPawnOnTheTile(Pawn pawnOnTheTile){
        this.pawnOnTheTile = pawnOnTheTile;
    }

    @Override
    public String toString(){
        return (char)((column + (int)'a')) + "" + row + "";
    }
}
