package ProductHome;


public class CreateProduct {
    Product temp;

    public CreateProduct() {
        temp = new Product();
        temp.count = CONST2.NIL_VALUE;
        temp.price = CONST2.NIL_VALUE;
        temp.name = CONST2.EMPTY;
        temp.description = CONST2.EMPTY;
    }
    
    public CreateProduct setCount(int count) {
        if (count > 1000) {
            setDescription("отдельный склад");
            temp.count = count;
            return this;
        }
        temp.count = count;
        return this;
    }
    public CreateProduct setPrice(int price) {
        
        temp.price = price;
        return this;
    }

    public CreateProduct setName(String name) {
        if (name.length() > 2) {
            
            temp.name = name;
            return this;
        }
        else {
            temp.name = "поняла где прописать условие";
            return this;
        }
    }

    public CreateProduct setDescription(String description) {
        temp.description = description;
        return this;
        
    }

    public Product Create() {
        return temp;
    }
}
