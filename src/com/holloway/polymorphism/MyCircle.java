package com.holloway.polymorphism;

public class MyCircle extends MyShape {


    public MyCircle(UI theUI){
        //need radius
        myUI = theUI;
        dimension = theUI.getDimension("Please enter the Circle Radius: \n");

    }

    public void calcArea(){
        double area;

        area = Math.rint(Math.PI * dimension * dimension);
        myUI.displayArea(area);
    }

    public void calcPerimeter(){
        double perimeter;

        perimeter = Math.rint(Math.PI * 2 * dimension);
        myUI.diplayPerimeter(perimeter);
    }
}
