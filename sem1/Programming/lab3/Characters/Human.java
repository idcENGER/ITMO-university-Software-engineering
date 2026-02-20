package Characters;

import Items.Item;

public interface Human {

    void execute();

    void description();

    String getName(String name);

    void giveItem(Item item);
}
