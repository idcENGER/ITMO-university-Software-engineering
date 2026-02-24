package Characters;

public interface Human {

    void execute()
        throws WrongActionException;

    void description();

    String getName();

    boolean equals(Object o);

    int hashCode();

    Condition getCondition();

    void setCondition(Condition condition);
}
