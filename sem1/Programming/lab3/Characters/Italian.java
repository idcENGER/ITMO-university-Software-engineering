package Characters;

public class Italian extends Character{

    public Italian() {
        super("Итальянец", Condition.BOUNDED);
    }

    @Override
    public void execute() {
        this.setCondition(Condition.SCARED);
    }

    @Override
    public void description() {
        System.out.println("Этот итальянец был напуган досмерти");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;
        Italian italian = (Italian) o;
        return getName().equals(italian.getName());
    }
}
