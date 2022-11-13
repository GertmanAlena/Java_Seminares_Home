package Cat;

public class Cat {
    String nameCat;
    String colorCat;
    String breedCat;
    int ageCat;
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
}
