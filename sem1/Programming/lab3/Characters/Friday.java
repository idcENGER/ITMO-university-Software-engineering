package Characters;

import Items.Musket;

public class Friday extends Character{

    private Musket musket;

    public Friday(){
        super("Пятница",Condition.MOVED);
        if(getName() == null)
            throw new IllegalArgumentException("name is required");
    }

    public void execute() throws WrongActionException {
        if (musket.bullets == 0){
            throw new WrongActionException("Патронов не может быть ноль");
        }
        this.musket.use();
        this.description();
    }

    public void giveItem(Musket musket) throws WrongActionException{
        if (musket == null){
            throw new WrongActionException("Friday have not weapon");
        }
        this.musket = musket;
    }

    @Override
    public void description() {
        System.out.println(getName()+ " выстрелил два раза и " + (musket.MISS ? "не попал" : ("попал в дикаря")));
        if (musket.target.getCondition().equals(Condition.DEAD)){
            System.out.println("О как! События приняли неожиданный поворот и Пятница все же остановил дикарей");
        }
    }

}
