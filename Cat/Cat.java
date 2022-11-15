package Cat;

import java.util.HashSet;
import java.util.LinkedList;

public class Cat {
    String nameCat;
    String colorCat;
    String breedCat;
    int ageCat;
    // public static HashSet<Cat> cats = new HashSet<>();

    public static LinkedList<Cat> ll = new LinkedList<>();
    public Cat(String nameCat, String colorCat, String breedCat, int ageCat) {
        this.nameCat = nameCat;
        this.colorCat = colorCat;
        this.breedCat = breedCat;
        this.ageCat = ageCat;
    }
   
    @Override
    public String toString() {
        return String.format("%s %s %s %d", nameCat, colorCat, breedCat, ageCat);
    }
    
    static void addCat(Cat cat) {
        
        ll.add(cat);
    }
    
}
