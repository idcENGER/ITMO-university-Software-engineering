public class Friday extends Character{

    protected Friday(String name,int HP){
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
