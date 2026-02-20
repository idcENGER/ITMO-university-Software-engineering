package Characters;

public abstract class Wild implements Human {

    static int HP = 100;

    @Override
    public void execute() {
    }

    @Override
    public void description() {
    }

    public abstract void getDamage(int damage);

}
