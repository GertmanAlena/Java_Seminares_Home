package ProductHome;
class Products {

  public int count;
  public String name;
  public double price;
  public StringBuilder description;

  class ProxyName {
    String val;

    public ProxyName(String v) {
      // this.val = v != null ? v : "EMPTY";

      if (v != null)
        this.val = v;
      else
        this.val = "EMPTY";
    }

    public String getVal() {
      return val;
    }
  }

  public Products(String name) {
      this.name = new ProxyName(new ProxyName(name).getVal()).getVal();
  
  }
  // public int getCount() {
  //   return count;
  // }

  // public String getName() {
  //   return name;
  // }

  // public double getPrice() {
  //   return price;
  // }

  // public StringBuilder getDescription() {
  //   return description;
  // }

}

  public class app {
    public static void main(String[] args) {
      Product currentProduct = new Product();
      currentProduct = new CreateProduct()
                      .setCount(5)
                      .setName("box")
                      .setDescription("картонная коробка")
                      .setPrice(200)
                      .Create();
                currentProduct.print();
      
      currentProduct = new CreateProduct()
                .setName("pen")
                .setCount(150)
                .setDescription("Красные шариковые ручки")
                .Create();
                currentProduct.print();

      currentProduct = new CreateProduct()
                .setName("t")
                .Create();
                currentProduct.print();

    }
}
