package com.holloway.polymorphism;

public class MyTriangle extends MyShape {

    MyTriangle(UI theUI){
        //need radius
        myUI = theUI;

        dimension = theUI.getDimension("Please enter the triangle side length: \n");
    }

    public void calcArea(){
        double area;

        area = Math.rint(0.5 * dimension * dimension);
        myUI.displayArea(area);
    }

    public void calcPerimeter(){
        double perimeter;

        perimeter = Math.rint(Math.sqrt(2 * dimension * dimension) + 2 * dimension);
        myUI.displayPerimeter(perimeter);
    }
}
