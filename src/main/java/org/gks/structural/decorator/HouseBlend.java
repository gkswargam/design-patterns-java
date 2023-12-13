package org.gks.structural.decorator;

public class HouseBlend implements Beverage {

    @Override
    public double getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "House Blend";
    }
}
