package felidae;

/**
 *
 * @author Dafaa
 */
public class Panthera extends Felidae{
    private final String prey;
    
    public Panthera(String name, String fur, int lifespan, String prey) {
        super(name, fur, lifespan);
        this.prey = prey;
    }

    public String getPrey() {
        return prey;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nPrey: " + this.prey;
    }
}
