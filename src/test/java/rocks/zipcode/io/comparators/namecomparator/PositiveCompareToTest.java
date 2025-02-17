package rocks.zipcode.io.comparators.namecomparator;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.comparators.NameComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PositiveCompareToTest {
    @Test
    public void test1() {
        // given
        Comparator<Item> nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(null, "Apple", null);
        Item item2 = new Item(null, "Banana", null);

        // when
        Integer comparisonValue = nameComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }

    @Test
    public void test2() {
        // given
        Comparator<Item>nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(null, "Banana", null);
        Item item2 = new Item(null, "Wild Cherry", null);

        // when
        Integer comparisonValue = nameComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }


    @Test
    public void test3() {
        // given
        Comparator<Item>nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(null, "Plums", null);
        Item item2 = new Item(null, "Pumpkin", null);

        // when
        Integer comparisonValue = nameComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }

    @Test
    public void test4() {
        // given
        Comparator<Item>nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(null, "Banana", null);
        Item item2 = new Item(null, "apple", null);

        // when
        Integer comparisonValue = nameComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }

    @Test
    public void test5() {
        // given
        Comparator<Item>nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(null, "Banana", null);
        Item item2 = new Item(null, "wild Cherry", null);

        // when
        Integer comparisonValue = nameComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }


    @Test
    public void test6() {
        // given
        Comparator<Item>nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(null, "Plums", null);
        Item item2 = new Item(null, "pumpkin", null);

        // when
        Integer comparisonValue = nameComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }

}
