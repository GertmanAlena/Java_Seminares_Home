package Cat;

public class Main {
    public static void main(String[] args) {
        
        Cat cat1 = new Cat("Kotik", "blue", "pers", 2);
        Cat cat2 = new Cat("Barsik", "whit", null, 5);

        Human human1 = new Human();
        human1.idHuman = 1;
        human1.nameHuman = "Lena";
        human1.surnameHuman = "Hertman";
        human1.ageHuman = 37;

    System.out.println(cat1);
    System.out.println(cat2);
    System.out.println(human1);    

    System.out.println(cat1 == cat2);

    }
}
