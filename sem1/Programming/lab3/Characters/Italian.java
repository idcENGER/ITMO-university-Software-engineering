package Characters;

public class Italian extends Character{

    public Italian() {
        super("Итальянец", Condition.BOUNDED);
        if(getName() == null)
            throw new IllegalArgumentException("name is required");
    }

    @Override
    public void execute() {
        this.setCondition(Condition.SCARED);
        this.description();
    }

    @Override
    public void description() {
        System.out.println("Этот итальянец был напуган");
    }

}
