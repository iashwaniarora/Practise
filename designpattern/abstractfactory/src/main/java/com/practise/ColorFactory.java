package com.practise;

import com.practise.impl.BlueColor;
import com.practise.impl.RedColor;
import com.practise.interfaces.Color;
import com.practise.interfaces.Shape;

/**
 * Created by Ashwani on 5/21/2016.
 */
public  class ColorFactory extends AbstractFactory {

    public Shape getShape(String shapeName) {
        return null;
    }

    public Color getColor(String colorName)
    {
        if(colorName==null)
            return null;
        else if( colorName.equals("red"))
        {
            return new RedColor();
        }
        else  if(colorName.equals("blue"))
        {
            return new BlueColor();
        }
        else return null;
    }

}
