//Energy_Ball.java

package Moves.SpecialMoves;

import ru.ifmo.se.pokemon.*;

public class Energy_Ball extends SpecialMove{
    public Energy_Ball(){
        super(Type.GRASS,90,100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon p1,Pokemon p2){
        return true;
    }

    @Override
    protected String describe(){
        return "исплользует energy ball";
    }

}