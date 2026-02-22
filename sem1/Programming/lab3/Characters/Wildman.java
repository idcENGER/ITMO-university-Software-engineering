package Characters;
import Items.Item;

public class Wildman extends Wild{

    private int HP;

    public Wildman(String name,int HP){
        this.HP = HP;
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
        this.HP -= damage;
        System.out.println(HP);
    }

}
