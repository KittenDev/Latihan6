package felidae;

/**
 *
 * @author Dafaa
 */
public class Felis extends Felidae implements Pet{
    private final String race;
    
    public Felis(String name, String fur, int lifespan, String race) {
        super(name, fur, lifespan);
        this.race = race;
    }

    @Override
    public int petLifeSpan() {
        return this.getLifespan() + 5;
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    public String getRace() {
        return race;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRace: " + this.race + "\nDomestic Lifespan: " + this.petLifeSpan();
    }
}
