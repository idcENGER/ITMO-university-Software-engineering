package Commands;

public interface Command {

    public void execute(String ...args);

    public String getName();

    public String description();

}

