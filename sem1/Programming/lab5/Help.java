public class Help implements Command{

    @Override
    public void execute(String... args){
        System.out.println("rabota");
    }

    @Override
    public String getName() {
        return "help";
    }

}
