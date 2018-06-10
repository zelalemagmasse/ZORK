package com.company;

public class DiningRoom {
    private String direction;
    private double moneyInTheRoom;

    public double getMoneyInTheRoom() {
        return moneyInTheRoom;
    }

    public DiningRoom(double moneyInTheRoom) {
        this.moneyInTheRoom = moneyInTheRoom;
    }

    public void setMoneyInTheRoom(double moneyInTheRoom) {

        this.moneyInTheRoom = moneyInTheRoom;
    }



    public DiningRoom(String direction) {
        this.direction = direction;

    }

    public String displayNextRoom() {
        String nextRoom = new String();
        switch (direction) {
            case "south": nextRoom = "library room";
                return nextRoom;
        }
       return nextRoom;
    }
}
