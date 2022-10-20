import java.util.Scanner;

// Написать программу, показывающую последовательность действий для игры “Ханойская башня”
public class Home2 {
    // static int m = 0;
    // public static void main(String[] args) {
    // Scanner iScanner = new Scanner(System.in);
    // System.out.printf(" input n: -> ");
    // Integer n = iScanner.nextInt();
    // iScanner.close();
    // char x = 'x';
    // char y = 'y';
    // char z = 'z';
    // hanoi(n, x, y, z);
    // System.out.printf("\nвсего %d ходов(-а) на %d дисков(-а)", m, n);
    // }
    // /**
    // * метод действий
    // */
    // public static void hanoi(int n, char x, char y, char z){
    // if (n == 1){
    // count(n, x, z);}
    // else{
    // hanoi(n-1, x, z, y);
    // count(n, x, z);
    // hanoi(n-1, y, x, z);
    // }
    // }
    // /**
    // * метод подсчёта количества ходов и запись с какого столбца на какой
    // переставляется диск
    // */
    // private static void count(int n, char a, char b) {
    // m++;
    // System.out.printf("\n%d ход - %d диск - с %c на %c", m, n, a, b);

    // }

    // Реализовать алгоритм сортировки вставками

    public static void main(String[] args) {
        int arr[] = new int[] { 5, 77, 2, 1, 3, 5, 8, 12, 7 }; // 1 , 2 , 5 , 77 ,  ,
                                                                           // 1
        for (int i = 1; i < arr.length; i++) {          // i = 3 j = 0

            int min = arr[i]; 
            int j = i - 1;
            while (j >= 0 && arr[j] > min) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = min;
        }          
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
