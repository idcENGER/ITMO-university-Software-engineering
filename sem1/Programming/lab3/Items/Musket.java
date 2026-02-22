package Items;

import Characters.Character;
import Characters.Wildman;

import java.util.random.RandomGenerator;

public class Musket implements Item {
    protected int bullets;
    protected int damage;
    private Wildman target;

    public Musket(int damage,int bullets){
        this.damage = damage;
        this.bullets = bullets;
    }

    public void getTarget(Wildman target){
        this.target = target;
    }

    @Override
    public void use() {
        RandomGenerator rand = RandomGenerator.getDefault();
        double miss_chance = rand.nextDouble();
        target.getDamage(damage);
    }


    public int showDamage(){
        return damage;
    }

}
