package patterns.templateMethod;

public class Main {

  public static void main(String[] args) {
    VegetarianPizza vegetarian = new VegetarianPizza();
    vegetarian.makeBase();
    vegetarian.addToppings();
    vegetarian.cook();

    System.out.println();

    MeatFeastPizza meatFeast = new MeatFeastPizza();
    meatFeast.makeBase();
    meatFeast.addToppings();
    meatFeast.cook();
  }

}
