package com.alex.com.model;

import com.alex.com.interfaces.IceCream;
import com.alex.com.interfaces.IceCreamDecorator;

public class MintIceCream extends IceCreamDecorator {
    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Mint Ice-Cream!");
        return  1.50 +super.cost();
    }
}
