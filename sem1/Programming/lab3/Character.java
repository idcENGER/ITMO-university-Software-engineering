public abstract class Character implements Human{

    String name;
    int HP;

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
