package Characters;

public class Friday extends Character{

    public Friday(String name, int HP){
        super("Friday",100);
    }
    public void execute(Wildman wildman) {
        wildman.getDamage(50);
        this.description();
    }

    @Override
    public void description() {
        System.out.println("попал");
    }
}
