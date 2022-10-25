import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rep {
    public static void main(String[] args) {
        
        int[][] lab = {
            // 0 1  2  3  4  5  6  7  8
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 0 start[3][0] finish [6][8] 
            { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 }, // 1
            { 0, 1, 0, 1, 1, 1, 1, 0, 0, 0 }, // 2
            { 2, 1, 0, 1, 0, 0, 1, 1, 0, 0 }, // 3
            { 0, 1, 0, 1, 0, 0, 0, 1, 0, 0 }, // 4
            { 0, 1, 1, 1, 1, 1, 0, 1, 0, 0 }, // 5
            { 0, 0, 1, 0, 0, 0, 0, 1, -1, 0 }, // 6
            { 0, 0, 1, 0, 1, 1, 1, 1, 0, 0 }, // 7
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 8
    };
    System.out.println(lab.length);   // = 9  строки
    System.out.println(lab[0].length);   //  = 10 столбцы
    }
}
