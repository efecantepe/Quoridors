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

    public int getRow(){
        return row;
    }

    public int getColumn(){
        return column;
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

    @Override
    public boolean equals(Object other){

        if(other == null){
            return false;
        }

        if(!(other instanceof Tile)){
            return false;
        }

        if(other == this){
            return true;
        }

        Tile tile = (Tile) other;
        return tile.getRow() == this.getRow()
                && tile.getColumn() == this.getColumn();
    }

    @Override
    public int hashCode(){
        return 31 * (31 * this.row + this.column);
        /*
            TODO: I am not sure this implementation of the hashCode method is correct.
        */
    }
}
