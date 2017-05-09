package com.holloway.polymorphism;

import java.util.Scanner;

public class UI {
    //handles interaction with the user
    private Scanner myScanner;

    public UI(){
        System.out.println("Welcome to the Shape Calculator");
        myScanner = new Scanner(System.in);
    }

    public int promptUser(){
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

    public boolean playAgain(){
        String answer;
        boolean response = false;

        System.out.println(""); //blank line
        System.out.println("Would you like to perform another calculation (y/n)?");

        answer = myScanner.next();
        if (answer.equals("y")){
            response = true;
        }
        return response;
    }

    public int getDimension(String prompt){
        int theDimension;

        System.out.println("");
        System.out.println(prompt);

        theDimension = myScanner.nextInt();
        return theDimension;
    }

    public void displayArea(double area){
        System.out.println("Area is " + area);
    }

    public void diplayPerimeter(double perimeter){
        System.out.println("Perimeter is " + perimeter);
    }
}
