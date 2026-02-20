public class Character implements Human{
    String name;
    @Override
    public void execute() {
    }

    @Override
    public String description(String phrase) {
        return getName()+":"+phrase;
    }

    @Override
    public String getName() {
        return name;
    }
}
