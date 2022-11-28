import java.util.Comparator;

public class ComparatorNumbers implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 % 10 == o2 % 10) return o1 - o2;
        else return o1 % 10 - o2 % 10;
    }

}
