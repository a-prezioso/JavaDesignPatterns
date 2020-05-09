package com.alex.com;

import com.alex.com.controller.CreditCardAlgorithm;
import com.alex.com.controller.PaypalAlgorithm;
import com.alex.com.controller.ShoppingCart;
import com.alex.com.model.Product;

public class Main {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Product pants = new Product("234", 25);
        Product shirt = new Product("987", 15);


        cart.addProduct(pants);
        cart.addProduct(shirt);


        //payment decisions
        cart.pay(new PaypalAlgorithm("paulo@buildappswithpaulo.com", "nowayman"));


        cart.pay(new CreditCardAlgorithm("Paulo", "238756464"));


    }
}
