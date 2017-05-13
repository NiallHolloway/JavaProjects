package com.holloway.polymorphism;

public class Demonstrate {

    private boolean answer = true;

    public static void main(String[] args) {
        //create a version of itself
        Demonstrate myApp = new Demonstrate();
        myApp.run();
    }

    private void run(){
        int shapeType;
        MyShape theShape;

        //create a UI instance
        UI myUI = new UI();

        while(answer){
            shapeType = myUI.promptUser();

            switch(shapeType){
                case 1:
                    theShape = new MyCircle(myUI);
                    calculate(theShape);
                    break;
                case 2:
                    theShape = new MySquare(myUI);
                    calculate(theShape);
                    break;
                case 3:
                    theShape = new MyTriangle(myUI);
                    calculate(theShape);
                    break;
                default:
                    System.out.println("You have entered an Invalid Entry,");
                    break;
            }

            answer = myUI.playAgain();
        }
    }

    private void calculate(MyShape theShape) {
        if (theShape != null) {
            theShape.calcArea();
        }
        if (theShape != null) {
            theShape.calcPerimeter();
        }
    }
}
