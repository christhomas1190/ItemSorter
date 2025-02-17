package rocks.zipcode.io.item;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;

/**
 * @author leon on 30/01/2019.
 */
public class NonNullaryConstructorTest {
    @Test
    public void test1() {
        // given
        Long expectedId = 1L;
        String expectedName = "Television";
        Double expectedPrice = 250.0;

        // when
        Item item = new Item(expectedId, expectedName, expectedPrice);
        Long actualId = item.getId();
        String actualName = item.getName();
        Double actualPrice = item.getPrice();

        // then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedPrice, actualPrice);
    }


    @Test
    public void test2() {
        // given
        Long expectedId = 2L;
        String expectedName = "Table";
        Double expectedPrice = 50.0;

        // when
        Item item = new Item(expectedId, expectedName, expectedPrice);
        Long actualId = item.getId();
        String actualName = item.getName();
        Double actualPrice = item.getPrice();

        // then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedPrice, actualPrice);
    }
}
