// Main.java

import ru.ifmo.se.pokemon.*;
import Pokemons.*;

public class Main{
    public static void main(String[] args){
        Battle fight = new Battle();

        Pokemon p1 = new Lapras("Lapras", 10);
        Pokemon p2 = new Flabebe("Flabebe", 10);
        Pokemon p3 = new Floette("Floette",10);
        Pokemon p4 = new Florges("Florges",10);
        Pokemon p5 = new Fomantis("Fomantis",10);
        Pokemon p6 = new Lurantis("Lurantis",10);
        fight.addAlly(p1);
        fight.addAlly(p3);
        fight.addAlly(p5);
        fight.addFoe(p2);
        fight.addFoe(p4);
        fight.addFoe(p6);
        fight.go();
    }
}