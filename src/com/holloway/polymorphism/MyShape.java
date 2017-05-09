package com.holloway.polymorphism;

public abstract class MyShape {

    protected int dimension;
    protected UI myUI;

    public MyShape(){

    }

    public abstract void calcArea();
    public abstract void calcPerimeter();
}
