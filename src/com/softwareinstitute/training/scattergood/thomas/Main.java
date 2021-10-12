package com.softwareinstitute.training.scattergood.thomas;

public class Main {

    public static void main(String[] args) {

	int choice = 1;
    String message;
    if (choice == 1){
        message = "Happy Birthday";
    }
    else{
        message = "It's not your birthday";
    }
    System.out.println(message);

    message = (choice == 1) ? "Happy Christmas" : "You have been bad, no presents";
    String string = new String((choice == 1) ? "Happy Christmas" : "You have been bad, no presents");
    System.out.println(message);
    System.out.println(string);
    }
}
