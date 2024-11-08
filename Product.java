import java.util.ArrayList;
import java.util.List;

class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private  String brand;

    public Product(int id, String name, double price, int quantity, String brand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
    }

    int getid() {
        return id;
    }

    String getname() {
        return name;
    }

    double getprice() {
        return price;
    }

    int getquantity() {
        return quantity;
    }

    String getbrand() {
        return brand;
    }

    void setid(int id) {
        this.id = id;
    }

    void setname(String name) {
        this.name = name;
    }

    void setprice(double price) {
        this.price = price;
    }

    void setquantity(int quantity) {
        this.quantity = quantity;
    }

    void setbrand(String brand) {
        this.brand = brand;
    }

    public void displayInfo() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
        System.out.println("Product Quantity: " + quantity);
        System.out.println("Product Brand: " + brand);
    }
}

class Racket extends Product {
    private String specifications;

    public Racket(int id, String name, double price, int quantity, String brand, String specifications) {
        super(id, name, price, quantity, brand);
        this.specifications = specifications;
    }

    @Override
    public void displayInfo() {
        System.out.println("Product Specification: " + specifications);
    }
}

class Shoes extends Product {
    private int sizeShoes;

    public Shoes(int id, String name, double price, int quantity, String brand, int sizeShoes) {
        super(id, name, price, quantity, brand);
        this.sizeShoes = sizeShoes;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Size of Shoes: " + sizeShoes);
    }
}

class Clothing extends Product {
    private int sizeClothing;
    private String gender;

    public Clothing(int id, String name, double price, int quantity, String brand, int sizeClothing, String gender) {
        super(id, name, price, quantity, brand);
        this.sizeClothing = sizeClothing;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Size of Clothing: " + sizeClothing);
    }
}

class ProductManager {
    private List<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product.getname());
    }

    public void removeProduct(int id) {
        for (Product product : products) {
            if (product.getid() == id) {
                products.remove(product);
                System.out.println("Product Remove: " + product.getname());
                return;
            }
        }
        System.out.println("Product with ID: " + id + "Not Found.");
    }

    public void updateProduct(int id, String name, double price, int quantity, String brand) {
        for (Product product : products) {
            if (product.getid() == id) {
                product.setname(name);
                product.setprice(price);
                product.setquantity(quantity);
                product.setbrand(brand);
                System.out.println("Product Updated." + product.getname());
                return;
            }
        }
        System.out.println("Product with ID: " + id + "Not Found.");
    }

    public void searchProduct(int id) {
        for (Product product : products) {
            if (product.getid() == id) {
                System.out.println("Product Found: " + product.getname());
                return;
            }
        }
        System.out.println("Product with ID: " + id + "Not Found");
    }

    public void displayAllProducts() {
        for (Product product : products) {
            product.displayInfo();
            System.out.println("---------------");
        }
    }
}