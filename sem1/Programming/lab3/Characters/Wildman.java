package Characters;
import Items.Item;

public class Wildman extends Wild{

    static int HP = 100;

    public Wildman(String name,int HP){
    }

    @Override
    public String getName(String name) {
        return "";
    }

    @Override
    public void giveItem(Item item) {

    }

    @Override
    public void getDamage(int damage) {
        HP = HP - damage;
        System.out.println(HP);
    }

}
