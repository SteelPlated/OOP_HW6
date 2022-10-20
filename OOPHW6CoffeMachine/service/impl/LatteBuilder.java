package OOPHW6CoffeMachine.service.impl;

import OOPHW6CoffeMachine.data.Coffee;
import OOPHW6CoffeMachine.data.impl.Espresso;
import OOPHW6CoffeMachine.data.impl.Latte;

public class LatteBuilder extends EspressoBuilder {

    private int milk;

    public Coffee buildLatte() {
        return new Latte((Espresso) buildEspresso(), milk);
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void warmedMilk(int milk){
        milk /= 2;
        System.out.printf("Теплое молоко %d ml\n", milk);
    }

    public void whippedMilk(int milk){
        milk /= 2;
        System.out.printf("Взбитое молоко %d ml\n", milk);
    }

}
