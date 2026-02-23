import Characters.*;
import Items.Boat;
import Items.Musket;

import java.util.ArrayList;
import java.util.random.RandomGenerator;

public class Environment {

    Musket musket;
    Robinson robinson;
    Friday friday;
    Italian italian;
    Wildman wildman1;
    Wildman wildman2;
    Wildman wildman3;
    Boat boat;
    ArrayList<Wildman> wildmans = new ArrayList<>();

    public Environment() {
        musket = new Musket(50,2);
        friday = new Friday();
        robinson = new Robinson();
        italian = new Italian();
        wildman1 = new Wildman(100,200, Condition.BASED);
        wildman2 = new Wildman(100,100, Condition.BASED);
        wildman3 = new Wildman(100,500, Condition.BASED);
        wildmans.add(wildman1);
        wildmans.add(wildman2);
        wildmans.add(wildman3);
        boat = new Boat(1, wildmans);
        friday.giveItem(musket);
        wildman1.giveItem(boat);
    }

    public void start(){
        wildman1.execute();
        RandomGenerator rand = RandomGenerator.getDefault();
        int rd = rand.nextInt(0,3);
        musket.getTarget(wildmans.get(rd));
        friday.execute();
        robinson.toFree(italian);
        italian.execute();
        if (italian.getCondition() == Condition.SCARED){
            italian.description();
        }

    }
}