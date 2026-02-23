package Characters;

import Items.Musket;

public class Friday extends Character{

    private Musket musket;

    public Friday(){
        super("Пятница",Condition.MOVED);
    }

    public void execute() {
        this.musket.use();
        this.description();
    }

    public void giveItem(Musket m){
        this.musket = m;
    }

    @Override
    public void description() {
        System.out.println(getName()+ " выстрелил два раза и " + (musket.MISS ? "не попал" : ("попал в дикаря")));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;
        Friday friday = (Friday) o;
        return getName().equals(friday.getName());
    }
}
