package felidae;

/**
 *
 * @author Dafaa
 */
public class Felidae extends Animal{
    private final String name;
    private final String fur;
    private final int lifespan;
    
    public Felidae(String name, String fur, int lifespan)
    {
        this.name = name;
        this.fur = fur;
        this.lifespan = lifespan;
    }

    public String getName() {
        return name;
    }

    public String getFur() {
        return fur;
    }

    public int getLifespan() {
        return lifespan;
    }
    
    @Override
    public void animalFood() {
        System.out.println("Carnivore");
    }
    
    @Override
    public String toString()
    {
        return """
               This is family of Felidae
               Name: """ + this.name + "\nFur: " + this.fur + "\nLifespan: " + this.lifespan;
    }
}
