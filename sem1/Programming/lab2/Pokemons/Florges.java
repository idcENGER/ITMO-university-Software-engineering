//Florges.java

package Pokemons;

import Moves.PhysicalMoves.Vine_Whip;
import Moves.SpecialMoves.Energy_Ball;
import Moves.SpecialMoves.Magical_Leaf;
import Moves.StatusMoves.Rest;
import ru.ifmo.se.pokemon.*;

public class Florges extends Floette{
    public Florges(String name,int level){
        super(name,level);
        if (level >= 1 && level <= 100){
            setType(Type.FAIRY);
            setStats(78,65,68,112,154,75);
            setMove(new Energy_Ball(),new Rest(),new Vine_Whip(),new Magical_Leaf());
        }else{
            System.out.print("Неверно введён уровень покемона");
        }
    }
}