package com.holloway.polymorphism;

public class MySquare extends MyShape {

    public MySquare(UI theUI){
        //need radius
        myUI = theUI;

        dimension = theUI.getDimension("Please enteer the square side length: \n");
    }

    public void calcArea(){
        double area;

        area = dimension * dimension;
        myUI.displayArea(area);
    }

    public void calcPerimeter(){
        double perimeter;

        perimeter = 4 * dimension;
        myUI.diplayPerimeter(perimeter);
    }
}
