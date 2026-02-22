package Characters;

import Items.Item;
import Items.Musket;

public class Friday extends Character{

    private final Musket musket;

    public Friday(Musket musket){
        this.musket = musket;
        super("Friday",100);
    }

    public void execute() {
        this.musket.use();
        this.description();
    }
    @Override
    public void giveItem(Item item){
    }

    @Override
    public void description() {
        String dmg = String.valueOf(this.musket.showDamage());
        System.out.println("попал и нанес "+ dmg);
    }
}
