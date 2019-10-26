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
        Cat cat = new Cat ("Donut", new Date(10), 3);
        catHouse1.add(cat);
        catHouse1.remove(3);
        Cat actual = catHouse1.getCatById(3);
        Assert.assertEquals(null,actual);


    }

    // TODO - Create tests for `void remove(Cat cat)`

    @Test
    public void testRemoveCatbyCat () {
        CatHouse catHouse1 = new CatHouse();
        Cat bby = new Cat ("Cheeseburger", new Date(10), 3);
        catHouse1.add(bby);
        catHouse1.remove(bby);
        Cat actual = catHouse1.getCatById(3);
        Assert.assertEquals(null,actual);

    }

    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testNumberofCat (){
        CatHouse catHouse2 = new CatHouse();
        Cat hahacat = new Cat("BurgerKing", new Date(10), 5);
        catHouse2.add(hahacat);
        Integer expected = 1;
        Integer actual = catHouse2.getNumberOfCats();
        Assert.assertEquals(expected,actual);
    }

}
