package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setName(){
        //Given
        String expected = "Luna";
        Date givenBirthDate = new Date();
        Integer givenID = 0 ;
        Cat cat = new Cat( expected, givenBirthDate, givenID);
        // When
        cat.setName(expected);

        //Then
        String actual = cat.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setBirthDate(){
        //Given
        String givenName = "Luna";
        Date givenBirthDate = new Date(500);
        Integer givenID = 0 ;
        Cat cat = new Cat( givenName, givenBirthDate, givenID);
        // When
        cat.setBirthDate(givenBirthDate);

        //Then
        Date actual = cat.getBirthDate();
        Assert.assertEquals(givenBirthDate,actual);
    }

    @Test
    public void speak(){
        Cat cat = new Cat ();
        String actual = cat.speak();
        String expected = "meow!";
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void getId(){
        Cat cat = new Cat ();
        Integer actual = cat.getId();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eat() {
        Cat cat = new Cat ();
        Food actual = cat.eat();


    }

    @Test
    public void testingInstanceAnimal() {
        Cat cat = new Cat ();
        Boolean actual = cat instanceof Animal;
        Boolean expected = true;
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testingInstanceMammal() {
        Cat cat = new Cat ();
        Boolean actual = cat instanceof Mammal;
        Boolean expected = true;
        Assert.assertEquals(expected, actual);

    }
}
