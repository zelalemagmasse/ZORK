package com.company;

public class LibraryRoom {
    private String direction;
    private double moneyInTheRoom;

    public double getMoneyInTheRoom() {
        return moneyInTheRoom;
    }

    public LibraryRoom(double moneyInTheRoom) {
        this.moneyInTheRoom = moneyInTheRoom;
    }

    public void setMoneyInTheRoom(double moneyInTheRoom) {
        this.moneyInTheRoom = moneyInTheRoom;
    }

    public LibraryRoom(String direction){
        this.direction=direction;

    }
    public String displayNextRoom(){
        String nextRoom=new String();
        switch (direction){
            case "east":nextRoom="front room";
                break;
            case"north":nextRoom="dining room";
                break;

        }
        return nextRoom;
    }
}
