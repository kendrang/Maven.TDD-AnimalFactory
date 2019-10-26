package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void setName(){
        //Given
        String expected = "Benji";
        Date givenBirthDate = new Date();
        Integer givenID = 0 ;
        Dog dog = new Dog( expected, givenBirthDate, givenID);
        // When
        dog.setName(expected);

        //Then
        String actual = dog.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setBirthDate(){
        //Given
        String givenName = "Luna";
        Date givenBirthDate = new Date(500);
        Integer givenID = 0 ;
        Dog dog = new Dog( givenName, givenBirthDate, givenID);
        // When
        dog.setBirthDate(givenBirthDate);

        //Then
        Date actual = dog.getBirthDate();
        Assert.assertEquals(givenBirthDate,actual);
    }

    @Test
    public void speak(){
        Dog dog = new Dog ();
        String actual = dog.speak();
        String expected = "bark!";
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void getId(){
        Dog dog = new Dog ();
        Integer actual = dog.getId();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest() {
        Dog dog = new Dog();
        dog.eat(new Food());
        Integer actual =  dog.getNumberOfMealsEaten();
        Integer expected = 1;
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testingInstanceAnimal() {
        Dog dog = new Dog ();
        Boolean actual = dog instanceof Animal;
        Boolean expected = true;
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testingInstanceMammal() {
        Dog dog = new Dog ();
        Boolean actual = dog instanceof Mammal;
        Boolean expected = true;
        Assert.assertEquals(expected, actual);

    }
}
