package rocks.zipcodewilmington.animals;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class Dog extends Mammal {
    public Dog(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }

    public Dog () {
        super("Benji", new Date(), 1);
    }

    public String speak() {
        return "bark!";
    }
}
