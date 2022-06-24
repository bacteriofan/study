package patterns.abstractFactory;

/**
 *
 * @author bethan
 */
public class MountainBikeTire extends Tire {

    private static final String width = "WIDE";

    private static final String pressure = "MEDIUM";
    
    @Override
    public void getDescription() {
        System.out.println("Mountain bike tire. Width: " + width + ", pressure: " + pressure);        
    }

}
