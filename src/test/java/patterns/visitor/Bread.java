package patterns.visitor;

public class Bread implements Groceries {

  private double price = 1;

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
