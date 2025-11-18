//Flabebe.java

package Pokemons;

import Moves.SpecialMoves.Energy_Ball;
import Moves.StatusMoves.Rest;
import ru.ifmo.se.pokemon.*;

public class Flabebe extends Pokemon{
    public int max_hp;
    public Flabebe(String name, int level){
        super(name, level);
        if (level >= 1 && level <=100){
            max_hp = (int) super.getStat(Stat.HP);
            setType(Type.FAIRY);
            setStats(44,38,39,61,79,42);
            setMove(new Energy_Ball(),new Rest());
        }else{
            System.out.print("Неверно введён уровень покемона");
        }
    }
}