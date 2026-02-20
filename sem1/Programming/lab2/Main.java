// Main.java
//Orlov Egor

import ru.ifmo.se.pokemon.*;
import Pokemons.*;

public class Main{
    public static void main(String[] args){
        Battle fight = new Battle();

        Pokemon p1 = new Lapras("", 10);
        Pokemon p2 = new Flabebe("", 10);
        Pokemon p3 = new Floette("",10);
        Pokemon p4 = new Florges("",10);
        Pokemon p5 = new Fomantis("",10);
        Pokemon p6 = new Lurantis("",10);
        fight.addAlly(p1);
        fight.addAlly(p3);
        fight.addAlly(p5);
        fight.addFoe(p6);
        fight.addFoe(p4);
        fight.addFoe(p2);
        fight.go();
    }
}