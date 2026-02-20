//Body_Slam.java

package Moves.PhysicalMoves;

import Pokemons.Fomantis;
import Pokemons.Lurantis;
import ru.ifmo.se.pokemon.*;

public class Body_Slam extends PhysicalMove{
    public Body_Slam(){
        super(Type.NORMAL,85,100);
    }
    private boolean paralyzing = false;
    @Override
    protected void applyOppEffects(Pokemon p){
        if(p instanceof Fomantis){
            p.setMod(Stat.HP,-(((Fomantis)p).max_hp)/3);
        }if(p instanceof Lurantis){
            p.setMod(Stat.HP,-(((Lurantis)p).max_hp)/3);
        }
        if ((Math.random() <= 0.3) && (!p.hasType(Type.ELECTRIC))){
            Effect.paralyze(p);
            paralyzing = true;
        }
    }
    @Override
    protected String describe(){
        return "использует body slam"+ ((paralyzing) ? "и paralyzing противника" : "");
    }
}
