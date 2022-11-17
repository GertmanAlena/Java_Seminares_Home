package ProductHome;


public class CreateProduct {
    Product temp;

    public CreateProduct() {
        temp = new Product();
        temp.count = -1;
        temp.price = -1;
        temp.name = "--";
        temp.description = null;
    }

    public CreateProduct setCount(int count) {
        temp.count = count;
        return this;
    }

    public CreateProduct setPrice(int price) {
        temp.price = price;
        return this;
    }

    public CreateProduct setName(String name) {
        temp.name = name;
        return this;
    }

    public CreateProduct setDescription(StringBuilder description) {
        temp.description = description;
        return this;
    }

    // #endregion

    public Product Create() {
        return temp;
    }
}
