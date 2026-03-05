import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        CollectionManager collectionManager = new CollectionManager();

        Scanner scanner = new Scanner(System.in);
        CommandInvoker commandInvoker = new CommandInvoker(collectionManager);
        commandInvoker.register(new Help());
        commandInvoker.register(new Info());

        while (true) {
            String commandName = scanner.nextLine();
            commandInvoker.execute(commandName);

            if (commandName.equals("help")) {
                System.out.println("help");
            } else if (commandName.equals("add")) {
                System.out.println("add");
            } else if (commandName.equals("info")) {
                System.out.println("info");
            }
        }
    }
}