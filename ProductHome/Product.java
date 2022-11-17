package ProductHome;

public class Product {
    public int count;
    public String name;
    public double price;
    public StringBuilder description;

    public void print() {
        System.out.println(
            String.format(
                "%d %s %f %s",
                this.count,
                this.name,
                this.price,
                this.description));
      }
}
