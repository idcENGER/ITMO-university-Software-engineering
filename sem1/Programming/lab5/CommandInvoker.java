import java.util.HashMap;
import java.util.Map;

public class CommandInvoker {
    private final Map<String, Command> commandMap = new HashMap<>();
    private CollectionManager collectionManager;
    CommandInvoker(CollectionManager collectionManager)  {
        this.collectionManager = collectionManager;
    }
    public void register(Command command){
        commandMap.put(command.getName(), command);
    }
    public void execute(String commandName){
        commandMap.get(commandName).execute();
    }
}
