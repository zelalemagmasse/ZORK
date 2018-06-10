package com.company;

public class ParlorRoom {
    private String direction;
    private double moneyInTheRoom;

    public ParlorRoom(double moneyInTheRoom) {
        this.moneyInTheRoom = moneyInTheRoom;
    }

    public double getMoneyInTheRoom() {
        return moneyInTheRoom;
    }

    public void setMoneyInTheRoom(double moneyInTheRoom) {
        this.moneyInTheRoom = moneyInTheRoom;
    }

    public ParlorRoom(String direction){
        this.direction=direction;

    }
    public String displayNextRoom(){
        String nextRoom=new String();
        switch (direction){
            case "south":nextRoom="kitchen room";
                break;
            case"west":nextRoom="vault room";
                break;

        }
        return nextRoom;
    }
}
