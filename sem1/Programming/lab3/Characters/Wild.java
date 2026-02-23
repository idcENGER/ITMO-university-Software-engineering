package Characters;

import Items.Boat;

public abstract class Wild implements Human {

    Boat boat;

    @Override
    public void execute() {
        boat.use();
    }

    public void giveItem(Boat boat){
        this.boat = boat;
    }

    @Override
    public void description() {
        System.out.println("Трое дикарей спасаются в лодке");
    }

    public abstract void getDamage(int damage);

}
