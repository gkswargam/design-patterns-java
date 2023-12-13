package org.gks.structural.decorator;

import org.gks.structural.decorator.addons.Mocha;
import org.gks.structural.decorator.addons.Whip;

public class BeverageClient {
    public static void main(String[] args) {
        Beverage b = new DarkRoast();
        b = new Mocha(b);
        b = new Whip(b);
        System.out.println(b.getCost());
        System.out.println(b.getDescription());
    }
}
