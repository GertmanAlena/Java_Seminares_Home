
public class QwekSort {
    public static void main(String[] args) {
        Integer[] mass = {1, 8, 4, 3, 9, -4, 56, -8, 7, 5};
            
        index_min_max(mass, 0, mass.length-1);
        print_mass(mass);
    }
    //*выводим в консоль */
    private static void print_mass(Integer[] mass) {
        System.out.print("отсортированный массив [");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + ", ");
        }
        System.out.println("]");
    }
    //**реккурсивный метод поиска pivot*/
    private static void index_min_max(Integer[] mass, int min_index, int max_index) {
        if (min_index > max_index) return;
        int pivot = pivot(mass, min_index, max_index);
        index_min_max(mass, 0, pivot - 1);
        index_min_max(mass, pivot + 1, max_index);
        return;
    }
    //**ставим pivot в нужное место*/
    private static int pivot(Integer[] mass, int min_index, int max_index) {
        int pivot_index = min_index - 1;
        for (int i = min_index; i < max_index; i++) {
            if (mass[i] < mass[max_index]) {
                pivot_index++;
                swap(mass, i, pivot_index);
            }
        }
        pivot_index++;
        swap(mass, pivot_index, max_index);
        return pivot_index;
    }
    //*метод перемещения элементов */
    private static void swap(Integer[] mass, int left_pos, int rigth_pos) {
        Integer temp = mass[left_pos];
        mass[left_pos] = mass[rigth_pos];
        mass[rigth_pos] = temp;
    }
    
}
