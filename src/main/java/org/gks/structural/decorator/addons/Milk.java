package org.gks.structural.decorator.addons;

import org.gks.structural.decorator.Beverage;

public class Milk implements Beverage {
    Beverage b;

    public Milk(Beverage b) {
        this.b = b;
    }

    @Override
    public double getCost() {
        return 5 + b.getCost();
    }

    @Override
    public String getDescription() {
        return b.getDescription() + ", Milk";
    }
}
