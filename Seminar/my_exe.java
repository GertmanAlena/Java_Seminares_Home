// import java.io.BufferedWriter;
// import java.io.FileOutputStream;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.io.OutputStreamWriter;
// import java.nio.charset.StandardCharsets;
// import java.util.HashMap;
// import java.util.Scanner;

// public class my_exe {
//     static Object o;
//     public static void main(String[] args) {

//         HashMap<String, String> map = new HashMap<>();
        
//         // false -> true, если надо продолжать писать в файл при его наличии, с false файл будет очищен 
//         // try (FileWriter writer = new FileWriter("my.j", false)) 
//         try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("my.json", true), StandardCharsets.UTF_8))){

//             Scanner iScanner = new Scanner(System.in);
//             System.out.print("Input a -> ");
//             String a = iScanner.next();
//             System.out.print("Input b -> ");
//             String b = iScanner.next();
//             writer.write(a);
//             writer.write(b);
//             // запись по символам
//             // writer.append('\n');
//             // writer.append('E');
//             writer.flush(); // до этого данные в буфере, после вызова в файл
            
//         } catch (Exception e) {
//             // TODO: handle exception
//             System.out.println(e.getMessage());
//         }
//         read_file();
//     }
    
//     public static void read_file() {

//         try(FileReader reader = new FileReader("my.json"))
//         {
//         // читаем посимвольно
//             int c;
//             while((c=reader.read())!=-1){
//                 System.out.print((char)c);
        
//             } 
//         }
//         catch(IOException ex){
            
//             System.out.println(ex.getMessage());
//         }   
//         return;
//    } 
// }
