
public class Info implements Command{

    //CollectionManager

    @Override
    public void execute(String... args) {

    }

    @Override
    public String getName() {
        return "info";
    }

    @Override
    public String description() {
        return getName() + " - выводит информацию о коллекции";
    }

}
