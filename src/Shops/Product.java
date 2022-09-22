package Shops;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public Product(String name) {

        this.name = name;
    }

    public String toString() {
        return "name='" + getName() + '\'' +
                ", price=" + getPrice();
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

    public void setPrice(float price) {
        this.price = price;
    }
}
