import java.util.ArrayList;
import java.util.List;

public class home_labirint {
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
        
        print2(lab);

        start_out(lab, x1, x2);
        System.out.printf("\nпо короткому пути до выхода \033[32m%d\033[0m шагов", x1);
        print_finish(lab);
    }
    /**ищем точку старта -3 иначинаем */
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
            x1 = lab[i][j] + 1;
            x1_coord_i = i - 1;
            x1_coord_j = j;
            next(lab);
        }
        // вверх
        if (i - 1 >= 0 && lab[i - 1][j] == 0) {
            lab[i - 1][j] = lab[i][j] + 1;
            add_next(i - 1, j);
        }
        if (j + 1 <= lab[0].length - 1 && lab[i][j + 1] == -1) {
            x3 = lab[i][j] + 1;
            next(lab);
        }
        // вправо
        if (j + 1 <= lab[0].length - 1 && lab[i][j + 1] == 0) {
            lab[i][j + 1] = lab[i][j] + 1;
            add_next(i, j + 1);
        }
        if (i + 1 <= lab.length - 1 && lab[i + 1][j] == -1) {
            x2 = lab[i][j] + 1;
            next(lab);
        }
        // вниз
        if (i + 1 <= lab.length - 1 && lab[i + 1][j] == 0) {
            lab[i + 1][j] = lab[i][j] + 1; // 4,0
            add_next(i + 1, j);
        }
        if (j - 1 >= 0 && lab[i][j - 1] == -1) {
            x2 = lab[i][j] + 1;
            next(lab);
        }
        // влево
        if (j - 1 >= 0 && lab[i][j - 1] == 0) {
            lab[i][j - 1] = lab[i][j] + 1;
            add_next(i, j - 1);
        }
        next(lab);
    }

    /** метод определения следующего шага и удаление из временного листа 
     * до того, пока не станет пустым
    */
    private static void next(int[][] lab) {
        if (next_step.size() == 0) {
            return;
        } else {
            int i = next_step.get(0);
            int j = next_step.get(1);
            next_step.remove(0);
            next_step.remove(0);
            step(lab, i, j);
        }
    }

    /** метод добавления координат для следующего шага */
    private static List<Integer> add_next(int i, int j) {
        next_step.add(i);
        next_step.add(j);
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

    /**
     * метод вывода заполненного лабиринта числами-шагами
     * x1 количество шагов на первом пути
     * x2 количество шагов на втором пути
     */
    private static void print2(int[][] lab) {
        System.out.printf("\n\033[3;36;44mпуть x1 = %d шагов, путь x2 = %d шагов\033[0m", x1, x2);
        System.out.print("\n********************************************************************");
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
            System.out.println("\n\033[1mидём по пути x1\033[0m");
            i = x1_coord_i;
            j = x1_coord_j;
            lab[i][j] = 0;
            count = x1;
            short_cut(lab, i, j);
        } else {
            System.out.println("идём по пути x2");
            i = x1_coord_i;
            j = x1_coord_j;
            lab[i][j] = 0;
            count = x2;
            short_cut(lab, i, j);
        }
    }
    
    /**
     * метод прохождения обратного пути
     */
    private static void short_cut(int[][] lab, int i, int j) {
        if (i == 4 && j == 0) {
            lab[i - 1][j] = 0;
            count--;
            add_next(i - 1, j);
        }
        // вверх
        if (i - 1 >= 0 && lab[i - 1][j] == count - 1) {
            lab[i - 1][j] = 0;
            count--;
            add_next(i - 1, j);
        }
        // вправо
        if (j + 1 <= lab[0].length - 1 && lab[i][j + 1] == count - 1) {
            lab[i][j + 1] = 0;
            add_next(i, j + 1);
        }
        // вниз
        if (i + 1 <= lab.length - 1 && lab[i + 1][j] == count - 1) {
            lab[i + 1][j] = 0;
            count--;
             add_next(i + 1, j);
        }
        // влево
        if (j - 1 >= 0 && lab[i][j - 1] == count - 1) {
            lab[i][j - 1] = 0;
            count--;
            add_next(i, j - 1);
        }
        next2(lab);
    }

    /** метод определения следующего шага и удаление из временного листа для обратного пути*/
    private static void next2(int[][] lab) {
        if (next_step.size() == 0) {
            return;
        } else {
            int i = next_step.get(0);
            int j = next_step.get(1);

            next_step.remove(0);
            next_step.remove(0);
            short_cut(lab, i, j);
        }
    }

    /** метод вывода обратного пути */
    private static void print_finish(int[][] lab) {
        System.out.println();
        for (int i = 0; i < lab.length; i++) {
            for (int j = 0; j < lab[i].length; j++) {
                if (lab[i][j] == 0) {
                    System.out.printf("\033[43m@\033[0m");
                } else if (lab[i][j] == -2) {
                    System.out.printf("▒");
                } else {
                    System.out.printf("\033[46m.\033[0m");
                }
            }
            System.out.println();
        }
    }
}
