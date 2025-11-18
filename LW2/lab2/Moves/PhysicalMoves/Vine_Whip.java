//Vine_Whip.java

package Moves.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

public class Vine_Whip extends PhysicalMove{
    public Vine_Whip(){
        super(Type.GRASS,45,100);
    }
    @Override
    protected String describe(){
        return "использует vine whip";
    }
}