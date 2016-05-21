package com.practise;

/**
 * Created by Ashwani on 5/21/2016.
 */
public class AbstractPatternFactoryDemo {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();
        factoryProducer.getFactory("color").getColor("red").fill();

        factoryProducer.getFactory("shape").getShape("rectangle").draw();
    }
}
