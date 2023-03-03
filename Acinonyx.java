package felidae;

/**
 *
 * @author Dafaa
 */
public class Acinonyx extends Felidae{
    private final double speed;
    
    public Acinonyx(String name, String fur, int lifespan, double speed) {
        super(name, fur, lifespan);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nSpeed: " + this.speed + " km/h";
    }
}
