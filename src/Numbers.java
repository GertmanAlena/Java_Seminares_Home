import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Numbers {
    private ArrayList<Integer> number;
    private  Integer[] num;
    public void newArray(){

        this.number = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        this.num = new Integer[n];
        for (int i = 0; i < n; i++){
            System.out.print("Enter the size of array ->");
            number.add(sc.nextInt());
        }

        for (int i = 0; i < number.size(); i++){
            System.out.print(number.get(i) + " ");
        }
        System.out.println("\n---------------");
        num = number.toArray(new Integer[number.size()]);
        Arrays.sort(num, new ComparatorNumbers());
    }
    public void print(){
        for (int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
    }
}
