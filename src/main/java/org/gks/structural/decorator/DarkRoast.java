package org.gks.structural.decorator;

public class DarkRoast implements Beverage {

    @Override
    public double getCost() {
        return 30;
    }

    @Override
    public String getDescription() {
        return "Dark Roast";
    }
}
