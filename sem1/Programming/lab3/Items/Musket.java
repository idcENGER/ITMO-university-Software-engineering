package Items;

import Characters.Condition;
import Characters.Wildman;

import java.util.random.RandomGenerator;

public class Musket{
    public int bullets;
    public int damage;
    public Wildman target;
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

            for (int i=0;i<2;i++){
                if ((miss_chance) >= 0.65 + (double)target.getAvoid_skill()/1000){
                    target.getDamage(damage);
                    if(target.getHP()<=0){
                        target.setCondition(Condition.DEAD);
                }else{
                    this.bullets-=1;
                    this.MISS = true;
                    }
                }
            }
        }
    }
}
