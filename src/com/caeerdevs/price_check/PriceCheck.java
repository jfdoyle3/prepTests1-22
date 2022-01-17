package com.caeerdevs.price_check;

import java.util.Arrays;

public class PriceCheck {

    public static void priceCheck() {
        String[] products = {"rice", "sugar", "wheat", "cheese"};
        double[] prices = {16.89, 56.92, 20.89, 345.99};
        String[] productSold = {"rice", "cheese"};
        double[] soldPrice = {18.99, 400.89};

        int priceError = 0;

        for (int itemSold = 0; itemSold < productSold.length; itemSold++) {
            for (int stock = 0; stock < products.length; stock++) {
                if (productSold[itemSold].equals(products[stock])) {
                    if (soldPrice[itemSold] != prices[stock])
                        priceError++;
                }
            }
        }
        System.out.println("Price Errors: " + priceError);
    }
}
