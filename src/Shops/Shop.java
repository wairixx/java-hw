package Shops;

import java.util.ArrayList;

public abstract class Shop {
    private ArrayList<Product> listOfAllProducts = new ArrayList<>();

    public Product addProductsToShops(String name, Double price) {
        listOfAllProducts.add(new Product(name, price));
        return new Product(name, price);
    }

    public ArrayList<Product> getAllProductsFromShops() {
        return listOfAllProducts;
    }
}
