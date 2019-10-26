package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`

    @Test
    public void testaddCat(){
        CatHouse catHouse1 = new CatHouse();
        Cat cat = new Cat("Chicken", new Date(10), 2);
        catHouse1.add(cat);
        Cat actual = catHouse1.getCatById(2);
        Assert.assertEquals(cat,actual);

    }

    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void testRemove () {
        CatHouse catHouse1 = new CatHouse();
        Cat cat = new Cat ();
        catHouse1.add(cat);



    }

    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
}
