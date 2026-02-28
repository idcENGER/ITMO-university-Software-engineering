//Frost_Breath.java

package Moves.SpecialMoves;

import Pokemons.Fomantis;
import Pokemons.Lurantis;
import ru.ifmo.se.pokemon.*;

public class Frost_Breath extends SpecialMove{
    public Frost_Breath(){
        super(Type.ICE,60,90);
    }
    protected void applyOppEffects(Pokemon p) {
        if(p instanceof Fomantis){
            p.setMod(Stat.HP,-(((Fomantis)p).max_hp)/3);
        }if(p instanceof Lurantis){
            p.setMod(Stat.HP,-(((Lurantis)p).max_hp)/3);
        }
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