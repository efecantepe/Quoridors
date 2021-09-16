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

}
