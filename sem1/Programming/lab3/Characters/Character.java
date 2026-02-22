package Characters;
import Items.Item;

public abstract class Character implements Human{

    public Character(String name, int hp) {
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
