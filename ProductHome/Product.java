package ProductHome;

public class Product {
    public int count;
    public String name;
    public double price;
    public String description;

    public void print() {
        System.out.println(
            String.format(
                "%d шт. %s %.2fр %s",
                this.count,
                this.name,
                this.price,
                this.description));
    }
}
