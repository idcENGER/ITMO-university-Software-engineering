import Characters.Wildman;
import Characters.Character;

import java.util.ArrayList;

public class Environment {

    private ArrayList<Object> characters = new ArrayList<>();
    private ArrayList<Object> wildmans = new ArrayList<>();

    public void addSurv(Character c) {
        characters.add(c);
    }

    public void addWild(Wildman w) {
    }
}