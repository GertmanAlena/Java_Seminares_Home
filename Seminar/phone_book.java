import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class phone_book {
    
    private static HashMap<String, String> phone_book = new HashMap<String, String>();
    
    private static void save() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("my_phone.txt")));
        for(Map.Entry<String,String> k: phone_book.entrySet()){
            writer.write(k.getKey() + " " + k.getValue()+System.lineSeparator());
        }
        writer.close();
    }
    private static void clear() {
        phone_book.clear();
        System.out.println("\033[3;36;42mСправочник пуст!!\033[0m");
    }
    public static void loadBD() throws IOException {
        File file = new File("my_phone.txt");
        if (file.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader(new File("my_phone.txt")));
            String act;
            while ((act=reader.readLine())!=null) {
                String[] read_book = act.split(" ");
                phone_book.put(read_book[0], read_book[1]);
            }
            reader.close();
        }
    }

    private static void add_act(String telephone, String surname) {
        phone_book.put(telephone, surname.substring(0, 1).toUpperCase() + surname.substring(1));
    }

    private static void del_act(String telephone) {
        phone_book.remove(telephone);
        System.out.println("Данные удалены из справочника");
    }
    private static String[] search_sur(String telephone) {
        List <String> result = new ArrayList<String>();
        for (Map.Entry entry : phone_book.entrySet()) {
            if (telephone.equalsIgnoreCase((String)entry.getKey())){
                result.add((String)entry.getKey());
            }
        }
        if (result.size() == 0) result.add("абонент с таким телефоном не найден");
        return result.toArray(new String[0]);

        // String result = phone_book.get(telephone);
        // if (result == null) return "абонент с таким номером не найдей";
        // return result;
    }

    private static String[] search(String surname) {
        List <String> result = new ArrayList<String>();
        for (Map.Entry entry : phone_book.entrySet()) {
            if (surname.equalsIgnoreCase((String)entry.getValue())){
                result.add((String)entry.getKey());
            }
        }
        if (result.size() == 0) result.add("абонент с такой фамилией не найден");
        return result.toArray(new String[0]);
    }

    public static void PrintPhonebook(){
        int count = 1;
        if (phone_book.isEmpty()) System.out.println("\033[3;36;42mСправочник пуст!!\033[0m");
        else {
            System.out.println("\033[3;35mТелефонный справочник:\033[0m ");
            for(Map.Entry<String,String> k: phone_book.entrySet()){
            System.out.printf("contact №%d - ", count, k.getKey() +": "+ k.getValue());
            System.out.println(k.getKey() +": "+ k.getValue());
            count++;
            }
        }

    }
    public static void main(String[] args) throws IOException {
        
        String act;
        loadBD();
        PrintPhonebook();

        System.out.println("\033[3;36;44m выбери, что будем делать: \033[0m \n\033[3;36m(add)\033[0m добавить, \n\033[3;36m(del)\033[0m удалить данные, " +
        "\n\033[3;36m(search)\033[0m найти номера по фамилии, \n\033[3;36m(sur)\033[0mнайти фамилию, \n\033[3;36m(exit)\033[0mвыход, \n\033[3;36m(clear)\033[0mочистить книгу, \n\033[3;36m(oll)\033[0mпоказать все записи");

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        act = bf.readLine();

        while (!act.equals("exit")) {
            if (act.equals("add")) {
                System.out.print("\033[4mВведите фамилию -> \033[0m");
                String surname = bf.readLine();
                System.out.println("\033[4mВведите телефон -> \033[0m");
                String telephone = bf.readLine();
                add_act(telephone, surname);
                save();
                System.out.printf("\033[3;36;42mКонтакт %s %s загружен!\033[0m", surname, telephone);
                
            }
            if (act.equals("del")) {
                System.out.println("Введите телефон, по которому нужно удалить ->");
                String telephone = bf.readLine();
                del_act(telephone);
                save();
            }
            if (act.equals("search")) {
                System.out.println("Введите фамилию, которую ищем ->");
                String surname = bf.readLine();
                
                String[] search_contact = search(surname);
                for (String contact: search_contact){
                    System.out.println(contact);
                }
            }
            if (act.equals("sur")) {
                System.out.println("Введите номер ->");
                String telephone = bf.readLine();
                               
                System.out.println(search_sur(telephone));
                
            }  
            if (act.equals("clear")) {
                clear();
                save();
            }            
            if (act.equals("oll")) {
                PrintPhonebook();
            }
        System.out.println("\n\033[4mвыбери, что будем делать:\033[0m \n\033[3;36m(add)\033[0m добавить, \n\033[3;36m(del)\033[0m удалить данные, " +
        "\n\033[3;36m(search)\033[0m найти номера по фамилии, \n\033[3;36m(sur)\033[0mнайти фамилию, \n\033[3;36m(exit)\033[0mвыход, \n\033[3;36m(clear)\033[0mочистить книгу, \n\033[3;36m(oll)\033[0mпоказать все записи");

        act = bf.readLine();
        }

     
        
    }    

}

    