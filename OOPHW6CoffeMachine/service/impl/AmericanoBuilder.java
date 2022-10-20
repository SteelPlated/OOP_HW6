package OOPHW6CoffeMachine.service.impl;

import OOPHW6CoffeMachine.data.impl.Americano;
import OOPHW6CoffeMachine.data.Coffee;
import OOPHW6CoffeMachine.data.impl.Espresso;

public class AmericanoBuilder extends EspressoBuilder {
    private String additionalWater;

    public Coffee buildAmericano(){
        return new Americano((Espresso) buildEspresso(), additionalWater);
    }

    public void setAdditionalWater(String additionalWater) {
        this.additionalWater = additionalWater;
    }
}
