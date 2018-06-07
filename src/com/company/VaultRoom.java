package com.company;

import java.util.Random;

public class VaultRoom {
    private String direction;
    public VaultRoom(String direction){
        this.direction=direction;

    }
    public String displayNextRoom() {
        Random rand = new Random();
        String nextRoom = null;
        int x = rand.nextInt(4);
        if (x == 0) {
            nextRoom = "secret room";


            nextRoom = "";
        } else {

            nextRoom = "parlor";
        }
        return nextRoom;

    }
}