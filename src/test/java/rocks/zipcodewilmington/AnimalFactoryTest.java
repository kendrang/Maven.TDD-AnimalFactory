package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest(){
        String name = "Cheeseburger";
        Date birthDate = new Date(10);
        Dog dog = AnimalFactory.createDog(name, birthDate);

        String expected = dog.getName();
        String actual = name;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void createCatTest(){
        String name = "Pancake";
        Date birthDate = new Date(10);
        Cat cat = AnimalFactory.createCat(name, birthDate);

        String expected = cat.getName();
        String actual = name;

        Assert.assertEquals(expected, actual);

    }

}
