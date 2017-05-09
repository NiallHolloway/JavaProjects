package com.holloway.polymorphism;

public class Demonstrate {

    private UI myUI;
    private boolean answer = true;

    public static void main(String[] args) {
        //create a version of itself
        Demonstrate myApp = new Demonstrate();
        myApp.run();
    }

    public void run(){
        int shapeType;
        MyShape theShape = null;

        //create a UI instance
        myUI = new UI();

        while(answer){
            shapeType = myUI.promptUser();

            switch(shapeType){
                case 1: theShape = new MyCircle(myUI);
                        break;
                case 2: theShape = new MySquare(myUI);
                        break;
                case 3: theShape = new MyTriangle(myUI);
                        break;
            }


            theShape.calcArea();
            theShape.calcPerimeter();

            answer = myUI.playAgain();
        }
    }
}
