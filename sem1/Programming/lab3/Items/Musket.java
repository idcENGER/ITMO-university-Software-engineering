package Items;

import Characters.Wildman;

import java.util.random.RandomGenerator;

public class Musket{
    private int bullets;
    protected int damage;
    private Wildman target;
    public boolean MISS = false;

    public Musket(int damage,int bullets){
        this.damage = damage;
        this.bullets = bullets;
    }

    public void getTarget(Wildman target){
        this.target = target;
    }

    public void use() {
        RandomGenerator rand = RandomGenerator.getDefault();
        if (this.bullets>0) {
            double miss_chance = rand.nextDouble(0.5,1.0);

            if ((miss_chance) >= 0.65 + (double)target.getAvoid_skill()/1000){
                target.getDamage(damage);
            }else{
                this.bullets-=1;
                this.MISS = true;
            }
        }else{
            System.out.println("you have not bullets");
        }
    }
}
