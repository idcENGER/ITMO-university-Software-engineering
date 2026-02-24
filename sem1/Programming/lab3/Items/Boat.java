package Items;

import Characters.Condition;
import Characters.Wildman;

import java.util.ArrayList;

public record Boat(int dura, ArrayList<Wildman> places){

    public void use(){
        for(Wildman wildman: places){
            wildman.setCondition(Condition.MOVED);
        }
        places.getFirst().description();
    }
}
