import java.lang.management.GarbageCollectorMXBean;

// +На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
// - команда 1 (к1): увеличить а в с раз, а умножается на c
// - команда 2 (к2): увеличить на d, к a прибавляется d
// написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b или сообщить, что это невозможно
// Пример 1: а = 1, b = 7, c = 2, d = 1
// ответ: к2, к2, к2, к2, к2, к2, k2 или к1, к1, к2, к2, к2 
// Можно начать с более простого – просто подсчёта общего количества вариантов 
// Пример 2: а = 11, b = 7, c = 2, d = 1
// ответ: нет решения. 
// *Подумать над тем, как сделать минимальное количество команд

public class One_seminar {
    public static void main(String[] args) {
        int a = 1, b = 7;
        int c = 2, d = 1;
        int k1_sum = 0;
        int k2_sum = 0;
        if (a * c > b)
            System.out.println("попробуем сначала сложение");
        if (a + c > b)
            System.out.println("даже сложение - это много");
        if (a < b) {
            k1_sum = sum(a, b, d, k1_sum);
            k2_sum = mult(a, b, c, k2_sum, d);
        }
        System.out.printf("\nk1 = %d", k1_sum);
        System.out.printf("\nk2 = %d", k2_sum);

    }

    private static int mult(int a, int b, int c, int counts, int d) {
        // if (a * c > b) return sum(a, b, d, counts);
        if (a * c > b) {
            counts = sum(a, b, d, counts);
        return counts;
    }
        if (a * c < b) {
            a *= c;
            counts++;
            System.out.print(a + " ");
            mult(a, b, c, counts, d);
        }
        return counts;
    }

    private static int sum(int a, int b, int d, int counts) {
        while (a < b) {
            a += d;
            counts++;
            System.out.print(a + " ");
        }
        return counts;

    }
}
