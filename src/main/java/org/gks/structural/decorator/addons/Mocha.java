package org.gks.structural.decorator.addons;

import org.gks.structural.decorator.Beverage;

public class Mocha implements Beverage {
    Beverage b;

    public Mocha(Beverage b) {
        this.b = b;
    }

    @Override
    public double getCost() {
        return 2 + b.getCost();
    }

    @Override
    public String getDescription() {
        return b.getDescription() + ", Mocha";
    }
}
