package com.softwareinstitute.training.scattergood.thomas;

public class Main {

    public static void main(String[] args) {

    int choice = (int) (Math.random()+2);
    String message;

    System.out.println(choice);
    if (choice == 1){
        message = "Happy Birthday";
    }
    else{
        message = "It's not your birthday";
    }
    System.out.println(message);

    message = (choice == 1) ? "Happy Christmas" : "You have been bad, no presents";
    String string = ((choice == 1) ? "Happy Christmas" : "You have been bad, no presents");
    System.out.println(message);
    System.out.println(string);

    int num = 2;
        switch (choice) {
            case 0 -> System.out.println("Case is 0");
            case 1 -> System.out.println("Case is 1");
            case 2 -> System.out.println("Case is 2");
            default -> System.out.println("Case is 3");
        }
    }
}
