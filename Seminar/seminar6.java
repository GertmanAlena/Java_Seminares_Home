
public class seminar6 {
    public static void main(String[] args) {
        //создаём экземпляр конкретного worker
        Worker w1 = new Worker();
        w1.firstName = "Lena";
        w1.lastName = "Hertman";
        w1.salary = 100;
        w1.id = 1;

        Worker w4 = new Worker();
        w4.firstName = "Lena";
        w4.lastName = "Hertman";
        w4.salary = 100;
        w4.id = 1;

        Worker w2 = new Worker();
        w2.firstName = "Daniil";
        w2.lastName = "Hertman";
        w2.salary = 100;
        w2.id = 004;

        Worker w3 = new Worker();
        w3.firstName = "Liza";
        w3.lastName = "Hertman";
        w3.salary = 200;
        w3.id = 003;

        System.out.println(w1.toString());

        System.out.println(w1 == w4);
        System.out.println(w1.equals(w4));
        // var workers = new HashSet<Worker>(Array.asList(w1, w2, w3));
        // System.out.println(workers.contains(w4));
    }
    
}
