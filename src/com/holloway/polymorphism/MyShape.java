package com.holloway.polymorphism;

public abstract class MyShape {

    int dimension;
    UI myUI;

    MyShape(){
    }

    public abstract void calcArea();
    public abstract void calcPerimeter();
}
