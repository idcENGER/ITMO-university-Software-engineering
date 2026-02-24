package Characters;

public abstract class Character implements Human{

    private final String name;
    private Condition condition;

    protected Character(String name, Condition condition){
        this.name = name;
        this.condition = condition;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Condition getCondition() {
        return condition;
    }

    @Override
    public void setCondition(Condition c){
        this.condition = c;
    }

    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;
        Character character = (Character) o;
        return name.equals(character.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", mood=" + condition + '}';
    }

}
