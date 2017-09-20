package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50; // "int myVariable = 50" o conjunto dos 3 elementos forma um STATEMENT.
        if (myVariable == 40) {
            System.out.println("Printed");
        } else {
            System.out.println("Your Variable are not equals to 40");
        }
        myVariable++; //Auto Increment de valor
        myVariable--; //Auto Decrement de valor

        System.out.println("This is a Test");
        System.out.println("This is " +
                "Another" +
                "Still more");

        int anotherVariable = 50;
        System.out.println("This is Another One");//Wrong Indenting
    }
}
