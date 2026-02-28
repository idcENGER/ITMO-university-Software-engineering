//X-Scisso.java

package Moves.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

public class X_Scisso extends PhysicalMove{
    public X_Scisso(){
        super(Type.BUG,80,100);

    }
    @Override
    protected String describe(){
        return "использует x-scisso";
    }
}