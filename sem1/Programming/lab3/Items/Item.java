package Items;

import Characters.Human;

public interface Item {

    double dura = 1;

    double effective = 1;

    void owner(Human var);

    void use();

}
