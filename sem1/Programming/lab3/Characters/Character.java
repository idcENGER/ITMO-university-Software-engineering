package Characters;
import Items.Item;

public class Character implements Human{

    String name;
    int HP;

    public Character(String name, int hp) {
    }

    @Override
    public void execute() {
    }

    @Override
     public void description() {
    }

    @Override
    public String getName(String name) {
        return name;
    }

    @Override
    public void giveItem(Item item) {
        boolean hasItem = true;
    }
}
