package Characters;

public class Robinson extends Character{

    public Robinson() {
        super("Робинзон", Condition.BASED);
    }

    public void toFree(Italian italian){
        italian.setCondition(Condition.BASED);
        this.description();
    }

    @Override
    public void execute() {

    }

    @Override
    public void description() {
        System.out.println("Робинзон освободил человека, лежавшего в лодке");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;
        Robinson robinson = (Robinson) o;
        return getName().equals(robinson.getName());
    }
}
