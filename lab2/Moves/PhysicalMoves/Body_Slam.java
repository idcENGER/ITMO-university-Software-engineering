//Body_Slam.java

package Moves.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

public class Body_Slam extends PhysicalMove{
    public Body_Slam(){
        super(Type.NORMAL,85,100);
    }
    private boolean paralyzing = false;
    @Override
    protected void applyOppEffects(Pokemon p){
        if ((Math.random() <= 0.3) && (!p.hasType(Type.ELECTRIC))){
            Effect.paralyze(p);
            paralyzing = true;
/*C вероятностью 30% наложит эффект paralyzing.Покемоны электрического типа, обладающие способностью гибкости,
 или те, кто стоит за заменой, не могут быть парализованы
 */
        }
    }
    @Override
    protected String describe(){
        return "использует body slam"+ ((paralyzing) ? "и paralyzing противника" : "");
    }
}
