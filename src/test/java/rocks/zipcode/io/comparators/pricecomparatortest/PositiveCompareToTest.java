package rocks.zipcode.io.comparators.pricecomparatortest;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.comparators.PriceComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PositiveCompareToTest {
    @Test
    public void test1() {
        // given
        Comparator<Item> priceComparator = (Comparator<Item>)new PriceComparator();
        Item item1 = new Item(null, null, 0.0);
        Item item2 = new Item(null, null, 1.0);

        // when
        Integer comparisonValue = priceComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }

    @Test
    public void test2() {
        // given
        Comparator<Item> priceComparator = (Comparator<Item>)new PriceComparator();
        Item item1 = new Item(null, null, 1.0);
        Item item2 = new Item(null, null, 1.1);

        // when
        Integer comparisonValue = priceComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }


    @Test
    public void test3() {
        // given
        Comparator<Item> priceComparator = (Comparator<Item>)new PriceComparator();
        Item item1 = new Item(null, null, 2.5);
        Item item2 = new Item(null, null, 7.0);

        // when
        Integer comparisonValue = priceComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }

    @Test
    public void test4() {
        // given
        Comparator<Item> priceComparator = (Comparator<Item>)new PriceComparator();
        Item item1 = new Item(null, null, 10.0);
        Item item2 = new Item(null, null, 20.0);

        // when
        Integer comparisonValue = priceComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }

    @Test
    public void test5() {
        // given
        Comparator<Item> priceComparator = (Comparator<Item>)new PriceComparator();
        Item item1 = new Item(null, null, 15.0);
        Item item2 = new Item(null, null, 17.0);

        // when
        Integer comparisonValue = priceComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }


    @Test
    public void test6() {
        // given
        Comparator<Item> priceComparator = (Comparator<Item>)new PriceComparator();
        Item item1 = new Item(null, null, 31.0);
        Item item2 = new Item(null, null, 34.0);

        // when
        Integer comparisonValue = priceComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }
}
