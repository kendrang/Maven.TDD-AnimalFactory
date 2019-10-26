package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void testaddDog(){
        DogHouse dogehouse = new DogHouse();
        Dog dog = new Dog("Booboo the Fool", new Date(10), 1);
        dogehouse.add(dog);
        Dog actual = dogehouse.getDogById(1);
        Assert.assertEquals(dog,actual);

    }



    @Test
    public void testRemove () {
        DogHouse dogehouse1 = new DogHouse();
        Dog dog = new Dog ("Beebo", new Date(10), 2);
        dogehouse1.add(dog);
        dogehouse1.remove(2);
        Dog actual = dogehouse1.getDogById(2);
        Assert.assertEquals(null,actual);


    }


    @Test
    public void testRemoveDogbyDog () {
        DogHouse dogehouse2 = new DogHouse();
        Dog dog = new Dog ("Bopbop", new Date(10), 3);
        dogehouse2.add(dog);
        dogehouse2.remove(dog);
        Dog actual = dogehouse2.getDogById(3);
        Assert.assertEquals(null,actual);
    }


    @Test
    public void testNumberofDogs (){
        DogHouse dogehouse4 = new DogHouse();
        Dog dog = new Dog("Dingdong", new Date(10), 5);
        dogehouse4.add(dog);
        Integer expected = 2;
        Integer actual = dogehouse4.getNumberOfDogs();
        Assert.assertEquals(expected,actual);
    }

}
