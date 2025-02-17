package rocks.zipcode.io.item;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;

/**
 * @author leon on 30/01/2019.
 */
public class SetNameTest {
    @Test
    public void test1() {
        // given
        String expectedName = "Paper";
        Item item = new Item();

        // when
        item.setName(expectedName);
        String actualName = item.getName();

        // then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void test2() {
        // given
        String expectedName = "Notebook";
        Item item = new Item();

        // when
        item.setName(expectedName);
        String actualName = item.getName();

        // then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void test3() {
        // given
        String expectedName = "Pencil";
        Item item = new Item();

        // when
        item.setName(expectedName);
        String actualName = item.getName();

        // then
        Assert.assertEquals(expectedName, actualName);
    }
}
