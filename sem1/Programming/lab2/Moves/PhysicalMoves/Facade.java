//Facade.java

package Moves.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }
    Status enemy;
    boolean flag;
    @Override
    protected void applyOppEffects(Pokemon p) {
        this.enemy = p.getCondition();
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect var1 = new Effect().stat(Stat.ATTACK,140).turns(0);
        flag = (enemy==Status.BURN) || (enemy==Status.PARALYZE) || (enemy==Status.POISON);
        if(flag){
            p.setCondition(var1);
        }
    }
    @Override
    protected String describe(){
        return "использует facade" + ((flag) ? "и атакует сильнее прежнего" : "");
    }
}