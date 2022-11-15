package Cat;

import java.util.HashSet;

public class Human {
    int idHuman;
    String nameHuman;
    String surnameHuman;
    int ageHuman;
    public static HashSet<Human> humans = new HashSet<>();
    @Override
    public String toString() {
        
        return String.format("id:%d %s %s %d лет", idHuman, nameHuman, surnameHuman, ageHuman);
    }
    @Override
    public boolean equals(Object o) {
        Cat t = (Cat) o;
        // как пройти по всем котикам
        return (t.nameCat == "Kotik" && nameHuman == "Lena" && t.colorCat == "whit");
        
    }
    static void hashHuman(Human human) {
        humans.add(human);
    }
}
