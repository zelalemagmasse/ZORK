package com.company;

import java.util.Random;

public class VaultRoom {
    private String direction;
    public VaultRoom(String direction){
        this.direction=direction;

    }
    public String displayNextRoom() {
        Random rand = new Random();
        String nextRoom = new String();
        int x = rand.nextInt(4);
        if (x == 0) {
            nextRoom = "secret room";

        } else {

            nextRoom = "parlor";
        }
        return nextRoom;

    }
}