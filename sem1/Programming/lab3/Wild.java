public abstract class Wild implements Human {
    @Override
    public void execute() {
    }

    @Override
    public String description(String phrase) {
        return getName() + ":" + phrase;
    }

    @Override
    public String getName() {
        return "1";
    }
}
