package Commands;

import Menegers.CommandInvoker;

public class Help implements Command{
    @Override
    public void execute(String... args){
        System.out.println("Command list:");
        CommandInvoker.getCommandMap();
    }

    @Override
    public String getName() {
        return "help";
    }

    @Override
    public String description() {
        return getName()+": вывести справку по доступным командам";
    }



}
