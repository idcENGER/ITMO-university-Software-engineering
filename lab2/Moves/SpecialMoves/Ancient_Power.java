//Ancient_Power.java

package Moves.SpecialMoves;

import ru.ifmo.se.pokemon.*;

public class Ancient_Power extends SpecialMove{
    public Ancient_Power(){
        super(Type.ROCK,60,100);
    }
    private boolean raise = false;
    @Override
    protected void applySelfEffects(Pokemon p){
        if (Math.random() <= 0.1){
            p.setMod(Stat.ATTACK,1);
            p.setMod(Stat.DEFENSE,1);
            p.setMod(Stat.SPECIAL_ATTACK,1);
            p.setMod(Stat.SPECIAL_DEFENSE,1);
            p.setMod(Stat.SPEED,1);
            raise = true;
        }
    }

    @Override
    protected String describe(){
        return "использует Ancient Power" + ((raise) ? " и повышает атаку и защиту," +
                "специальную атаку и защиту и скорость на 1 единицу!" : "");
    }
}
