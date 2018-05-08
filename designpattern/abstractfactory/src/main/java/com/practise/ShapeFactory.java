package com.practise;

import com.practise.impl.CircleShape;
import com.practise.impl.RectangleShape;
import com.practise.interfaces.Color;
import com.practise.interfaces.Shape;

/**
 * Created by Ashwani on 5/21/2016.
 */
public  class ShapeFactory extends AbstractFactory {

    public Shape getShape(String shapeName)
    {
       if(shapeName.equals("circle"))
       {
           return new CircleShape();
       }
        else if (shapeName.equals("rectangle"))
       {
           return new RectangleShape();
       }
        else return null;
    }

    public Color getColor(String colorName) {
        return null;
    }

}
