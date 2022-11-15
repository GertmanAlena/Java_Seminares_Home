package Cat;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Kotik", "blue", "pers", 2);
        Cat cat2 = new Cat("Barsik", "whit", null, 5);
        Cat cat3 = new Cat("Kotik", "whit", null, 7);

        Cat.addCat(cat1);
        Cat.addCat(cat2);
        Cat.addCat(cat3);
                
        Human human1 = new Human();
        human1.idHuman = 1;
        human1.nameHuman = "Lena";
        human1.surnameHuman = "Hertman";
        human1.ageHuman = 37;

        Human human2 = new Human();
        human2.idHuman = 2;
        human2.nameHuman = "Лиза";
        human2.surnameHuman = "Гертман";
        human2.ageHuman = 12;
        Human.hashHuman(human1);
        Human.hashHuman(human2);

    System.out.println(Cat.ll);
    
    // System.out.println(Cat.ll.get(1));
    System.out.println(Human.humans);
      
    // System.out.println(cat2);
    // System.out.println(human1); 
    // System.out.println(human2);   

    // System.out.println(cat1 == cat2);
    // System.out.println(human1.equals(cat1));
    // System.out.println(human2.equals(cat1));
    }
}
