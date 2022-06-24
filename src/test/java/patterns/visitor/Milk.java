package patterns.visitor;

public class Milk implements Groceries {

  private double price = 2;

  public void setPrice(double price) {
    this.price = price;
  }

  public double getPrice() {
    return price;
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

}
