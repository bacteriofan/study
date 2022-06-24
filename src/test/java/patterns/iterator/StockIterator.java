package patterns.iterator;

import java.util.Iterator;

public class StockIterator implements Iterator {

  private Inventory inventory;
  private int index = 0;

  public StockIterator(Inventory inventory) {
    this.inventory = inventory;

  }

  public boolean hasNext() {
    Item[] items = inventory.getItems();
    if (index < items.length) {
      return true;
    } else {
      return false;
    }
  }

  public Item next() {
    Item[] items = inventory.getItems();
    if (hasNext()) {
      Item item = items[index++];
      if (item.getQuantity() > 0) {
        return item;
      } else {
        return next();
      }
    } else {
      return null;
    }
  }

  public void remove() {

  }

}
