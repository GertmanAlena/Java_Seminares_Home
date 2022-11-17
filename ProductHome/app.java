package ProductHome;
class Products {

  public int count;
  public String name;
  public double price;
  public StringBuilder description;

  class ProxyName {
    String val;

    public ProxyName(String v) {
      this.val = v != null ? v : "EMPTY";

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

  public Products(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public Products(int count, String name) {
    this.count = count;
    this.name = name;
  }

  public Products(int count, String name, double price) {
    this.count = count;
    this.name = name;
    this.price = price;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public StringBuilder getDescription() {
    return description;
  }

  public void setDescription(StringBuilder description) {
    this.description = description;
  }
}

  public class app {
    public static void main(String[] args) {
      Product currentProduct = new Product();
      currentProduct = new CreateProduct()
                      .setCount(5)
                      .setName("box")
                      .Create();
      currentProduct.print();
      
      
    }
}
