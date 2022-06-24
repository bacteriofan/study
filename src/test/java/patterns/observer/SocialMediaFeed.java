package patterns.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public class SocialMediaFeed implements PropertyChangeListener {

  private ArrayList<String> statuses = new ArrayList<>();

  public void printStatuses() {
    statuses.forEach(System.out::println);
  }

  public void propertyChange(PropertyChangeEvent event) {
    statuses.add((String) event.getNewValue());
  }

}
