package patterns.observer;

public class Main {

  public static void main(String[] args) {
    Connection observable = new Connection();
    Connection observable2 = new Connection();

    SocialMediaFeed observer = new SocialMediaFeed();

    observable.addPropertyChangeListener(observer);
    observable2.addPropertyChangeListener(observer);

    observable.setStatus("going for a walk");
    observable2.setStatus("eating my lunch");

    observer.printStatuses();
  }
}
