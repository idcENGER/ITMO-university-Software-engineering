//Fomantis.java

package Pokemons;

import Moves.PhysicalMoves.*;
import ru.ifmo.se.pokemon.*;

public class Fomantis extends Pokemon{
    public Fomantis(String name,int level){
        super(name,level);
        if (level >= 1 && level <= 100){
            setType(Type.GRASS);
            setStats(40,55,35,50,35,35);
            setMove(new X_Scisso(),new Slash(),new Facade());
        }else{
            System.out.print("Неверно введён уровень покемона");
        }
    }
}