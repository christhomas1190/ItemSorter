package rocks.zipcode.io.item;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;

/**
 * @author leon on 30/01/2019.
 */
public class NullaryConstructorTest {
    @Test
    public void testNullaryConstructor() {
        // given
        String expectedName = "";
        Long expectedId = 0L;
        Double expectedPrice = 0.01;

        // when
        Item item = new Item();
        Long actualId = item.getId();
        String actualName = item.getName();
        Double actualPrice = item.getPrice();

        // then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedPrice, actualPrice);
    }
}
