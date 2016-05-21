package com.practise;

import com.practise.AbstractFactory;
import com.practise.ColorFactory;
import com.practise.ShapeFactory;

/**
 * Created by Ashwani on 5/21/2016.
 */
public class FactoryProducer {

    public AbstractFactory getFactory(String choice){

        if(choice.equals("color"))
        {
            return new ColorFactory();
        }
        else if(choice.equals("shape"))
        {
             return new ShapeFactory();
        }

    return null;
    }

}
