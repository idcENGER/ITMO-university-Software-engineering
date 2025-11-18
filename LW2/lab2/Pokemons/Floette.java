//Floette.java

package Pokemons;

import Moves.PhysicalMoves.Vine_Whip;
import Moves.SpecialMoves.*;
import Moves.StatusMoves.Rest;
import ru.ifmo.se.pokemon.*;

public class Floette extends Flabebe{
    public Floette(String name,int level){
        super(name,level);
        if (level >= 1 && level <=100){
            setType(Type.FAIRY);
            setStats(54,45,47,75,98,52);
            setMove(new Energy_Ball(),new Rest(),new Vine_Whip());
        }else{
            System.out.print("Неверно введён уровень покемона");
        }
    }
}