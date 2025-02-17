package rocks.zipcode.io.comparators.idcomparator;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.comparators.IdComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NegativeCompareToTest {
    @Test
    public void test1() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>)new IdComparator();
        Item item1 = new Item(0L, null, null);
        Item item2 = new Item(1L, null, null);

        // when
        Integer comparisonValue = idComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }

    @Test
    public void test2() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>)new IdComparator();
        Item item1 = new Item(1L, null, null);
        Item item2 = new Item(2L, null, null);

        // when
        Integer comparisonValue = idComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }


    @Test
    public void test3() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>)new IdComparator();
        Item item1 = new Item(2L, null, null);
        Item item2 = new Item(3L, null, null);

        // when
        Integer comparisonValue = idComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }

    @Test
    public void test4() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>)new IdComparator();
        Item item1 = new Item(3L, null, null);
        Item item2 = new Item(4L, null, null);

        // when
        Integer comparisonValue = idComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }

    @Test
    public void test5() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>)new IdComparator();
        Item item1 = new Item(4L, null, null);
        Item item2 = new Item(5L, null, null);

        // when
        Integer comparisonValue = idComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }


    @Test
    public void test6() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>)new IdComparator();
        Item item1 = new Item(5L, null, null);
        Item item2 = new Item(6L, null, null);

        // when
        Integer comparisonValue = idComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }
}
