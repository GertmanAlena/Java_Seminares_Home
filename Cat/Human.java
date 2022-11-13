package Cat;

public class Human {
    int idHuman;
    String nameHuman;
    String surnameHuman;
    int ageHuman;
    
    @Override
    public String toString() {
        
        return String.format("id:%d %s %s %d лет", idHuman, nameHuman, surnameHuman, ageHuman);
    }
}
