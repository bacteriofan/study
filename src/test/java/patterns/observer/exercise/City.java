package patterns.observer.exercise;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class City {

  private String trafficUpdate = "";
  private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

  public void updateTraffic(String trafficUpdate) {
    propertyChangeSupport.firePropertyChange("traffic", this.trafficUpdate, trafficUpdate);
    this.trafficUpdate = trafficUpdate;
  }

  public void propertyChangeListener(PropertyChangeListener listener) {
    propertyChangeSupport.addPropertyChangeListener(listener);
  }
}
