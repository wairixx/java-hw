package Shops;

import java.util.ArrayList;

public class TechnicShop extends Shop {
    private ArrayList<Product> listOfTechnicProducts;

    public TechnicShop() {
        listOfTechnicProducts.add(addProductsToShops("XiaomiPhone", 100.0));
        listOfTechnicProducts.add(addProductsToShops("AcerNotebook", 180.0));
        listOfTechnicProducts.add(addProductsToShops("LenovoPhone", 150.0));
        listOfTechnicProducts.add(addProductsToShops("MacBook", 210.0));
        listOfTechnicProducts.add(addProductsToShops("SonyTV", 200.0));

    }
    public ArrayList<Product> getAllProductsFromShops() {
        return listOfTechnicProducts;
    }
}