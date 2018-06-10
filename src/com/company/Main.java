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
        String directn = new String();
        String prevRoom = new String();

        DisplayContnet dispcont = new DisplayContnet();
        int roomCounter=0;
        Move moveDirct = new Move(currentRoom, pick);

        while (!pick.equalsIgnoreCase("q")) {

             moveDirct.setCurrentRoom(currentRoom);
             moveDirct.setDirection(pick);
             prevRoom=currentRoom;
             String nextRoom = moveDirct.roomPicker();
             System.out.println(dispcont.displayConten(nextRoom));
             directn=pick;

            pick = keyboard.nextLine();
            if (!pick.equalsIgnoreCase("p")) {
                currentRoom = nextRoom;
            }
            else {
                System.out.println(dispcont.displayConten(currentRoom));
                pick = keyboard.nextLine();
            }

            roomCounter=moveDirct.roomCounterMethod();

        }
        System.out.println(dispcont.ghostFollow());
        System.out.println("you have been in " + roomCounter + " rooms");



    }


}


