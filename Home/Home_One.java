import java.util.Scanner;

public class Home_One {
    /**
     * Реализовать алгоритм пирамидальной сортировки (HeapSort)
     * метов main точка входа
     */
    // public static void main(String args[]) {
    //     int arr[] = new int[20];
    //     for (int i = 0; i < arr.length; i++) {
    //         arr[i] = ((int) (Math.random() * 55) - 15);
    //     }
    //     System.out.println("random");
    //     for (int i = 0; i < arr.length; i++)
    //         System.out.print(arr[i] + " ");
    //     System.out.println();
    //     // int arr[] = { 54, 9, -2, 88, -45, 142, 33, 12, 12, 45, 76 };
    //     sort(arr);
    //     System.out.println("sort");
    //     for (int i = 0; i < arr.length; i++)
    //         System.out.print(arr[i] + " ");
    //     System.out.println();
    // }
    // /**
    //  * метод сортировки чисел
    //  */
    // public static void sort(int arr[]) {
    //     int n = arr.length;
    //     for (int i = n / 2 - 1; i >= 0; i--)
    //         heap(arr, n, i);
    //     for (int i = n - 1; i > 0; i--) {
    //         int temp = arr[0];
    //         arr[0] = arr[i];
    //         arr[i] = temp;
    //         heap(arr, i, 0);
    //     }
    // }
    // /**
    //  * сортировка кучи после неких изменений
    //  */
    // public static void heap(int arr[], int n, int i) {
    //     int index_left = i * 2 + 1;
    //     int index_right = i * 2 + 2;
    //     int max = i;
    //     if (index_left < n && arr[index_left] > arr[max]) {
    //         max = index_left;
    //     }
    //     if (index_right < n && arr[index_right] > arr[max]) {
    //         max = index_right;
    //     }
    //     if (i != max) {
    //         int temp = arr[i];
    //         arr[i] = arr[max];
    //         arr[max] = temp;
    //         heap(arr, n, max);
    //     }
    // }

    /**
     * Треугольное число
     * Tn = n(n+1)/2
     */
    public static void main(String[] args) {

        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.print("n = ");
            int n = iScanner.nextInt();
            int T = math(n);
            for (int i = 0; i <= T; i++){
                System.out.print(i + " ");
            }
            System.out.printf("\nTn = %d", T);
        }
        }

    private static int math(int n) {
        if (n == 1) return n;
        else return n + math(n - 1);
        }

}

    
