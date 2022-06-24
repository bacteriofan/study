package patterns.mediator;

public class Main {

  public static void main(String[] args) {

    Mediator mediator = new Mediator();
    mediator.takeOff(new Plane(1));
  }

}
