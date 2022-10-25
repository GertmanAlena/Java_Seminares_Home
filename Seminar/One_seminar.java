import java.util.ArrayList;
import java.util.List;

public class One_seminar {
    public static List<Integer> next_step = new ArrayList<Integer>();
    static int i;
    static int j;
    static int x1 = 0;
    static int x2 = 0;
    static int x3 = 0; // если будет третий выход
    static int x1_coord_i = 0;
    static int x1_coord_j = 0;
    static int count;

    public static void main(String[] args) {

        int[][] lab = {
                // 0 1 2 3 4 5 6 7 8
                {  0,  0,  0,  0,  0,  0,  0,  0,  0 }, // 0 start[3][0] finish [6][8]
                {  0,  0,  0, -2,  0,  0,  0,  0,  0 }, // 1
                {  0, -2,  0, -2, -2, -2, -2,  0,  0 }, // 2
                { -3, -2,  0, -2,  0,  0, -2, -2,  0 }, // 3
                {  0, -2,  0, -2,  0,  0,  0, -2,  0 }, // 4
                {  0, -2, -2, -2, -2, -2,  0, -2,  0 }, // 5
                {  0,  0, -2,  0,  0,  0,  0, -2, -1 }, // 6
                {  0,  0, -2,  0, -2, -2, -2, -2,  0 }, // 7
                {  0,  0,  0,  0,  0,  0,  0,  0,  0 }, // 8
        };
        print(lab);
        search_start(lab);
        // int i = 3;
        // int j = 0;
        // lab[i][j] = 1;

        // step(lab, i, j);
        print2(lab);
 
        start_out(lab, x1, x2);
        System.out.printf("\n \033[3;36;44mпо короткому пути до выхода %d шагов\033[0m", x1);
        print_finish(lab);
    }

    private static void search_start(int[][] lab) {
        for (int i = 0; i < lab.length; i++) {
            for (int j = 0; j < lab[i].length; j++) {
                if (lab[i][j] == -3){
                    lab[i][j] = 1;
                    step(lab, i, j);
                }
            }
            
        }
    }

    /**
     * метод проверок шагов по приоритетам и заполнения шага в лабринте следующим
     * числом
     */
    private static void step(int[][] lab, int i, int j) { // i = 3 j = 0 cou = 2
        if (i - 1 >= 0 && lab[i - 1][j] == -1) {
            System.out.print("exit"); // если дошли до выхода снизу
            x1 = lab[i][j] + 1;
            x1_coord_i = i - 1;
            x1_coord_j = j;
            next(lab);
        }
        // вверх
        if (i - 1 >= 0 && lab[i - 1][j] == 0) {
            lab[i - 1][j] = lab[i][j] + 1;
            System.out.printf("записали в i [%d] и j[%d] - %d ", i - 1, j, lab[i][j] + 1);
            add_next(i - 1, j);
        }
        if (j + 1 <= lab[0].length - 1 && lab[i][j + 1] == -1) {
            System.out.print("exit"); // если дошли до выхода слева
            x3 = lab[i][j] + 1;
            next(lab);
        }
        // вправо
        if (j + 1 <= lab[0].length - 1 && lab[i][j + 1] == 0) {
            lab[i][j + 1] = lab[i][j] + 1;
            System.out.printf("записали в i [%d] и j[%d] - %d ", i, j + 1, lab[i][j] + 1);
            add_next(i, j + 1);
        }
        if (i + 1 <= lab.length - 1 && lab[i + 1][j] == -1) {
            System.out.print("exit"); // если дошли до выхода сверху
            x2 = lab[i][j] + 1;
            next(lab);
        }
        // вниз
        if (i + 1 <= lab.length - 1 && lab[i + 1][j] == 0) {
            lab[i + 1][j] = lab[i][j] + 1; // 4,0
            System.out.printf("записали в i [%d] и j[%d] - %d ", i + 1, j, lab[i][j] + 1);
            add_next(i + 1, j);
        }
        if (j - 1 >= 0 && lab[i][j - 1] == -1) {
            System.out.print("exit"); // если дошли до выхода сверху
            x2 = lab[i][j] + 1;
            next(lab);
        }
        // влево
        if (j - 1 >= 0 && lab[i][j - 1] == 0) {
            lab[i][j - 1] = lab[i][j] + 1;
            System.out.printf("записали в i [%d] и j[%d] - %d ", i, j - 1, lab[i][j] + 1);
            add_next(i, j - 1);
        }
        next(lab);
    }

    /** метод определения следующего шага и удаление из временного листа */
    private static void next(int[][] lab) {
        if (next_step.size() == 0) {
            return;
        } else {
            int i = next_step.get(0);
            int j = next_step.get(1);

            next_step.remove(0);
            next_step.remove(0);
            System.out.print(next_step);
            step(lab, i, j);
        }
    }

    /** метод добавления координат для следующего шага */
    private static List<Integer> add_next(int i, int j) {
        next_step.add(i);
        next_step.add(j);
        System.out.println();
        System.out.println(next_step);

        return next_step;
    }

    /** метод вывода изначального лабиринта */
    private static void print(int[][] lab) {
        for (int i = 0; i < lab.length; i++) {
            for (int j = 0; j < lab[i].length; j++) {
                if (lab[i][j] == 0) {
                    System.out.print(".");
                } else if (lab[i][j] == -2) {
                    System.out.print("▒");
                } else if (lab[i][j] == -3) {
                    System.out.print("@");
                } else if (lab[i][j] == -1) {
                    System.out.print("╬");
                }
            }
            System.out.println();
        }
    }

    /** метод вывода в консоль массива-лабиринта после прохождения */

    /**
     * метод вывода заполненного лабиринта числами-шагами
     * x1 количество шагов на первом пути
     * x2 количество шагов на втором пути
     */
    private static void print2(int[][] lab) {
        System.out.printf("\nx1 = %d, x2 = %d", x1, x2);
        System.out.println();
        for (int i = 0; i < lab.length; i++) {
            for (int j = 0; j < lab[i].length; j++) {
                System.out.printf("%d\t", lab[i][j]);
            }
            System.out.println();
        }
    }

    private static void start_out(int[][] lab, int x1, int x2) {
        if (x1 < x2) {
            System.out.println("идём по пути x1");
            i = x1_coord_i;
            j = x1_coord_j;
            lab[i][j] = 0;
            count = x1;
            short_cut(lab, i, j);
        }
        else{
            System.out.println("идём по пути x2");
            i = x1_coord_i;
            j = x1_coord_j;
            lab[i][j] = 0;
            count = x2;
            short_cut(lab, i, j);
        }
    }
    private static void short_cut(int[][] lab, int i, int j) {
        if (i == 4 && j == 0) {
            lab[i - 1][j] = 0;
            count--;
            System.out.printf("записали в i [%d] и j[%d] - %d, count = %d", i - 1, j, 0, count);
            add_next(i - 1, j);
        }
        // вверх
        if (i - 1 >= 0 && lab[i - 1][j] == count - 1) {
            lab[i - 1][j] = 0;
            count--;
            System.out.printf("записали в i [%d] и j[%d] - %d, count = %d", i - 1, j, 0, count);
            add_next(i - 1, j);
        }
        // вправо
        if (j + 1 <= lab[0].length - 1 && lab[i][j + 1] == count - 1) {
            lab[i][j + 1] = 0;
            System.out.printf("записали в i [%d] и j[%d] - %d, count = %d", i, j + 1, 0, count);
            add_next(i, j + 1);
        }
        // вниз
        if (i + 1 <= lab.length - 1 && lab[i + 1][j] == count - 1) {
            lab[i + 1][j] = 0;
            count--;
            System.out.printf("записали в i [%d] и j[%d] - %d, count = %d", i + 1, j, 0, count);
            add_next(i + 1, j);
        }
        // влево
        if (j - 1 >= 0 && lab[i][j - 1] == count - 1) {
            lab[i][j - 1] = 0;
            count--;
            System.out.printf("записали в i [%d] и j[%d] - %d, count = %d", i, j - 1, 0, count);
            add_next(i, j - 1);
        }
        next2(lab);
    }

    /** метод определения следующего шала и удаление из временного листа */
    private static void next2(int[][] lab) {
        if (next_step.size() == 0) {
            return;
        } else {
            int i = next_step.get(0);
            int j = next_step.get(1);

            next_step.remove(0);
            next_step.remove(0);
            System.out.print(next_step);
            short_cut(lab, i, j);
        }
    }

        /** метод вывода изначального лабиринта */
        private static void print_finish(int[][] lab) {
            System.out.println();
            for (int i = 0; i < lab.length; i++) {
                for (int j = 0; j < lab[i].length; j++) {
                    if (lab[i][j] == 0) {
                        System.out.printf("*");
                    } else if (lab[i][j] == -2) {
                        System.out.printf("▒");
                    } 
                    else {
                        System.out.printf(".");
                    }
                }
                System.out.println();
            }
        }
}
