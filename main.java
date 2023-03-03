package felidae;

/**
 *
 * @author Dafaa
 */
public class main {
    public static void main(String[] args) {
        Animal[] sampel = new Animal[3];
        
        sampel[0] = new Felis("Felis catus", "Brown", 12, "British Short Hair");
        sampel[1] = new Panthera("Panthera tigris", "Striped", 8, "Deer");
        sampel[2] = new Acinonyx("Acinonyx jubatus", "Spot", 8, 100);
        
        for(int i = 0; i < 3; i++) {
            System.out.println(sampel[i]);
            System.out.println();
        }
    }
}
