package com.practise;

import com.practise.interfaces.Color;
import com.practise.interfaces.Shape;

/**
 * Created by Ashwani on 5/21/2016.
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(String shapeName);
    public abstract Color getColor(String colorName);
}
