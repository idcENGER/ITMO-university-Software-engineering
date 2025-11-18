//Areial_Ace.java

package Moves.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

public class Areial_Ace extends PhysicalMove{
    public Areial_Ace(){
        super(Type.FLYING,60,100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon p1,Pokemon p2){
        return true;
    }

    @Override
    protected String describe(){
        return "использует areial ace";
    }

}