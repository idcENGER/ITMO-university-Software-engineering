//Slash.java

package Moves.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

public class Slash extends PhysicalMove{
    public Slash(){
        super(Type.NORMAL,70,100);
    }
    @Override
    protected String describe(){
        return "использует slash";
    }
}