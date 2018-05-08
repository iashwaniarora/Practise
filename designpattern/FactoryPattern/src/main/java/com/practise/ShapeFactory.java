package com.practise;

import com.practise.impl.Circle;
import com.practise.impl.Rectangle;
import com.practise.interfaces.Shape;

/**
 * Created by Ashwani on 5/21/2016.
 */
public class ShapeFactory {

    public Shape getShape(String shapeName)
    {
        if(shapeName.equals("circle"))
            return new Circle();
        else if(shapeName.equals("rectangle"))
        {
            return new Rectangle();
        }
        else
            return null;
    }

}
