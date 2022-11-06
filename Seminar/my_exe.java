import java.util.LinkedList;
import java.util.Scanner;

public class my_exe {

    /**удаляем гласные из текста */
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите текст -> ");
        String text = iScanner.nextLine();
        String[] gl = {"a", "e", "y", "u", "i", "o"};
            for (int i = 0; i < gl.length; i++) {
                text = text.replace(gl[i], "");  //находит в тексте гласную и заменяет её на пустое место
            }
        System.out.println(text);
    }
}
    // /**выводим инициалы имени и фамилии */
    // public static void main(String[] args) {
    //     Scanner iScanner = new Scanner(System.in);
    //     System.out.println("Введите имя и фамилию через пробел -> ");
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

// Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива 
    //(пропусков быть не должно).
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

//     // Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
//     // Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.
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

//     //Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
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