//Magical_Leaf.java

package Moves.SpecialMoves;

import ru.ifmo.se.pokemon.*;

public class Magical_Leaf extends SpecialMove{
    public Magical_Leaf(){
        super(Type.GRASS,60,100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon p1, Pokemon p2){
        return true;
    }

    @Override
    protected String describe(){
        return "использует magical leaf";
    }

}