package OOPHW6CoffeMachine.service.impl;

import OOPHW6CoffeMachine.data.Coffee;
import OOPHW6CoffeMachine.data.impl.Espresso;
import OOPHW6CoffeMachine.data.impl.Mocha;

public class MochaBuilder extends EspressoBuilder {
    private String chocolate;
    private String whippedCream;
    private String milk;

    public Coffee buildMocha(){
        return new Mocha(chocolate, (Espresso) buildEspresso(), milk, whippedCream);
    }

    public void setChocolate(String chocolate) {
        this.chocolate = chocolate;
    }

    public void setWhippedCream(String whippedCream) {
        this.whippedCream = whippedCream;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }
}
