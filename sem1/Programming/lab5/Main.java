import Commands.Clear;
import Commands.Exit;
import Commands.Help;
import Commands.Info;
import Menegers.CommandInvoker;
import Menegers.CollectionManager;
import java.util.Scanner;
import java.io.File;
import javax.xml.parsers.*;


public class Main {
    public static void main(String[] args) {
        CollectionManager collectionManager = new CollectionManager();

        Scanner scanner = new Scanner(System.in);
        CommandInvoker commandInvoker = new CommandInvoker(collectionManager);
        commandInvoker.register(new Help());
        commandInvoker.register(new Info());
        commandInvoker.register(new Clear());
        commandInvoker.register(new Exit());

        while (true) {
            System.out.print(":~$ ");
            String commandName = scanner.nextLine();
            commandInvoker.execute(commandName);
            if (commandName.equals("exit")){
                break;
            }
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