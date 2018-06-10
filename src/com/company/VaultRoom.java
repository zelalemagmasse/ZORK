package com.company;

import java.util.Random;

public class VaultRoom {
    private String direction;
    private double moneyInTheRoom;

    public VaultRoom(double moneyInTheRoom) {
        this.moneyInTheRoom = moneyInTheRoom;
    }

    public double getMoneyInTheRoom() {
        return moneyInTheRoom;
    }

    public void setMoneyInTheRoom(double moneyInTheRoom) {
        this.moneyInTheRoom = moneyInTheRoom;
    }

    public VaultRoom(String direction){
        this.direction=direction;

    }
    public String displayNextRoom() {
        Random rand = new Random();
        String nextRoom = new String();
        int x = rand.nextInt(4);
        if (x == 0) {
            nextRoom = "secrete room";

        } else {

            nextRoom = "parlor room";
        }
        return nextRoom;

    }
}