package com.holloway.polymorphism;

public class MySquare extends MyShape {

    MySquare(UI theUI){
        //need radius
        myUI = theUI;

        dimension = theUI.getDimension("Please enter the square side length: \n");
    }

    public void calcArea(){
        double area;

        area = dimension * dimension;
        myUI.displayArea(area);
    }

    public void calcPerimeter(){
        double perimeter;

        perimeter = 4 * dimension;
        myUI.displayPerimeter(perimeter);
    }
}
