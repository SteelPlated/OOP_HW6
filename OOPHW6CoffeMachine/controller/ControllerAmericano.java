package OOPHW6CoffeMachine.controller;

import OOPHW6CoffeMachine.data.Coffee;
import OOPHW6CoffeMachine.service.impl.AmericanoBuilder;

public class ControllerAmericano {
    private final AmericanoBuilder americanoBuilder;

    public ControllerAmericano() {
        this.americanoBuilder = new AmericanoBuilder();
    }

    public Coffee getAmericano(String coffee, String water, String additionalWater){
        System.out.println("Ваш Американо: ");
        americanoBuilder.setCoffee(coffee);
        americanoBuilder.setWater(water);
        americanoBuilder.setAdditionalWater(additionalWater);

        return americanoBuilder.buildAmericano();
    }

    public Coffee getAmericanoSweet(String coffee, String water, String additionalWater, String sweet){
        System.out.println("Ваш Американо: ");
        americanoBuilder.setCoffee(coffee);
        americanoBuilder.setWater(water);
        americanoBuilder.setAdditionalWater(additionalWater);
        americanoBuilder.addSweet(sweet);

        return americanoBuilder.buildAmericano();
    }
}
