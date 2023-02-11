public class Plane {

    private final PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public int getPlaneCapacity(){
        return planeType.getCapacity();
    }

    public double getPlaneWeight() {
        return planeType.getWeight();
    }
}
