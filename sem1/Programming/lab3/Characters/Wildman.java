package Characters;

public class Wildman extends Wild{

    protected int HP;
    protected int avoid_skill;
    protected Condition condition;

    public Wildman(int HP,int avoid_skill,Condition condition){
        this.avoid_skill = avoid_skill;
        this.HP = HP;
        this.condition = condition;
    }

    public int getAvoid_skill() {
        return avoid_skill;
    }

    @Override
    public String getName() {
        return "Дикарь";
    }

    @Override
    public Condition getCondition() {
        return condition;
    }

    @Override
    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    @Override
    public void getDamage(int damage) {
        this.HP -= damage;
    }

    public int getHP(){
        return HP;
    }

}
