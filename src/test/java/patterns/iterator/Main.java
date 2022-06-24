package patterns.iterator;

public class Main {

  public static void main(String[] args) {

    Item pens = new Item("pens", 175);
    Item pencils = new Item("pencils", 0);
    Item paper = new Item("paper", 500);

    Inventory inventory = new Inventory(pens, pencils, paper);
    StockIterator iterator = inventory.iterator();
    while (iterator.hasNext()) {
      Item item = iterator.next();
      System.out.println(item.getName());
    }


  }

}
