package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {



    public static void main(String[] args) {
        // write your code herera
        Scanner keyboard = new Scanner(System.in);
        ZorkRooms roomKey = new ZorkRooms();
        System.out.println("You are standing in the foyer of an old house.");
        System.out.println("You see a dead scorpion.");
        System.out.println("You can (north)exit to the north or press Q to quit");
        String pick = keyboard.nextLine();
        String currentRoom = "foyer";

        DisplayContnet dispcont = new DisplayContnet();
        int roomCounter=0;

        while (!pick.equalsIgnoreCase("q")) {

            Move moveDirct = new Move(currentRoom, pick);
            String nextRoom = moveDirct.roomPicker();
            System.out.println(dispcont.displayConten(nextRoom));
            System.out.println(dispcont.ghostFollow());

            System.out.println(nextRoom);
            currentRoom=nextRoom;
            pick = keyboard.nextLine();
            roomCounter=moveDirct.roomCounterMethod();

        }

        System.out.println("you have been in " + roomCounter + " rooms");



    }


}


