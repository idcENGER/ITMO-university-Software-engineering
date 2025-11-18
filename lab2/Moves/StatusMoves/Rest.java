//Rest.java

package Moves.StatusMoves;

import Pokemons.Flabebe;
import Pokemons.Lapras;
import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove{
    public Rest(){
        super(Type.PSYCHIC,0,0);
    }
    @Override
    protected boolean checkAccuracy(Pokemon p1, Pokemon p2){
        return true;
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect rest = (new Effect().condition(Status.SLEEP).chance(1).turns(2));
        if ((p instanceof Flabebe)) {
            p.setMod(Stat.HP,(((Flabebe)p).max_hp-(int)p.getHP()));
        } else {
            p.setMod(Stat.HP, (((Lapras) p).max_hp-(int)p.getHP()));
        }
        p.setCondition(rest);
    }

    @Override
    protected String describe(){
        return "использует rest";
    }
}
