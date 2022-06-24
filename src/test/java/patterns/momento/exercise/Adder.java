package patterns.momento.exercise;

public class Adder {

  private int result;
  private Momento momento = new Momento();

  public void add(int newNumber) {
    result += newNumber;
  }

  public int getResult() {
    return result;
  }

  public void save() {
    momento.save(this.result);
  }

  public void undo() {
    this.result = momento.getState();
  }

}
