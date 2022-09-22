import Shops.Product;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Wife wife = new Wife();
        ArrayList<Product> neededProducts = wife.createListOfProducts();
        Husband husband = new Husband();
        husband.getListFromWife(neededProducts);

        ArrayList<Product> listOfAllProducts = husband.createListOfAllProductsFromShops();
        wife.takeListOfAllProductsFromHusband(listOfAllProducts);
        wife.printToConsoleTotalList();



    }
}