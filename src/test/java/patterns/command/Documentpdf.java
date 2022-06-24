package patterns.command;

public class Documentpdf extends Document {

  public void save() {
    System.out.println("Saving pdf document...");
  }

  public void print() {
    System.out.println("Printing pdf document...");
  }


}
