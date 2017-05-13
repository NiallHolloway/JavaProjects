package com.holloway.polymorphism;

import java.util.Scanner;

class UI {
    //handles interaction with the user
    private Scanner myScanner;

    UI(){
        System.out.println("Welcome to the Shape Calculator");
        myScanner = new Scanner(System.in);
    }

    int promptUser(){
        int result;
        System.out.println("Do you wish to perform calculations on: ");
        System.out.println("----------------------------------------");
        System.out.println("1) Circle");
        System.out.println("2) Square");
        System.out.println("3) Triangle");
        System.out.println("");
        System.out.println("Please select 1, 2 or 3!");
        System.out.println("");

        result = myScanner.nextInt();
        return result;
    }

    boolean playAgain() {
        String answer;

        System.out.println(""); //blank line
        System.out.println("Would you like to perform another calculation (y/n)?");

        answer = myScanner.next();
        if (answer.equalsIgnoreCase("y")) {
            return true;
        } else if (answer.equalsIgnoreCase("n")) {
            return false;
        } else {
            System.out.println("Incorrect Value Entered, quitting by default! ");
            return false;
        }

    }

    int getDimension(String prompt){
        int theDimension;

        System.out.println("");
        System.out.println(prompt);

        theDimension = myScanner.nextInt();
        return theDimension;
    }

    void displayArea(double area){
        System.out.println("Area is " + area);
    }

    void displayPerimeter(double perimeter){
        System.out.println("Perimeter is " + perimeter);
    }
}
