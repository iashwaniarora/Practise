package com.practise;

/**
 * Created by Ashwani on 5/21/2016.
 */
public class ShapeMain {

    public static void main(String[] args) {
        //get circle
        ShapeFactory shapeFactory  = new ShapeFactory();
        shapeFactory.getShape("circle").draw();
        shapeFactory.getShape("rectangle").draw();
    }
}
