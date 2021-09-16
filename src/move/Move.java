package move;

import board.Tile;

public class Move {

    private Tile currentTile;
    private Tile destinationTile;

    public Move(final Tile currentTile, final Tile destinationTile){
        this.currentTile = currentTile;
        this.destinationTile = destinationTile;
    }

    /**
     *  @author Efe Can Tepe
     *  @return
     *
     *  Getting the current Tile
     */
    public Tile getCurrentTile(){
        return currentTile;
    }

    /**
     *  @author Efe Can Tepe
     *  @return
     *
     *  Getting the destination Tile
     */
    public Tile getDestinationTile(){
        return destinationTile;
    }

    @Override
    public boolean equals(Object other){
        if(other == null){
            return false;
        }

        if(!(other instanceof Move)){
            return false;
        }

        if(other == this){
            return true;
        }

        Move move = (Move) other;
        return move.getCurrentTile() == this.getCurrentTile()
                && move.getDestinationTile() == this.getDestinationTile();
    }

    @Override
    public int hashCode(){
        return 31 * (31 * currentTile.hashCode() + destinationTile.hashCode());
        /*
            TODO: Look again hashCode implementation is correct or not.
        */
    }

}
