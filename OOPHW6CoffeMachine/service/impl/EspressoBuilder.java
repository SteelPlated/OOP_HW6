package OOPHW6CoffeMachine.service.impl;

import OOPHW6CoffeMachine.data.Coffee;
import OOPHW6CoffeMachine.data.impl.Espresso;
import OOPHW6CoffeMachine.service.Sweettable;

public class EspressoBuilder implements Sweettable {
    private String coffee;
    private String water;

    public Coffee buildEspresso(){
        return new Espresso(coffee, water);
    }

    public void setCoffee(String coffee) {
        this.coffee = coffee;
    }

    public void setWater(String water) {
        this.water = water;
    }

    @Override
    public void addSweet(String amountOfSugar) {
        System.out.printf("Добавлено %s сахара.\n", amountOfSugar);
    }
}
