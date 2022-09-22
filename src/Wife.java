import Shops.Product;

import java.util.ArrayList;

public class Wife {

    private ArrayList<Product> listOfAllProductsFromHusband;

    Product milk = new Product("Milk");
    Product butter = new Product("Butter");
    Product apples = new Product("Apples");
    Product sonyTV = new Product("SonyTV");



    public ArrayList<Product> createListOfProducts() {
        ArrayList<Product> neededProducts = new ArrayList<>();
        neededProducts.add(milk);
        neededProducts.add(butter);
        neededProducts.add(sonyTV);
        neededProducts.add(apples);
        System.out.println("List of products from wife:");
        for (Product product : neededProducts) {
            System.out.println(product.getName());
        }
        return neededProducts;


    }


    public void takeListOfAllProductsFromHusband(ArrayList<Product> listOfAllProductsFromHusband) {
        this.listOfAllProductsFromHusband = listOfAllProductsFromHusband;
    }

    public void printToConsoleTotalList() {
        System.out.println("List of all products:");
        for (Product product : listOfAllProductsFromHusband) {
            System.out.println(product.toString());
        }
    }

}
