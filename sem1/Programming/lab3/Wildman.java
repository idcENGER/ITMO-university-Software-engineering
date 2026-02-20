public class Wildman extends Wild{

    static int HP = 100;

    public Wildman(String name,int HP){
    }

    @Override
    public void execute() {
        super.execute();
    }

    @Override
    public void getDamage(int damage) {
        HP = HP - damage;
        System.out.println(HP);
    }

}
