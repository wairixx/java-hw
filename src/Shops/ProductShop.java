package Shops;


import java.util.ArrayList;

public class ProductShop extends Shop {
    private ArrayList<Product> listOfProductsFromProductShop;

    public ProductShop() {
        listOfProductsFromProductShop.add(addProductsToShops("Milk", 60.0));
        listOfProductsFromProductShop.add(addProductsToShops("Apples", 45.0));
        listOfProductsFromProductShop.add(addProductsToShops("Pears", 35.0));
        listOfProductsFromProductShop.add(addProductsToShops("Butter", 80.0));
        listOfProductsFromProductShop.add(addProductsToShops("Fish", 90.0));

    }
    public ArrayList<Product> getAllProductsFromShops() {
        return listOfProductsFromProductShop;
    }

}
