package org.gks.structural.decorator.addons;

import org.gks.structural.decorator.Beverage;

public class Whip implements Beverage {
    Beverage b;

    public Whip(Beverage b) {
        this.b = b;
    }
    @Override
    public double getCost() {
        return 3 + b.getCost();
    }

    @Override
    public String getDescription() {
        return b.getDescription() + ", Whip";
    }
}
