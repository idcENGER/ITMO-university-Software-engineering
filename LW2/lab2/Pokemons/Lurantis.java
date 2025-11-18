//Lurantis.java

package Pokemons;

import Moves.PhysicalMoves.*;
import ru.ifmo.se.pokemon.*;

public class Lurantis extends Pokemon{
    public Lurantis(String name,int level){
        super(name,level);
        if (level >=1 && level <=100){
            setType(Type.GRASS);
            setStats(70,105,90,80,90,45);
            setMove(new Facade(),new Slash(),new X_Scisso(),new Areial_Ace());
        }else{
            System.out.print("Неверно введён уровень покемона");
        }
    }
}