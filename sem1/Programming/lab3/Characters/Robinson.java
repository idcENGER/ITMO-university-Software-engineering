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

}
