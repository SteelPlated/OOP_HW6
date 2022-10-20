package OOPHW6CoffeMachine.controller;

import OOPHW6CoffeMachine.data.Coffee;
import OOPHW6CoffeMachine.service.impl.MochaBuilder;

public class ControllerMocha {
    private final MochaBuilder mochaBuilder;

    public ControllerMocha() {
        this.mochaBuilder = new MochaBuilder();
    }

    public Coffee getMocha(String chocolate, String coffee, String water, String milk, String whippedCream){
        System.out.println("Ваш Мокко: ");
        mochaBuilder.setChocolate(chocolate);
        mochaBuilder.setCoffee(coffee);
        mochaBuilder.setWater(water);
        mochaBuilder.setMilk(milk);
        mochaBuilder.setWhippedCream(whippedCream);

        return mochaBuilder.buildMocha();
    }
}
