//Lapras.java

package Pokemons;

import Moves.PhysicalMoves.Body_Slam;
import Moves.SpecialMoves.Ancient_Power;
import Moves.SpecialMoves.Frost_Breath;
import Moves.StatusMoves.Rest;
import ru.ifmo.se.pokemon.*;

public class Lapras extends Pokemon {
    public int max_hp;
    public Lapras(String name, int level) {
        super(name, level);
        if (level >= 1 && level <= 100){
            max_hp = (int) super.getStat(Stat.HP);
            setType(Type.WATER,Type.ICE);
            setStats(130,85,80,85,90,60);
            setMove(new Ancient_Power(),new Body_Slam(),new Rest(),new Frost_Breath());
        }else{
            System.out.print("Неверно введён уровень покемона");
        }
    }
}