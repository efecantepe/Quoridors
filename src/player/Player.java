package player;

import pawn.Pawn;

public class Player {

    private int blockCount;

    private String name;
    private Pawn playersPawn;
    private Alliance alliance;

    public Player(String name, Pawn playersPawn, Alliance alliance){
        this.blockCount = 10;
        this.name = name;
        this.playersPawn = playersPawn;
        this.alliance = alliance;
    }

    public void blockPlaced(){
        if(blockCount > 0){
            blockCount--;
        }
    }

}
