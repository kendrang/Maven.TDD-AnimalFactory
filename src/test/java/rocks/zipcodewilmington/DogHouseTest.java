package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
//public class DogHouseTest {
//    // TODO - Create tests for `void add(Dog dog)`
//    // TODO - Create tests for `void remove(Integer id)`
//    // TODO - Create tests for `void remove(Dog dog)`
//    // TODO - Create tests for `Dog getDogById(Integer id)`
//    // TODO - Create tests for `Integer getNumberOfDogs()`

//    @Test
//    public void testGetNumberOfDogs() {
//        // Given (some
//        String name = "Milo";
//        Date birthDate = new Date();
//        Dog animal = AnimalFactory.createDog(name, birthDate);
//        DogHouse.clear();
//
//        // When
//        DogHouse.add(animal);
//
//        // Then
//        DogHouse.getNumberOfDogs();
//    }
//
//    @Test
//    public void testaddDog(){
//        DogHouse dogehouse = new DogHouse();
//        Dog cat = new Cat("Chicken", new Date(10), 2);
//        catHoudogse1.add(cat);
//        Cat actual = catHouse1.getCatById(2);
//        Assert.assertEquals(cat,actual);
//
//    }
//
//    // TODO - Create tests for `void remove(Integer id)`
//
//    @Test
//    public void testRemove () {
//        DogHouse catHouse1 = new DogHouse();
//        Cat cat = new Cat ("Donut", new Date(10), 3);
//        catHouse1.add(cat);
//        catHouse1.remove(3);
//        Cat actual = catHouse1.getCatById(3);
//        Assert.assertEquals(null,actual);
//
//
//    }
//
//    // TODO - Create tests for `void remove(Cat cat)`
//
//    @Test
//    public void testRemoveCatbyCat () {
//        DogHouse catHouse1 = new DogHouse();
//        Cat bby = new Cat ("Donut", new Date(10), 3);
//        catHouse1.add(bby);
//        catHouse1.remove(bby);
//        Cat actual = catHouse1.getCatById(3);
//        Assert.assertEquals(null,actual);
//
//    }
//
//    // TODO - Create tests for `Integer getNumberOfCats()`
//
//    @Test
//    public void testNumberofCat (){
//        DogHouse catHouse1 = new DogHouse();
//        Cat cat = new Cat("Chicken", new Date(10), 2);
//        catHouse1.add(cat);
//        Integer expected = 1;
//        Integer actual = catHouse1.getNumberOfCats();
//        Assert.assertEquals(expected,actual);
//    }
//
//}
