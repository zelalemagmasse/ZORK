package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {



    public static void main(String[] args) {
        // write your code herera
        Scanner keyboard = new Scanner(System.in);

        System.out.println("You are standing in the foyer of an old house.");
        System.out.println("You see a dead scorpion.");
        System.out.println("You can (north)exit to the north or press Q to quit");
        String pick = keyboard.nextLine();
        String currentRoom = "foyer room";

        DisplayContnet dispcont = new DisplayContnet();
        int roomCounter=0;
        Move moveDirct = new Move(currentRoom, pick);

        while (!pick.equalsIgnoreCase("q")) {

             moveDirct.setCurrentRoom(currentRoom);
             moveDirct.setDirection(pick);
             String nextRoom = moveDirct.roomPicker();
             System.out.println(dispcont.displayConten(nextRoom));



            currentRoom=nextRoom;
            pick = keyboard.nextLine();
           pick= moveDirct.previousChecker(pick);
            roomCounter=moveDirct.roomCounterMethod();

        }
        System.out.println(dispcont.ghostFollow());
        System.out.println("you have been in " + roomCounter + " rooms");



    }


}


