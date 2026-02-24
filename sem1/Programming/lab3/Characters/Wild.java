package Characters;

import Items.Boat;

public abstract class Wild implements Human {

    private Boat boat;


    public abstract void getDamage(int damage);

    @Override
    public void execute() throws WrongActionException{
        if (boat == null){
            throw new WrongActionException("boat cant be null");
        }
        boat.use();
    }

    public void giveItem(Boat boat){
        this.boat = boat;
    }

    @Override
    public void description(){
        System.out.println("Трое дикарей спасаются в лодке");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" + getCondition() +'}';
    }

}
