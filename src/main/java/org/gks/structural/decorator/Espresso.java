package org.gks.structural.decorator;

public class Espresso implements Beverage {

    @Override
    public double getCost() {
        return 25;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
