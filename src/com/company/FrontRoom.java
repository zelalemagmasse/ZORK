package com.company;

public class FrontRoom {
    private String direction;
    private double moneyInTheRoom;

    public void setMoneyInTheRoom(double moneyInTheRoom) {
        this.moneyInTheRoom = moneyInTheRoom;
    }

    public double getMoneyInTheRoom() {
        return moneyInTheRoom;
    }

    public FrontRoom(double moneyInTheRoom) {

        this.moneyInTheRoom = moneyInTheRoom;
    }

    public FrontRoom(String direction){
        this.direction=direction;

    }
    public String displayNextRoom(){
        String nextRoom=new String();
        switch (direction){
            case "south":nextRoom="foyer room";
            break;
            case"west":nextRoom="library room";
            break;
            case "east":nextRoom="kitchen room";
            break;
        }
        return nextRoom;
    }

}
