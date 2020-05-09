package com.alex.com.model;

import com.alex.com.interfaces.IceCream;
import com.alex.com.interfaces.IceCreamDecorator;

public class ChocolateIceCream extends IceCreamDecorator {


    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Mint Chocolate Ice-Cream!");
        return 1.0 + super.cost();

    }


}


