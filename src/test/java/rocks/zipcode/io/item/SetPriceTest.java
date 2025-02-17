package rocks.zipcode.io.item;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;

/**
 * @author leon on 30/01/2019.
 */
public class SetPriceTest {
    @Test
    public void test1() {
        // given
        Double expectedPrice = 0.05;
        Item item = new Item();

        // when
        item.setPrice(expectedPrice);
        Double actualPrice = item.getPrice();

        // then
        Assert.assertEquals(expectedPrice, actualPrice);
    }


    @Test
    public void test2() {
        // given
        Double expectedPrice = 50.5;
        Item item = new Item();

        // when
        item.setPrice(expectedPrice);
        Double actualPrice = item.getPrice();

        // then
        Assert.assertEquals(expectedPrice, actualPrice);
    }


    @Test
    public void test3() {
        // given
        Double expectedPrice = 75.0;
        Item item = new Item();

        // when
        item.setPrice(expectedPrice);
        Double actualPrice = item.getPrice();

        // then
        Assert.assertEquals(expectedPrice, actualPrice);
    }
}
