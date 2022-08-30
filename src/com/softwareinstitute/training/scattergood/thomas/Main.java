package com.softwareinstitute.training.scattergood.thomas;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    //if loops and switch
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
        //do while loops
        count=0;
        do{
            if (count>10){
                playAgain = true;
            }
            System.out.println(++count);
        }while(!playAgain);

        //for loops and enhanced for loops
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

        //arrays
        String[] paints = new String[6];
        System.out.println(paints.length);
        paints [4] = "Dulux";
        paints [1] = "HomeBase";
        paints[2] = "B&Q";
        paints[5] = "Paint";


        for(String s : paints){
            System.out.println(s);
        }


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        //multi dimensional arrays (2d grid example)
        int count1 = 0;
        int[][] grid_counter = new int[15][12];

        for(int i = 0; i < grid_counter.length; i++){
            for(int j =0; j<grid_counter[i].length; j++){
                grid_counter[i][j] = ++count1;
                System.out.print(grid_counter[i][j] + " ");
            }
            System.out.println(" ");
        }


        ArrayList<String> techClass = new  ArrayList<String>(10);
        techClass.add("Tom");
        techClass.add("Will");
        techClass.add("Gabriel");
        techClass.add("Louis");
        techClass.add("Arnold");
        techClass.add(1, "Ryan");

        System.out.println(techClass.size());
        System.out.println(techClass.get(3));

        System.out.println(" ");

            for(String name1: techClass){
                System.out.println(name1);

            }

        System.out.println(tellTheClassAPerson(0));

    }

    public static String tellTheClassAPerson(int whichPerson){
        String name = "";
        switch (whichPerson){
            case 1:
                name = "Thomas";
                break;
            case 2:
                name = "William";
                break;
            default:
                name = "Mary";
                break;
        }
                return name;

    }

}
