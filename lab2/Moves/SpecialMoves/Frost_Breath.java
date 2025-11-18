//Frost_Breath.java

package Moves.SpecialMoves;

import ru.ifmo.se.pokemon.*;

public class Frost_Breath extends SpecialMove{
    public Frost_Breath(){
        super(Type.ICE,60,90);
    }
    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        return 1.5;
    }
    @Override
    protected String describe(){
        return "использует frost breath";
    }
}