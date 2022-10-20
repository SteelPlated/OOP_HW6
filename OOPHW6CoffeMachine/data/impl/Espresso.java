package OOPHW6CoffeMachine.data.impl;

import OOPHW6CoffeMachine.data.Coffee;

public class Espresso extends Coffee {
    public Espresso(String coffee, String water) {
        super(coffee, water);
    }

    @Override
    public String toString() {
        return "Coffee{" + "coffee='" + getCoffee() + '\'' + ", water='" + getWater() + '\'' + '}';
    }

}
