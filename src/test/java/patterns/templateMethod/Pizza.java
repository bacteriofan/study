package patterns.templateMethod;

public abstract class Pizza {

  public void makeBase() {
    System.out.println("Mix flour, yeast and salt");
    System.out.println("Roll out the dough");
  }

  public void addToppings(){
    System.out.println("Add tomato");
    System.out.println("Add cheese");
  }

  public void cook(){}

}
