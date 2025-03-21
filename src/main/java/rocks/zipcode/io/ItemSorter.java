package rocks.zipcode.io;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    private final Item[] items; // Store the array of items

    public ItemSorter(Item[] items) {
        this.items = items; // Assign the constructor argument to the class field
    }

    public Item[] sort(Comparator<Item> comparator) {
        Arrays.sort(items, comparator); // Ensure sorting is type-safe
        return Arrays.copyOf(items, items.length, Item[].class); // Explicitly return an Item[] array
    }
}