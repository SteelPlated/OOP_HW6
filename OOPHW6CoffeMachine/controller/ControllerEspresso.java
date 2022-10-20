package OOPHW6CoffeMachine.controller;

import OOPHW6CoffeMachine.data.Coffee;
import OOPHW6CoffeMachine.service.impl.EspressoBuilder;

public class ControllerEspresso {
    private final EspressoBuilder espressoBuilder;

    public ControllerEspresso() {
        this.espressoBuilder = new EspressoBuilder();
    }

    public Coffee getEspresso(String coffee, String water){
        System.out.println("Ваш Эспрессо: ");
        espressoBuilder.setCoffee(coffee);
        espressoBuilder.setWater(water);

        return espressoBuilder.buildEspresso();
    }
}
