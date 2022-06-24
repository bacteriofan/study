package patterns.iterator;

public class Inventory implements Iterable {

  private Item[] items;

  public Inventory(Item... items) {
    this.items = items;
  }

  public Item[] getItems() {
    return items;
  }

  public StockIterator iterator() {
    return new StockIterator(this);
  }

}
