package patterns.mediator;

public class Mediator {

    private Runway runway;
    private PlanesInFlight planesInFlight;
    private PlanesOnGround planesOnGround;


    public Mediator() {
        runway = new Runway();
        planesInFlight = new PlanesInFlight();
        planesOnGround = new PlanesOnGround();
    }

    public void takeOff(Plane plane) {
        if (!plane.getIsInTheAir() && runway.getIsAvailable()) {
            System.out.println("Plane " + plane.getId() + " is taking off...");
            planesOnGround.removePlane(plane);
            planesInFlight.addPlane(plane);
            plane.setIsInTheAir(true);
            runway.setIsAvailable(false);
        }
    }
}
