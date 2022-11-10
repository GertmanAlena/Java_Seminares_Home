// import java.util.LinkedList;
import java.util.Scanner;

public class my_exe {

                            /**в предложении ��лова из 5 и более букв перевернут�� */
    public static void main(String[] args) {
        try (Scanner iScanner = new Scanner(System.in)) {
            // PrintStream ps = new PrintStream(System.out);
            System.out.print("input -> ");
            String text = iScanner.nextLine();
            String[] new_text = text.split(" ");
            for (int i = 0; i < new_text.length; i++) {
                new_text[i] = Up(new_text[i]);
                
                if (new_text[i].length() > 4) {
                    char[] array = new_text[i].toCharArray(); // слово перевели в массив
                    String word_revers = "";
                    for (int j = array.length-1; j >= 0; j--) {
                        word_revers = word_revers + array[j];
                    }
                    new_text[i] = word_revers;
                }
            }
            for (int i = 0; i < new_text.length; i++) {
                System.out.print(new_text[i] + " ");
            }
            
        }
    }
    private static String Up(String word) {

        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    
}  

                        /**поделит�� ��лово на ча��ти по две буквы */
//     public static void main(String[] args) {
//         try (Scanner iScanner = new Scanner(System.in)) {
//             System.out.println("input -> ");
//             String a = iScanner.nextLine();
//             del_word(a);
//         }
//     }

//     private static void del_word(String a) {
//         ArrayList<String> slog = new ArrayList<>();
//         if (a.length() % 2 != 0) {
//             a = a + "_";
//         }
//         for (int i = 0; i < a.length()-1; i+=2) {
            
//             slog.add(a.charAt(i) + String.valueOf(a.charAt(i+1)));
//         }
//         System.out.println(slog);
//     }   
// }

                                            // /**выве��ти ��ередину ��лова */
//     public static void main(String[] args) {
//         try (Scanner iScanner = new Scanner(System.in)) {
//             System.out.println("input -> ");
//             String a = iScanner.nextLine();
//             String res = sr_simbol(a);
//             System.out.println(res);
//         }
//     }

//     private static String sr_simbol(String a) {
//         if (a.length() % 2 == 0) {   // qwerty lengs = 6 выве��ти 3,4  000000 0 000000
            
//             int x = a.length() / 2;  // фывапрол длина = 8 выве��ти 4,5
//             String res = a.substring(x-1, x+1);
//             return res;
//         }
//         if (a.length() % 2 != 0) {   // qwert lengs = 5 выве��ти 3
            
//             int x = a.length() / 2;  // фыв а про длина = 7 выве��ти 3
//             String res = a.substring(x, x+1);
//             return res;
//         }
//         return a;
//     }   
// }
// /**��умма цифр между чи��лами */
    // public static void main(String[] args) {
    //     Scanner iScanner = new Scanner(System.in);
    //     System.out.println("input -> ");
    //     int a = iScanner.nextInt();
    //     System.out.println("input -> ");
    //     int b = iScanner.nextInt();
    //     int sum_num = sum(a,b);
    //     System.out.println(sum_num);
    // }

    // // private static int sum(int a, int b) {
    //     int sum = 0;
    //     if (a < b) {
    //         while (a <= b) {
    //             sum += a;
    //             a++;
    //         }
    //         return sum;
    //     }
    //     if (a > b) {
    //         while (a >= b) {
    //             sum += a;
    //             a--;
    //         }
    //         return sum;
    //     }
    //     return sum;
    // }   
// }
                                             /**��умма цифр чи��ла - рекур��и�� */
    // public static void main(String[] args) {
    //    Scanner iScanner = new Scanner(System.in);
    //    System.out.println("Input number -> ");
    //    int a = iScanner.nextInt();
    //    int res = sum(a);
    //    System.out.println(res);
       
    // }

    // private static int sum(int a) {
    //      if (a < 10) return a;
    //      return a % 10 + sum(a/10);
    // }

                                            // /**удал��ем гла��ные из тек��та */
    // public static void main(String[] args) {
    //     try (Scanner iScanner = new Scanner(System.in)) {
    //         System.out.println("Введите тек��т -> ");
    //         String text = iScanner.nextLine();
    //         String[] gl = {"a", "e", "y", "u", "i", "o"};
    //             for (int i = 0; i < gl.length; i++) {
    //                 text = text.replace(gl[i], "");  //находит в тек��те гла��ну�� и замен��ет её на пу��тое ме��то
    //             }
    //         System.out.println(text);
    //     }
    // }
//}
                                             // /**выводим инициалы имени и фамилии */
    // public static void main(String[] args) {
    //     Scanner iScanner = new Scanner(System.in);
    //     System.out.println("Введите им�� и фамили�� через пробел -> ");
    //     String name = iScanner.nextLine();
    //     String[] res = name.split(" ");
    //     StringBuffer abbrev = new StringBuffer();
    //     // abbrev.insert(0, res[1].substring(0,1).toUpperCase());
    //     // abbrev.insert(0, res[0].substring(0,1).toUpperCase());
    //     // System.out.println(abbrev);
    //     String a = res[0].substring(0,1).toUpperCase();
    //     String b = res[1].substring(0,1).toUpperCase();
    //     System.out.printf("%s.%s",a, b);
    // }
//}

// Дан ма����ив целых чи��ел и ещё одно целое чи��ло. Удалите в��е вхождени�� ��того чи��ла из ма����ива 
    //(пропу��ков быт�� не должно).
// public class my_exe {

//     public static void main(String[] args) {
//         LinkedList<Integer> ll = new LinkedList<>();
//         int[] mass = {1, 5, 8, 12, 2, 4, 6, 1};
//         int num = 1;
//         for (int i = 0; i < mass.length; i++) {
//             if (mass[i] != num) {
//                 ll.add(mass[i]);
//             }
//         }
//         System.out.println(ll);
//     }
// }

//     // ��апи��ите программу, котора�� выводит на кон��ол�� про��тые чи��ла в промежутке от [2, 100].
//     // ����пол��зуйте дл�� ре��ени�� ��той задачи оператор "%" (о��таток от делени��) и циклы.
// public class my_exe {

//     public static void main(String[] args) {

//         for (int i = 2; i < 101; i++) {
//             boolean yes = true;
//             for (int j = 2; j < i; j++) {
                
//                 if (i % j == 0 ){
//                     yes = false;
//                     break;
//                 }
//             }
//             if (yes) {
//                 System.out.printf("%d, ",i);
//             }
//         }
//     }

// }

//     //Заполните ма����ив ��лучайным чи��лами и выведите мак��имал��ное, минимал��ное и ��реднее значение.
// public class my_exe {
//     public static double[] random_mass = new double[10];
//     public static void main(String[] args) {
    
//     new_random();
//     System.out.println();
//     print_mass(random_mass);
//     min_max(random_mass);
//     sort(random_mass);
    
//   }

//     private static void sort(double[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length-i-1; j++) {
//                 if (arr[j] >  arr[j+1]){
//                     double temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.printf("%.3f ",arr[i]);
//         }
//     }

//     private static void min_max(double[] random_mass2) {
//         double max = random_mass[0];
//         double min = random_mass[0];
//         double sum = 0;
//         for (int i = 1; i < random_mass.length; i++) {
//             if (random_mass[i] > max) max = random_mass[i];
//             if (random_mass[i] < min) min = random_mass[i];
//             sum += random_mass[i];
//         }
//         double sr = sum / random_mass.length;
//     System.out.printf("min = %.3f; max = %.3f; sr = %.3f", min, max, sr);
//     System.out.println();
//     }

//     private static void new_random() {
//         for (int i = 0; i < random_mass.length; i++) {
//             random_mass[i] = Math.random();
//         }
//     }
    
//     private static void print_mass(double[] random_mass2) {
//         for (int i = 0; i < random_mass2.length; i++) {
//             System.out.printf("%.3f ",random_mass2[i]);
//         }
//     }

// }