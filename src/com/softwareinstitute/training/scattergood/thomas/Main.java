package com.softwareinstitute.training.scattergood.thomas;

public class Main {

    public static void main(String[] args) {

    int choice = (int) (Math.random()*10);
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

        switch (choice) {
            case 0 -> System.out.println("Case is 0");
            case 1 -> System.out.println("Case is 1");
            case 2 -> System.out.println("Case is 2");
            case 3 -> System.out.println("Case is 3");
            default -> System.out.println("Case is 4+");
        }

        boolean playAgain = true;
        int count = 0;
        while (playAgain){

            if (count>10){
                playAgain =false;
            }
            System.out.println(count++);
        }
        count=0;
        do{
            if (count>10){
                playAgain =true;
            }
            System.out.println(++count);
        }while(!playAgain);


        for (int i = 1; i<10; i++) {
            System.out.println("I have " +i+ " friends");
        }

        int[] enhancedFor = {1,5,6,8,96};
        for (int i = 0 ; i < enhancedFor.length ; i++) {
            System.out.println(enhancedFor[i]);
        }

        for(int k:enhancedFor) {
            System.out.println(k);
        }

    }

}
