import Shops.Product;
import Shops.ProductShop;
import Shops.Shop;
import Shops.TechnicShop;

import java.util.ArrayList;

public class Husband {
    private ArrayList<Product> listOfProducts;

   private ArrayList<Shop> shops = new ArrayList<>();

    private ArrayList<Shop> getListOfShops() {

        Shop Technics = new TechnicShop();
        shops.add(Technics);
        Shop Products = new ProductShop();
        shops.add(Products);
        return shops;
    }

    public void getListFromWife(ArrayList<Product> listOfProducts) {

        this.listOfProducts = listOfProducts;

    }

    public ArrayList<Product> createListOfAllProductsFromShops() {
        ArrayList<Product> allProductsFromShops = new ArrayList<>();

        for (Shop shop : shops) {
            allProductsFromShops.addAll(shop.getAllProductsFromShops());
        }
        return allProductsFromShops;
    }


}